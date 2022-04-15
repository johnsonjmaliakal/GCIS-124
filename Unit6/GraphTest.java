public class GraphTest {
    public static void main(String[] args){
        Graph<Character> graph = new AdjacencyGraph<Character>();
        graph.add('A'); 
        graph.add('B');
        graph.add('C');
        graph.add('D');
        graph.add('E');
        graph.add('F');
        graph.add('G');
        graph.add('H');
        graph.add('I');
        graph.add('J');
        graph.add('K');

        graph.connectDirected('A', 'C');
        graph.connectDirected('C', 'H');
        graph.connectDirected('D', 'B');
        graph.connectDirected('E', 'F');
        graph.connectDirected('J', 'I');
        
        graph.connectUndirected('A', 'B');
        graph.connectUndirected('B', 'E');
        graph.connectUndirected('C', 'E');
        graph.connectUndirected('C', 'D');
        graph.connectUndirected('D', 'F');
        graph.connectUndirected('F', 'G');
        graph.connectUndirected('J', 'K');
        graph.connectUndirected('K', 'I');

        
        System.out.println(graph.connected('A','D')); // false
        System.out.println(graph.connected('C','A')); // false
        System.out.println(graph.connected('A','C')); // true
        System.out.println(graph.connected('D','F')); // true
        System.out.println(graph.connected('D','G')); // false
        System.out.println(graph.connected('I','K')); // true

        System.out.println(graph.bfsearch('A', 'C')); // true
        System.out.println(graph.bfsearch('A', 'K')); // false
        System.out.println(graph.bfsearch('A', 'G')); // true

        System.out.println(graph.bfpath('A', 'C'));
        System.out.println(graph.bfpath('A', 'D'));
        System.out.println(graph.bfpath('D', 'A'));
        System.out.println(graph.bfpath('C', 'G'));

        System.out.println(graph.dfsearch('A', 'C')); // true
        System.out.println(graph.dfsearch('A', 'K')); // false
        System.out.println(graph.dfsearch('A', 'G')); // true

    }
}
