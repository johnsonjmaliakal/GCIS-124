import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private E[] items;
    int n;

    public ArrayList(){
        items = (E[]) new Object[2];
    }

    @Override
    public void append(E item) {
        if(n == items.length)
           resize(items.length * 2);
        items[n] = item;
        n++;        
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= n)
            return null;
        else
            return items[index];     
    }

    @Override
    public void set(int index, E item) {
        if(index >= 0 && index < n)
            items[index] = item;    
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void insert(int index, E item) {
        if(index < 0 || index > n)
            return;
        if(n == items.length)
           resize(items.length * 2);
        for(int i= n-1; i>=index; i--)
           items[i+1] = items[i];
        items[index] = item;
        n++;       
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= n)
            return null;
        E tmp = items[index];    
        for(int i= index; i<n-1; i++)
            items[i] = items[i+1];
        items[n-1] = null; // avoid memory loitering
        n--;
        if(n > 2 && n==items.length/4)
            resize(items.length/2);
        return tmp;        
    }

    private void resize(int newCapacity){
        E[] tmp = (E[]) new Object[newCapacity];
        for(int i=0; i<n; i++){
            tmp[i] = items[i];
        }
        items = tmp;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(items, n);
    }
    
}
