public class NodeQueue<E> implements Queue<E> {

    private Node<E> front;
    private Node<E> back;
    private int n;

    public NodeQueue() {
        front = null;
        back = null;
        n = 0;
    }

    @Override
    public void enqueue(E item) {
        if(front==null){ // the queue is empty
            front = new Node<E>(item);
            back = front;
        } else{
            Node<E> oldback = back;
            back = new Node<E>(item);
            oldback.setNext(back);
        }
        n++;
    }

    @Override
    public E dequeue() {
        if(n==0)
           return null;
        E temp = front.getItem();   
        front = front.getNext();
        if(front == null)
            back = null;
        n--;    
        return temp;
    }

    @Override
    public int size() {
        return n;
    }

}
