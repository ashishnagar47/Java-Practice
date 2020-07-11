package Graph;

public class ALGraphClient {
    public static void main(String[] args) {
        AdjacencyListGraph<String> graph = new AdjacencyListGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("C","D");
        //graph.addEdge("A","D");
        graph.addEdge("E","F");

        graph.BFT();
        graph.DFT();
        graph.connectedComp();
        System.out.println(graph.bipartite());

        graph.display();
    }
}
