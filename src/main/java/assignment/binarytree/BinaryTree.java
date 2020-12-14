package assignment.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeft());
        System.out.print(node.getElement() + " ");
        dfs(node.getRight());
    }


    public void bfs(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            traverse(queue);
        }
    }

    private void traverse(Queue<Node> queue) {
        Node poll = queue.poll();
        if (poll != null){
            System.out.print(poll.getElement() + " ");
            getChild(queue, poll.getLeft());
            getChild(queue, poll.getRight());
        }
    }

    private void getChild(Queue<Node> queue, Node child) {
        if (child != null) {
            queue.add(child);
        }
    }
}
