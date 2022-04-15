public class ArrayStack<E> implements Stack<E> {
    private List<E> lst;
    public ArrayStack(){
        lst = new ArrayList<E>();
    }
    
    @Override
    public void push(E item) {
        lst.append(item);
    }

    @Override
    public E pop() {
        return lst.remove(lst.size()-1);
    }

    @Override
    public int size() {
        return lst.size();
    }
}
