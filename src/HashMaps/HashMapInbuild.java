package HashMaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapInbuild {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();

        map.put("India",130);
        map.put("USA",30);
        map.put("China",140);
        map.put("UK",20);
        System.out.println(map);

        System.out.println(map.get("India"));
        System.out.println(map.get("UK"));

        map.remove("China");
        System.out.println(map);

        System.out.println(map.containsKey("India"));
        System.out.println("******KEYS********");
        Set<String> str=map.keySet();
        for(String st  :  str){
            System.out.println(st);
        }

    }
}
