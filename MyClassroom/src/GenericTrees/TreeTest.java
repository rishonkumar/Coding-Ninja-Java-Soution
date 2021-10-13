package GenericTrees;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class TreeTest {

    //Inorder
    public static void printTree(TreeNode<Integer>root) {

        if(root == null) return; //special case not a base case
        System.out.print(root.data + " ");
        for(int i=0 ; i<root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }


    public static void printTreeBetter(TreeNode<Integer>root) {

        if(root == null)
            return; //special case not a base case

        System.out.print(root.data + ": ");
        for(int i=0; i<root.children.size(); i++){
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();
        for(int i=0 ; i<root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);
            printTreeBetter(child);
        }
    }



    //Taking input

    public static TreeNode<Integer> takeInput() throws QueueEmptyException {
        Scanner scn = new Scanner(System.in);
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data");

        int rootData = scn.nextInt();
        if(rootData == -1)
            return null;

        TreeNode<Integer>root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {

            TreeNode<Integer> front = pendingNodes.dequeue();
            System.out.println("Enter number of children for: " + rootData);
            int numChild = scn.nextInt();
            for (int i = 0; i < numChild; i++) {
                System.out.println("Enter the " + i + "th child data for : " + front.data);
                int childData = scn.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        } return root;
    }

    public static void main(String[] args) throws QueueEmptyException {

//        TreeNode<Integer>root = new TreeNode<>(4);
//        TreeNode<Integer>node1 = new TreeNode<>(2);
//        TreeNode<Integer>node2 = new TreeNode<>(3);
//        TreeNode<Integer>node3 = new TreeNode<>(1);
//        TreeNode<Integer>node4 = new TreeNode<>(5);
//        TreeNode<Integer>node5 = new TreeNode<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//        node2.children.add(node5);
//
//        printTree(root);
//        System.out.println();
        TreeNode<Integer>root = takeInput();
        printTreeBetter(root);
    }
}
