
#include <vector>
using namespace std;

class Solution {
    
public:
    vector<int> findSmallestSetOfVertices(int totalNodes, vector<vector<int>>& edges) {
        vector <bool> nodeHasIncomingEdges(totalNodes);
        for (const auto& edge : edges) {
            nodeHasIncomingEdges[edge[1]] = true;
        }

        vector<int> smallestSetOfVertices;
        for (int i = 0; i < totalNodes; i++) {
            if (nodeHasIncomingEdges[i] == false) {
                smallestSetOfVertices.push_back(i);
            }
        }
        return smallestSetOfVertices;
    }
};
