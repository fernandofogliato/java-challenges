package br.com.fogliato;

import java.util.*;

public class Dijkstra {

    private static class Graph {
        private Map<Integer, Node> nodes;

        public Graph(int numberOfNodes) {
            this.nodes = new HashMap<>(numberOfNodes);

            for (int i = 0; i < numberOfNodes; i++) {
                Node node = new Node();
                this.nodes.put(i, node);
            }
        }

        public void addEdge(int origin, int destination) {
            Node nodeOrigin = this.nodes.get(origin);
            Node nodeDestination = this.nodes.get(destination);
            nodeOrigin.addDestination(nodeDestination, 6);
        }
    }

    private static class Node {
        private List<Node> shortestPath = new LinkedList<>();
        private Integer distance = Integer.MAX_VALUE;
        Map<Node, Integer> adjacentNodes = new HashMap<>();

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        public List<Node> getShortestPath() {
            return shortestPath;
        }

        public Integer getDistance() {
            return distance;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setShortestPath(List<Node> shortestPath) {
            this.shortestPath = shortestPath;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
            this.adjacentNodes = adjacentNodes;
        }
    }

    public static int[] calculateShortestPathFromSource(Graph graph, int startNodeId) {
        Node startNode = graph.nodes.get(startNodeId);
        startNode.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(startNode);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            currentNode.getAdjacentNodes().forEach((adjacentNode, edgeWeight) -> {
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            });
            settledNodes.add(currentNode);
        }
        return startNode.getAdjacentNodes().keySet().stream().mapToInt(Node::getDistance).toArray();
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode,
                                                 Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {

            int numberOfNodes = scanner.nextInt();
            int numberOfEdges = scanner.nextInt();

            Graph graph = new Graph(numberOfNodes);
            for (int j = 0; j < numberOfEdges; j++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                graph.addEdge(u, v);
            }

            int startId = scanner.nextInt() - 1;
            int[] distances = Dijkstra.calculateShortestPathFromSource(graph, startId);

            System.out.println("");
            for (int k = 0; k < distances.length; k++) {
                System.out.print(distances[i]);
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
