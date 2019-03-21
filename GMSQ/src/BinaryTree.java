public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printPostOrder(node.left);
        printPostOrder(node.right);
    }

    boolean contains(Node node, int value) {

        if (node == null) {
            return false;
        }
        if (node.key == value) {
            return true;
        }

        return contains(node.right, value) || contains(node.left, value);
    }

    Node insert(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }
        if (value < node.key) {
            node.left = insert(node.left, value);
        } else if (value > node.key) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }
        return node;
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    void printInOrder() {
        printInOrder(root);
    }

    boolean contains(int value) {
        return contains(root, value);
    }

    Node insert(int value) {
        return insert(root, value);
    }

    static class Node {
        Node left, right;
        int key;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        bt.printPostOrder();
        System.out.println("\n");
        bt.printInOrder();
        System.out.println("\n");
        bt.printPreOrder();
        System.out.println(bt.contains(4));

        bt.insert(10);
        bt.printPostOrder();
    }

}
