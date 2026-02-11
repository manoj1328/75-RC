package rc.coding.RC75.programs.string;

import java.util.HashMap;

public class CheckTwoStringsAnagrams {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c :s1.toCharArray())
        {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char c :s2.toCharArray())
        {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        System.out.println(map1.equals(map2));
    }
}
