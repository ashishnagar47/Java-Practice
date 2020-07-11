package Graph;

public class AMGraphClient {
    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph=new AdjacencyMapGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdgeWeight("A","B",1);
        graph.addEdgeWeight("A","C",2); ;
        graph.addEdgeWeight("A","D",4);
        graph.addEdgeWeight("C","D",3);
        graph.display();
        AdjacencyMapGraph<String> graph1=graph.kruskal();
        graph1.display();
    }
}
