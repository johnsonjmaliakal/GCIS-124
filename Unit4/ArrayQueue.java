public class ArrayQueue<E> implements Queue<E> {

    private E[] items;
    private int front, back;
    private int n;

    public ArrayQueue() {
        front = 0; back = 0; n = 0;
        items = (E[]) new Object[4];
    }

    @Override
    public void enqueue(E item) {
        if(n == items.length)
           resize(items.length * 2);
        items[back] = item;
        back = (back+1) % items.length;
        n++;
    }

    @Override
    public E dequeue() {
        if(n==0)
            return null;
        E tmp = items[front];
        items[front] = null; // avoid memory loitering
        front = (front+1) % items.length;
        n--;
        if(n>2 && n==items.length/4)
            resize(items.length/2);
        return tmp;
    }

    @Override
    public int size() {
        return n;
    }

    private void resize(int newCapacity){
        E[] tmp = (E[]) new Object[newCapacity];
        int i=front;
        for(int k=0; k<n; k++){
            tmp[k] = items[i];
            i = (i+1) % items.length;
        }
        items = tmp;
        front = 0;
        back = n;
    }
    
}
