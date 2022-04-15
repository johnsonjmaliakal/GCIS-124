import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;

    public Vertex(E value){
        this.value = value;
        neighbors = new HashSet<Vertex<E>>();
    }

    public E getValue() {
        return value;
    }

    public Set<Vertex<E>> getNeighbors() {
        return neighbors;
    }

    public void connect(Vertex<E> e){
        neighbors.add(e);
    }

    public boolean connected(Vertex<E> e){
        return neighbors.contains(e);
    }

    @Override
    public String toString() {
        return "Vertex [value=" + value + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
           return true;
        if(obj==null || !(obj instanceof Vertex))
           return false;
        Vertex<E> other = (Vertex<E>) obj;
        return this.value.equals(other.equals(obj));      
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
