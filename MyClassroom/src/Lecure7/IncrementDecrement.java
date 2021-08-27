package Lecure7;

public class IncrementDecrement {
    public static void main(String[] args){
        int a=60;//60
        int b=a++;
        System.out.println(a); //61
        System.out.println(b); //60

        /*int c = 60 , d=80;
        if(c++ > 60 && d++ > 80){
            System.out.println("Inside if");
        }
        else{
            System.out.println("Inside else");
        }
        System.out.println("c " + c + " d " + d);*/

       int c = 60 , d=80;
        if(++c > 63 || d++ > 80){
            System.out.println("Inside if");
        }
        else{
            System.out.println("Inside else");
        }
        System.out.println("c " + c + " d " + d);


    }
}
