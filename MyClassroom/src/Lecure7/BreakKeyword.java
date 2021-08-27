package Lecure7;

public class BreakKeyword {
    public static void main(String[] args) {

        int n=5;

        for(int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j){
                    break;
                }
                System.out.print(j + "");
            }
            System.out.println();
        }
        /*while (i<=n){
            if(i == 4) break;
            System.out.println(i);
            i++;
        }
        System.out.println("Outside while");*/
    }
}
