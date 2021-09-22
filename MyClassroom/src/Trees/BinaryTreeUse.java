package Trees;

import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter the left child of " + parentData);
            } else {
                System.out.println("Enter the right child of " + parentData);
            }
        }

        Scanner scn = new Scanner(System.in);
        int rootData = scn.nextInt();

        if (rootData == -1)
            return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild; //connection
        root.right = rightChild;

        return root;
    }

    // Number of Nodes present in Tree
    public static int CountNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;

        int leftNodeCount = CountNodes(root.left);
        int rightNodeCount = CountNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;

    }

    //Sum of Node
    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;

        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        return (root.data + leftSum + rightSum);

    }

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner scn = new Scanner(System.in);
        int rootData = scn.nextInt();

        if (rootData == -1)
            return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild; //connection
        root.right = rightChild;

        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();


        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static void printTree(BinaryTreeNode<Integer> root) {

        if (root == null) return;
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);


        /*System.out.println(root.data);
        if (root.left != null)
            printTree(root.left);
        if (root.right != null)
            printTree(root.right);*/


    }

    public static void main(String[] args) {

//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1); //root data
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);//left
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);//right
//        root.left = rootLeft; //connection  between left and root
//        root.right = rootRight; //connection between right and root
//
//        printTree(root);
//        BinaryTreeNode<Integer>twoRight = new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer>threeLeft = new BinaryTreeNode<Integer>(5);
//
//        rootLeft.right = twoRight;
//        rootRight.left = threeLeft;

        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println("Num node " + CountNodes(root));
    }
}
