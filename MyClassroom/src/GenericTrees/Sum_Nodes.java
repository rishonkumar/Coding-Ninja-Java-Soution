package GenericTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_Nodes {

    public static int sumOfAllNode(TreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        int sum = 0;

        int n = root.children.size();
        for(int i=0 ; i<n;i++){
            sum += sumOfAllNode(root.children.get(i));
        }
        return root.data+sum;
    }

    //M<ethod 2

    public static int sumOfAllNode2(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum=0;
        Queue<TreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            while(n>0){
                TreeNode<Integer> node=q.peek();
                q.poll();
                sum=sum+node.data;
                for(int i=0;i<node.children.size();i++){
                    q.add(node.children.get(i));
                }
                n--;
            }
        }
        return sum;
    }
}
