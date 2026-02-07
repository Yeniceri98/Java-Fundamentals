package sections.sec98_AlgorithmPatterns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeBFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);    // Creates a node with value 1
        root.left = new TreeNode(2);        // Creates a left child with value 2
        root.right = new TreeNode(3);       // Creates a right child with value 3
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        BinaryTreeBFS tree = new BinaryTreeBFS();

        // Level Order Traversal
        System.out.println("Level Order Traversal: " + tree.levelOrderTraversal(root));

        // Minimum Depth
        System.out.println("Minimum Depth: " + tree.minDepth(root));

        // Max Width
        System.out.println("Max Width: " + tree.maxWidth(root));

        // Max Depth (Longest path)
        System.out.println("Max Depth: " + tree.maxDepth(root));
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        return depth;
    }

    public int maxWidth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return maxWidth;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}



/*
    BFS (Breadth-First Search), bir Binary Tree veya graf üzerinde katman katman ilerleyen bir arama algoritmasıdır
    Queue veri yapısını kullanarak ağacın önce en üst seviyesindeki düğümleri, ardından bir sonraki seviyedekileri işler

    BFS Algoritması Ne Zaman Kullanılır?
    Level Order Traversal:	Ağaç seviyelerini sırayla gezmek
    Finding Minimum Depth:	Kökten en yakın yaprağa olan mesafeyi bulmak
    Finding Maximum Width:	En geniş seviyedeki düğüm sayısını bulmak
    Finding Maximum Depth:  Ağacın en uzun yolunu bulmak
*/