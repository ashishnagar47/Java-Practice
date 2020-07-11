package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAllVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        //CountAllVowels c=new CountAllVowels();
        vowelCount(str);
    }
    public static void vowelCount(String str){
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        char[] charArray=str.toCharArray();
        for(char c: charArray){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else{
                    map.put(c,1);
                }
            }
        }
        System.out.println(map);
    }
}
