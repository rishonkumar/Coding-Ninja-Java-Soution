package Trees;

public class Array_To_BST {

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){

        return Helper(arr , 0 , n-1);
    }

    private static BinaryTreeNode<Integer> Helper(int[] arr, int si, int ei) {

        if(si > ei){
            return null;
        }

        int mid = (si+ei)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

        root.left = Helper(arr, si, mid - 1);
        root.right = Helper(arr, mid+1, ei);
        return root;

    }
}
