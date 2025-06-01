package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    Map<Integer, List<Integer>> graph = new HashMap<>();

    void addVertex(int vertex) {
        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
        }
    }

    void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        graph.get(source).add(destination);
    }


    void removeVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            graph.remove(vertex);

            for (List<Integer> n : graph.values()) {
                n.remove(Integer.valueOf(3));
            }

        }

    }

}