package Array2d;

public class Store2Darrays {
    public static void main(String[] args) {
        int [][] arr2d = {{1,2,3,4},{4,5,6,7},{8,9,0,12}};
        System.out.println(arr2d);
        System.out.println(arr2d[0]);
        System.out.println(arr2d[1]);

        System.out.println(arr2d.length); //3 (no of rows)
        System.out.println(arr2d[0].length); //4 (now of cols)
    }
}
