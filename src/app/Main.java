package app;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(5);
        graph.addVertex(3);

        graph.addEdge(1, 5);
        graph.addEdge(5, 3);
        graph.addEdge(3, 2);


        System.out.println("Does vertex 1 exist? " + graph.hasVertex(1));
        System.out.println("Does vertex 6 exist? " + graph.hasVertex(6));

        System.out.println();

        System.out.println("Does edge 1 -> 2 exist? " + graph.hasEdge(1, 2));
        System.out.println("Does edge 5 -> 3 exist? " + graph.hasEdge(5, 3));

        System.out.println();

        graph.removeVertex(2);
        System.out.println("After removing vertex 2: ");
        System.out.println("Does vertex 2 exist? " + graph.hasVertex(2));
        System.out.println("Does edge 3 -> 2 exist? " + graph.hasEdge(3, 2));


        graph.removeEdge(1, 5);
        System.out.println("After removing edge 1 -> 4: " + graph.hasEdge(1, 5)); // false

    }
}
