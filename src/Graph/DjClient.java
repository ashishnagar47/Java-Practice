package Graph;

public class DjClient {
    public static void main(String[] args) {
    Djikshtra<String> g=new Djikshtra<String>();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        g.addVertex("F");
        g.addVertex("G");


        g.addEdge("A", "B", 5);
        g.addEdge("A", "D", 6);
        g.addEdge("B", "C", 3);
        g.addEdge("C", "D", 2);
        g.addEdge("D", "E", 9);
        g.addEdge("E", "F", 1);
        g.addEdge("E", "G", 4);
        g.addEdge("F", "G", 7);
        g.dijkstra("D");

}
}
