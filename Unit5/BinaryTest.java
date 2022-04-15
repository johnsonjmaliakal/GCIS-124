public class BinaryTest {
    public static void main(String[] args){
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node9 = new BinaryNode(9);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node6 = new BinaryNode(6);

        node2.setLeft(node3);
        node2.setRight(node7);
        node3.setLeft(node9);
        node3.setRight(node4);
        node7.setLeft(node1);
        node7.setRight(node6);

        System.out.println(node2.infexTraversal());
        System.out.println(node2.search(6));
        System.out.println(node2.search(8));
    }
}
