package Trees;

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class Max_Min_Binary_Tree {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

        if(root == null){
            return new Pair<>(Integer.MAX_VALUE , Integer.MIN_VALUE);
        }

        Pair<Integer,Integer>leftPair = getMinAndMax(root.left);
        Pair<Integer,Integer>rightPair = getMinAndMax(root.right);

        int min = Math.min(root.data , Math.min(leftPair.minimum, rightPair.minimum));
        int max = Math.max(root.data , Math.max(leftPair.maximum, rightPair.maximum));

        return new Pair<>(min,max);
    }

    public void findMinMax(BinaryTreeNode<Integer>root){

        if(root==null) return;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(root.data > max){
            max = root.data;
        }

        if(root.data<min){
            min = root.data;
        }

        findMinMax(root.left);
        findMinMax(root.right);
    }
}
