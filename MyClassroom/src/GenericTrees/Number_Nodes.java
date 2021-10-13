package GenericTrees;

public class Number_Nodes {

    public static int noumberOfNode(TreeNode<Integer>root){

        int count = 1;

        for(int i=0; i<root.children.size();i++){
            int chidCount = noumberOfNode(root.children.get(i));
            count = count + chidCount;
        }
        return count;
    }
}
