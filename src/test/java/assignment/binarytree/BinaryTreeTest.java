package assignment.binarytree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private final Node rightChildToRight = new Node(6, new Node(8), new Node(9));
    private final Node rightChild = new Node(3, rightChildToRight, new Node(7));
    private final Node leftChild = new Node(2, new Node(4), new Node(5));
    private final Node root = new Node(1, leftChild, rightChild);

    //    트리 구조
    //       1
    //    2      3
    //  4  5   6  7
    //        8 9

    // 4 2 5 1 8 6 9 3 7
    @Test
    @DisplayName("Depth First Search")
    void BinaryTree_DFS(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.dfs(root);
    }

    // 1
    // 2 3
    // 2
    // 3 4 5
    // 3
    // 4 5 6 7
    // 5..6
    // 7 8 9

    // 1 2 3 4 5 6 7 8 9
    @Test
    @DisplayName("Breadth First Search")
    void BinaryTree_BFS(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.bfs(root);
    }

}