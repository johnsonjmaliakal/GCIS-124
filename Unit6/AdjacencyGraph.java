import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjacencyGraph<E> implements Graph<E> {

    private Map<E,Vertex<E>> vertices;

    public AdjacencyGraph(){
        vertices = new HashMap<E,Vertex<E>>();
    }

    @Override
    public void add(E value) {
        vertices.put(value, new Vertex<E>(value));
        
    }

    @Override
    public boolean contains(E value) {
        return vertices.containsKey(value);
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public void connectDirected(E a, E b) {
        Vertex<E> va = vertices.get(a);
        Vertex<E> vb = vertices.get(b);
        va.connect(vb);
    }

    @Override
    public void connectUndirected(E a, E b) {
        Vertex<E> va = vertices.get(a);
        Vertex<E> vb = vertices.get(b);
        va.connect(vb);
        vb.connect(va);
    }

    @Override
    public boolean connected(E a, E b) {
        Vertex<E> va = vertices.get(a);
        Vertex<E> vb = vertices.get(b);
        return va.connected(vb);
    }

    @Override
    public boolean bfsearch(E start, E end) {
        Queue<Vertex<E>> q = new LinkedList<Vertex<E>>();
        Set<Vertex<E>> marked = new HashSet<Vertex<E>>();
        
        Vertex<E> v = vertices.get(start);
        q.add(v);
        while(!q.isEmpty()){
            v = q.remove();
            if(v.getValue().equals(end))
                return true;
                
            for(Vertex<E> w : v.getNeighbors()){
                if(!marked.contains(w)){
                    q.add(w);
                    marked.add(w);
                }
            }
        }
        return false;
    }

    @Override
    public List<E> bfpath(E start, E end) {
        Queue<Vertex<E>> q = new LinkedList<Vertex<E>>();
        Map<Vertex<E>,Vertex<E>> predecessors = new HashMap<Vertex<E>,Vertex<E>>(); 
        
        Vertex<E> v = vertices.get(start);
        predecessors.put(v, null);
        q.add(v);
        while(!q.isEmpty()){
            v = q.remove();
            if(v.getValue().equals(end))
                return makePath(end, predecessors);

            for(Vertex<E> w : v.getNeighbors()){
                if(!predecessors.containsKey(w)){
                    q.add(w);
                    predecessors.put(w, v);
                }
            }
        }
        return null;
    }
    
    private List<E> makePath(E end, Map<Vertex<E>,Vertex<E>> predecessors){
        Vertex<E> v = vertices.get(end);
        if(!predecessors.containsKey(v))
            return null;
        List<E> path = new LinkedList<E>();
        while(v !=null){
            path.add(0, v.getValue());
            v = predecessors.get(v);
        }
        return path;
    }

    @Override
    public boolean dfsearch(E start, E end) {
        Set<Vertex<E>> visited = new HashSet<Vertex<E>>();
        Vertex<E> v = vertices.get(start);
        visitDFS(v, visited);
        return visited.contains(vertices.get(end));
    }

    private void visitDFS(Vertex<E> v, Set<Vertex<E>> visited){
        visited.add(v);
        for(Vertex<E> w: v.getNeighbors()){
            if(!visited.contains(w))
                visitDFS(w, visited);
        }
    }

}
