package HashMap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

    public static void main(String[] args) {

        HashMap<String,Integer>map = new HashMap<>();

        //Insert
        map.put("abc",1);
        map.put("def",3);

        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }


        //get value
        int v = map.get("abc");
        System.out.println(v); // 1

        int v1 = map.get("abc1");
        System.out.println(v1); // null point exception


        //remove
        map.remove("abc");

        //size
        map.size();

        //Iterator
        Set<String>keys = map.keySet();
        for(String s : keys){
            System.out.println(s);
        }
    }
}
