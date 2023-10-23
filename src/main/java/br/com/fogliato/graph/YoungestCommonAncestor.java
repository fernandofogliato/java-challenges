package br.com.fogliato.graph;

// https://www.algoexpert.io/questions/youngest-common-ancestor
public class YoungestCommonAncestor {

    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor,
            AncestralTree descendantOne,
            AncestralTree descendantTwo
    ) {
        int descendantOneDeep = getDeep(topAncestor, descendantOne);
        int descendantTwoDeep = getDeep(topAncestor, descendantTwo);

        int deepDiff = Math.abs(descendantOneDeep - descendantTwoDeep);
        AncestralTree ancestor = descendantOneDeep > descendantTwoDeep ? descendantOne : descendantTwo;
        while (deepDiff > 0) {
            ancestor = ancestor.ancestor;
            deepDiff--;
        }
        if (descendantOneDeep > descendantTwoDeep) {
            return getCommonAncestor(topAncestor, ancestor, descendantTwo);
        }
        return getCommonAncestor(topAncestor, descendantOne, ancestor);
    }

    private static AncestralTree getCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        AncestralTree ancestor1 = descendantOne;
        AncestralTree ancestor2 = descendantTwo;
        while (ancestor1 != null && ancestor2 != null && ancestor1.name != ancestor2.name) {
            ancestor1 = ancestor1.ancestor;
            ancestor2 = ancestor2.ancestor;
        }
        return ancestor1 == null ? topAncestor : ancestor1;
    }

    private static int getDeep(AncestralTree topAncestor, AncestralTree descendant) {
        int deep = 1;
        AncestralTree ancestor = descendant.ancestor;
        while (ancestor != null && ancestor.name != topAncestor.name) {
            deep++;
            ancestor = ancestor.ancestor;
        }
        return deep;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
