package GenericTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_children_node_max {


    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){

        if(root==null)
            return null;

        TreeNode<Integer> maxSum=null;
        int total = 0;
        Queue<TreeNode<Integer>>pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        //now have to push the children and delete the top most element
        while(pendingNodes.size()!=0){
            TreeNode<Integer>curr = pendingNodes.peek(); //add top element in queue
            pendingNodes.remove();
            int sum = curr.data;
            for(int i=0 ; i<curr.children.size();i++){
                sum+=curr.children.get(i).data;
                pendingNodes.add(curr.children.get(i)); //push the children
            }
            if(sum > total){
                total=sum;
                maxSum = curr;
            }
        }
        return maxSum;

    }
}
