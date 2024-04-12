package br.com.fogliato.binarysearch;

// https://www.algoexpert.io/questions/validate-three-nodes
public class ValidateThreeNodes {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    // O(d) time | O(1) space - Where d is the distance between NodeOne and NodeThree
    public static boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        BST searchFromOne = nodeOne;
        BST searchFromThree = nodeThree;
        boolean foundNodeTwo = false;
        while (searchFromOne != null || searchFromThree != null) {
            // Found node3 before node2 starting from node1 OR found node1 before node2 starting from node3
            if ((searchFromOne != null && searchFromOne.value == nodeThree.value)
                    || (searchFromThree != null && searchFromThree.value == nodeOne.value)) {
                return false;
            }

            // Found node 2
            if ((searchFromOne != null && searchFromOne.value == nodeTwo.value) || (searchFromThree != null && searchFromThree.value == nodeTwo.value)) {
                foundNodeTwo = true;
                break;
            }

            // Update searchOne
            if (searchFromOne != null) {
                searchFromOne = nodeTwo.value > searchFromOne.value ? searchFromOne.right : searchFromOne.left;
            }

            // Update searchTwo
            if (searchFromThree != null) {
                searchFromThree = nodeTwo.value > searchFromThree.value ? searchFromThree.right : searchFromThree.left;
            }
        }

        if (foundNodeTwo) {
            BST target = searchFromOne == nodeTwo ? nodeThree : nodeOne;
            return searchForTarget(nodeTwo, target);
        }
        return false;
    }

    private static boolean searchForTarget(BST node, BST target) {
        while (node != null) {
            if (node.value == target.value) {
                return true;
            }
            node = target.value > node.value ? node.right : node.left;
        }
        return false;
    }
}
