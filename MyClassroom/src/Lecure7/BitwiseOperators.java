package Lecure7;

public class BitwiseOperators {
    public static void main(String[] args){
        int a=10;
        int b=2;

        int c=a&b;
        System.out.println(c);

        int d=a|b;
        System.out.println(d);

        int e=a^b;
        System.out.println(e);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a<<1);
        System.out.println(a>>1);
        System.out.println(a>>2);

    }
}
