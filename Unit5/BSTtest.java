public class BSTtest {
    public static void main(String[] args){
        BinaryNode root = new BinaryNode(5);
        root.binaryInsert(2);
        root.binaryInsert(1);
        root.binaryInsert(3);
        root.binaryInsert(7);
        root.binaryInsert(6);
        root.binaryInsert(9);

        System.out.println(root.infexTraversal());
        System.out.println(root.binarySearch(6));
        System.out.println(root.binarySearch(9));
        System.out.println(root.binarySearch(8));
        System.out.println(root.binarySearch(0));
    }
}
