package Dijkstra;

/**
 *
 * @author bbbvv
 */
public class Dijkstra {

    public static void main(String[] args) {
        Graph g = new Graph();
        int[][] b = {
            {0, 7, 9, 99, 99, 14},
            {7, 0, 10, 15, 99, 99},
            {9, 10, 0, 11, 99, 2},
            {99, 15, 11, 0, 6, 99},
            {99, 99, 99, 6, 0, 9},
            {14, 99, 2, 99, 9, 0}
        }; // add matrix
        g.setData(b);
        g.dispAdj();
        System.out.println("\nTest Dijkstra's shortest path algorithm: ");
        g.dijikstra(0, 4);
        System.out.println();
    }
}
