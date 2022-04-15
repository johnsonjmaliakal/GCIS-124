public class QueueTest {
    public static void main(String[] args){
        Queue<Integer> queue = new NodeQueue<Integer>();
        queue.enqueue(911);
        queue.enqueue(808);
        queue.enqueue(333);
        queue.enqueue(755);
        System.out.println(queue.size()); 
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size()); 
    }
}
