import java.util.*;

public class diameterOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.max(lh, rh) + 1);
    }

    public static int diameter2(Node root) { // O(N^2)
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter2(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter2(root.right);
        int rightHeight = height(root.right);
        int selfDiameter = (leftHeight + rightHeight + 1);
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), (leftInfo.ht + rightInfo.ht + 1));
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static void main(String args[]) {
        /*
         * 1
         * / \
         * 2 3
         * /\ /\
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of Tree is : " + diameter2(root));
        System.out.println("Diameter of Tree is : " + diameter(root).diam);

        /*
         * 2
         * / \
         * 4 5
         * 
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("isSubtree : " + isSubtree(root, subRoot));

    }
}
