package GenericTrees;

public class Number_of_Nodes_Greater {

    public static int numNodeGreater(TreeNode<Integer> root,int x){

        if(root == null) return 0;

        int count = 0;

        if(root.data > x)
            count++;

        for(TreeNode<Integer>child : root.children){
            count=count+numNodeGreater(child,x);
        }
        return count;
    }
}
