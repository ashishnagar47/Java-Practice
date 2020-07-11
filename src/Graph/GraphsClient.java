package Graph;

import java.util.HashMap;

public class GraphsClient {
    public static void main(String[] args) {
        Graphs graph=new Graphs();
        graph.addvertex("A");
        graph.addvertex("B");
        graph.addvertex("C");
        graph.addvertex("D");
        graph.addvertex("E");
        graph.addvertex("F");
        graph.addvertex("G");

        graph.addEdges("A","B",2);
        graph.addEdges("A","D",4);
        graph.addEdges("B","C",1);
        graph.addEdges("C","D",3);
        graph.addEdges("D","E",7);
        graph.addEdges("E","F",5);
        graph.addEdges("E","G",4);
        graph.addEdges("G","F",3);
        graph.removeVertex("E");

        graph.display();
        System.out.println(graph.HasPath("A","F",new HashMap<>()));
        System.out.println( graph.containEdges("A","B"));
        System.out.println(graph.numVertex());
        System.out.println(graph.numEdges());

    }
}
