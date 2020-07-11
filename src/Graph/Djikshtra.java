package Graph;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Djikshtra<T> {
    private HashMap<T, Vertex> vertices;

    class Vertex{

        T value;
        Map<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new HashMap<>();
        }
    }

    public Djikshtra() {
        vertices = new HashMap<>();
    }

    public void addVertex(T vname) {
        vertices.put(vname, new Vertex(vname));
    }

    public void addEdge(T v1, T v2, int weight) {
        if (!vertices.containsKey(v1) || !vertices.containsKey(v2)) {
            return;
        }
        this.vertices.get(v1).neighbours.put(new Vertex(v2), weight);
        this.vertices.get(v2).neighbours.put(new Vertex(v1), weight);
    }

    public class DjPair implements Comparable<DjPair> {
        int cost;
        T byVertex;
        T endVertex;

        DjPair(T acquirer, T vertex, int cost) {
            this.byVertex = acquirer;
            this.endVertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(DjPair o) {
            return this.cost - o.cost;
        }
    }

    public void dijkstra(T source) {
        HashMap<T, DjPair> map = new HashMap<>();
        PriorityQueue<DjPair> minheap = new PriorityQueue<>();
        Set<T> allvertices = this.vertices.keySet();

        /* Saare vertices pe traverse kar rhe hain and if it is the same
         as source toh usme cost 0 daal rehe hain nhi toh infinity */
        for (T key : allvertices) {
            DjPair d;
            if (key.equals(source)) {
                d = new DjPair(null, key, 0);
            } else {
                d = new DjPair(null,key, Integer.MAX_VALUE);
            }

            //saare DjPair of vertices heap mein add kar de rhe hain
            minheap.add(d);
            map.put(key, d);
        }

        //Heap mein traverse kar rhe hain
        while (!minheap.isEmpty()) {
            //Minimum DjPair on the basis of cost remove karenge
            DjPair current = minheap.remove();
            map.remove(current.endVertex);

            /* Us pair ke 2nd vertex ya keh lo connected
             vertex ko aur uski cost ko print kar dia */
            System.out.println(current.endVertex +"->"+current.cost);

            /* Ab jis vertex ko print kia uske saare neighbouring vertex
            ki cost jaake update kar do, means ki agar mai uski neighbouring
             vertex pe is vertex ke through jaaun toh kya cost hogi */
            Set<Vertex> neighbour = vertices.get(current.endVertex).neighbours.keySet();
            for (Vertex padosi : neighbour) {
                if (map.containsKey(padosi.value)) {
                    DjPair pair = map.get(padosi.value);
                    int oldcost = pair.cost;
                    /* source se current vertex tak ka cost + current vertex se padosi tak jaane ka cost */
                    int newcost = current.cost + vertices.get(current.endVertex).neighbours.get(padosi);
                    if (newcost < oldcost) {
                        /* Heap se pichla cost vala pair remove kar
                        do kyunki naya cost jaada chhota hai ab */
                        minheap.remove(map.get(padosi.value));

                        // Naya pair banao naye cost ke saath aur heap mein add kar do
                        pair.cost = newcost;
                        pair.byVertex = current.endVertex;
                        map.put(padosi.value, pair);
                        minheap.add(pair);
                    }
                }
            }
        }

    }


}
