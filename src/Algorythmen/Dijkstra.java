/*
Dijkstra-Algorithmus
Hier ist eine Java-Implementierung des Dijkstra-Algorithmus.
Dieser Algorithmus verwendet eine Prioritätswarteschlange (PriorityQueue) zur effizienten Verwaltung der Knoten.
* */
package Algorythmen;

import java.util.*;

class Node implements Comparable<Node> {
    public final String name;
    public List<Edge> adjacencies = new ArrayList<>();
    public double minDistance = Double.POSITIVE_INFINITY;
    public Node previous;

    public Node(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Node other) {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge {
    public final Node target;
    public final double weight;

    public Edge(Node target, double weight) {
        this.target = target;
        this.weight = weight;
    }
}

public class Dijkstra {
    public static void computePaths(Node source) {
        source.minDistance = 0.0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(source);

        while (!priorityQueue.isEmpty()) {
            Node u = priorityQueue.poll();

            for (Edge e : u.adjacencies) {
                Node v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    priorityQueue.remove(v);
                    v.minDistance = distanceThroughU;
                    v.previous = u;
                    priorityQueue.add(v);
                }
            }
        }
    }

    public static List<Node> getShortestPathTo(Node target) {
        List<Node> path = new ArrayList<>();
        for (Node node = target; node != null; node = node.previous) {
            path.add(node);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        nodeA.adjacencies = Arrays.asList(new Edge(nodeB, 10), new Edge(nodeC, 3));
        nodeB.adjacencies = Arrays.asList(new Edge(nodeD, 2));
        nodeC.adjacencies = Arrays.asList(new Edge(nodeB, 1), new Edge(nodeD, 8));
        nodeD.adjacencies = Arrays.asList(new Edge(nodeE, 7));
        nodeE.adjacencies = Arrays.asList(new Edge(nodeD, 9));

        computePaths(nodeA);

        System.out.println("Distance to " + nodeD + ": " + nodeD.minDistance);
        List<Node> path = getShortestPathTo(nodeD);
        System.out.println("Path: " + path);
    }
}
