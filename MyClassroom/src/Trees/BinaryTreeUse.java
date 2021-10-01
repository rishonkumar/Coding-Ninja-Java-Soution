package Trees;

import java.util.LinkedList;
import java.util.Queue;
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

    //preOrder Printing
    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

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

    public static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int siPre, int eiPr, int siIn, int eiIn) {
        if (siPre > eiPr) {
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        //To find index of root in INORDER

        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        // I am assuming that root actually is present in inorder
        int siPreLeft = siPre + 1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;

        int siInRight = rootIndex + 1;
        int eiPreRight = eiPr;
        int eiInRight = eiIn;

        int leftSubTreeLength = eiInLeft - siInLeft + 1;

        int eiPreLeft = siPreLeft + leftSubTreeLength -1;
        int siPreRight = eiPreLeft+1;

        BinaryTreeNode<Integer> left = helper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiPreLeft);
        BinaryTreeNode<Integer> right = helper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int pre[], int in[]) {
        BinaryTreeNode<Integer> root = helper(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return root;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = takeInputLevelWise();


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

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println("Num node " + CountNodes(root));
    }
}
