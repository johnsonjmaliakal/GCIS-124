import java.util.List;

public interface Graph<E> {
    public void add(E value);
    public boolean contains(E value);
    public int size();
    public void connectDirected(E a, E b);
    public void connectUndirected(E a, E b);
    public boolean connected(E a, E b);
    public boolean bfsearch(E start, E end);
    public List<E> bfpath(E start, E end);
    public boolean dfsearch(E start, E end);
}
