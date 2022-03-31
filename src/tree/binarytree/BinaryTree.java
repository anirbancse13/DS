package tree.binarytree;

import java.util.List;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(List<T> elements) {
        int size = elements.size();
        int index = 0;
        root = createTree(elements, root, index, size);
        System.out.println("In Order Traversal---: ");
        inOrderTraversal(root);
        System.out.println("");
        System.out.println("Pre Order Traversal---: ");
        preOrderTraversal(root);
        System.out.println("");
        System.out.println("Post Order Traversal---: ");
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" " + root.data);
    }

    private void preOrderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void inOrderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(" " + root.data);
        inOrderTraversal(root.right);
    }

    private Node<T> createTree(List<T> elements, Node<T> root, int index, int size) {
        if (index < size) {
            //Insert root node
            root = new Node<>(elements.get(index));

            //Insert left child
            root.left = createTree(elements, root.left, (2 * index) + 1, size);

            //Insert right child
            root.right = createTree(elements, root.right, (2 * index) + 2, size);
        }

        return root;
    }
}

class Node<T> {
    T data;
    Node<T> left = null;
    Node<T> right = null;

    Node(T data) {
        this.data = data;
    }
}
