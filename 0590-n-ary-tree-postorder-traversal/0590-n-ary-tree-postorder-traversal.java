/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// left and right nodes are not already declared in boiler plate children nodes are declared so we will use children node 

class Solution {
    public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<>();
        if (root != null) {
            postorderTraversal(root, result);
        }
        return result;
    }

    private void postorderTraversal(Node node, List<Integer> result) {
        if (node == null)
            return;

        // Recursively traverse children first
        if (node.children != null) {
            for (Node child : node.children) {
                postorderTraversal(child, result);
            }
        }

        // Visit the root after visiting children
        result.add(node.val);
    }
}
