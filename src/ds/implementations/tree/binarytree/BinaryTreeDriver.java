package ds.implementations.tree.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeDriver {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data = Arrays.asList(2,4,1,7,null,8,3);
        BinaryTree<Integer> binaryTree = new BinaryTree<>(data);
    }
}
