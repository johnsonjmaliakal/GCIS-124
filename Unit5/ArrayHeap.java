import java.util.Arrays;

public class ArrayHeap implements Heap {
    private int[] array;
    private int n;

    public ArrayHeap(){
        array = new int[3];
        n = 0;
    }

    @Override
    public void add(int value) {
        if(n == array.length)
            resize(array.length * 2);
        array[n] = value;
        int k = n;
        int p = (k-1)/2;
        while(k > 0 && array[p] > array[k]){
            swap(k,p);
            k = p;
            p = (k-1)/2;
        }
        n++;
    }

    private void resize(int newCapacity){
        array = Arrays.copyOf(array, newCapacity);
    }

    private void swap(int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public int remove() {
        int tmp = array[0];
        array[0] = array[n-1];
        array[n-1] = 0;
        n--;
        int k = 0;
        while(2*k+1 < n){
            int minChild = 2*k+1;
            if(2*k+2 < n && array[2*k+2] < array[2*k+1])
                minChild = 2*k+2;
            if(array[k] < array[minChild])
                break;
            swap(k,minChild);    
            k = minChild;   
        }
        if(n>3 && n==array.length/4)
            resize(array.length/2);
        return tmp;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public String toString() {
        return "ArrayHeap [" + Arrays.toString(array) + "]";
    }
}
