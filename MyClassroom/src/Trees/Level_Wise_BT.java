package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Wise_BT {

    //INPUT LEVEL WISE
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = scn.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = scn.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of " + front.data);
            int right = scn.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    //Print Level Wise

    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
            if (frontNode == null) {
                System.out.println();

                if (!pendingNodes.isEmpty()) {
                    pendingNodes.add(null);
                }
            } else {
                System.out.print(frontNode.data + ":L:");

                if (frontNode.left != null) {
                    pendingNodes.add(frontNode.left);
                    System.out.print(frontNode.left.data + ",R:");
                } else {
                    System.out.print(-1 + ",R:");
                }

                if (frontNode.right != null) {
                    pendingNodes.add(frontNode.right);
                    System.out.println(frontNode.right.data);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }

}
