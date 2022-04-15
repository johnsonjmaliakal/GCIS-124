public interface Queue<E> {
    public void enqueue(E Item);
    public E dequeue();
    public int size();
}
