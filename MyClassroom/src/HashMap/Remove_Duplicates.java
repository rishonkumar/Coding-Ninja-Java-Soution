package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove_Duplicates {

    public static void main(String[] args) {

        int[] a = {1,3,2,2,3,16,2,5};
        ArrayList<Integer>output = removeDuplicates(a);
        System.out.println(output);
    }

    public static ArrayList<Integer>removeDuplicates(int[] a){


        ArrayList<Integer>output = new ArrayList<>();

        HashMap<Integer,Boolean>map = new HashMap<>();
        for(int i=0 ; i<a.length; i++){

            if(map.containsKey(a[i])){
                continue;
            }

            //means new entry so add
            output.add(a[i]);
            map.put(a[i],true); //now add in map
        }
        return output;
    }
}
