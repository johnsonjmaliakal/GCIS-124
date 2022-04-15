public class HeapTest {
    public static void main(String[] args){
        Heap heap = new ArrayHeap();
        heap.add(21);
        heap.add(10);
        heap.add(7);
        heap.add(43);
        heap.add(66);
        heap.add(50);
        heap.add(60);
        heap.add(68);
        heap.add(24);
        System.out.println(heap);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap);

    }
}
