package Trees;


public class Elements_Range_K1_K2 {

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer>root, int k1, int k2){

        // TC - O(n)
        if(root ==  null){
            return;
        }

        if(root.data < k1){
            elementsInRangeK1K2(root.right,k1,k2);
        }

        else if(root.data > k2){
            elementsInRangeK1K2(root.left,k1,k2);
        }
        else{
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right,k1,k2);
        }
    }
}
