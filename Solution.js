
/**
 * @param {number} totalNodes
 * @param {number[][]} edges
 * @return {number[]}
 */
var findSmallestSetOfVertices = function (totalNodes, edges) {
    const nodeHasIncomingEdges = new Array(totalNodes).fill(false);
    for (let edge of edges) {
        nodeHasIncomingEdges[edge.get(1)] = true;
    }

    const smallestSetOfVertices = [];
    for (let i = 0; i < totalNodes; i++) {
        if (nodeHasIncomingEdges[i] === false) {
            smallestSetOfVertices.add(i);
        }
    }
    return smallestSetOfVertices;
};
