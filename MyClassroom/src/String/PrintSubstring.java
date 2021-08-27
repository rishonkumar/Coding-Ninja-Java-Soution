package String;

public class PrintSubstring {

    public static void SubstringsPrint(String str){

        int n=str.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static void SubstringsPrint2(String str){

        int n=str.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }

}
