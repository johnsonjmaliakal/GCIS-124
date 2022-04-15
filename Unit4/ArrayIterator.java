import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    
    private E[] items;
    private int size;
    private int i;
    public ArrayIterator(E[] items, int size) {
        this.items = items;
        this.size = size;
    }
    @Override
    public boolean hasNext() {
        return i < size;
    }
    @Override
    public E next() {
        E tmp = items[i];
        i++;
        return tmp;
    }

    
}
