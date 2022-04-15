public class StackTest {
    public static void main(String[] args){
        Stack<String> stk = new ArrayStack<String>();
        stk.push("John");
        stk.push("Mike");
        stk.push("Michelle");
        System.out.println(stk.size()); // 3
        System.out.println(stk.pop()); // Michelle
        System.out.println(stk.size()); // 2
        System.out.println(stk.pop()); // Mike
        System.out.println(stk.pop()); // John
    }
}
