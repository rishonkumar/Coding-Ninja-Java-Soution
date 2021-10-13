package GenericTrees;

public class Contains_X {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        if(root == null) return false;

        if(root.data == x)
            return true;

        for(int i=0 ; i<root.children.size() ; i++){

            boolean check = checkIfContainsX(root.children.get(i) , x);
            if(check)
                return true;
        }

        return false;
    }

    public static boolean checkContainsX2(TreeNode<Integer> root , int x){
        if(root == null) return false;

        if(root.data == x)
            return true;

        for(TreeNode<Integer>child : root.children){

            if(checkContainsX2(child,x))
                return true;
        }
        return false;
    }
}
