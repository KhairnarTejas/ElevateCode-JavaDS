public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        root.data = root.left.data + leftChild + root.right.data + rightChild;
        return data;
    }