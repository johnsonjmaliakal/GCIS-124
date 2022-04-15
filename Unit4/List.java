
public interface List<E> extends Iterable<E> {
    public void append(E item);
    public E get(int index);
    public void set(int index, E item);
    public int size();
    public void insert(int index, E item);
    public E remove(int index);
}
