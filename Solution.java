
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findSmallestSetOfVertices(int totalNodes, List<List<Integer>> edges) {
        boolean[] nodeHasIncomingEdges = new boolean[totalNodes];
        for (List<Integer> edge : edges) {
            nodeHasIncomingEdges[edge.get(1)] = true;
        }

        List<Integer> smallestSetOfVertices = new ArrayList<>();
        for (int i = 0; i < totalNodes; i++) {
            if (nodeHasIncomingEdges[i] == false) {
                smallestSetOfVertices.add(i);
            }
        }
        return smallestSetOfVertices;
    }
}
