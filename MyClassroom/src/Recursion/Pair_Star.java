package Recursion;

public class Pair_Star {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        String input="abaacaa";
        System.out.println(addStars(input));
    }

    public static String addStars(String s) {
        if (s.length() <= 1) return s;
        String smallOutput = addStars(s.substring(1));
        if(s.charAt(0)==s.charAt(1)){

            return s.charAt(0)+"*"+smallOutput;
        }
        else{
            return s.charAt(0)+smallOutput;
        }
    }
}
