package GenericTrees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tree_Level_Wise {

    public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> mq = new ArrayDeque<>();
        mq.add(root);

        Queue<TreeNode<Integer>> cq = new ArrayDeque<>();

        while(mq.size()>0){
            root = mq.remove();
            System.out.println(root.data + " ");

            for(TreeNode<Integer> child : root.children){
                cq.add(child);
            }
            if(mq.size()==0){
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }

    }
}
