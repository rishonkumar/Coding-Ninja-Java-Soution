package GenericTrees;

public class Height {

    public static int getHeight(TreeNode<Integer> root){

        int height = 0;

        for(TreeNode<Integer> child : root.children){
            int ch = getHeight(child); //for height of the children
            if(ch>height) {
                height = ch; //keep updating if any child height is larger than any
            }
        }
        return 1 + height;
    }

}
