package rc.coding.RC75.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceEachCharacterWithItsFrequency {
    public static void main(String[] args) {
        String s = "sswiss";
        String r ="";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<=s.length()-1;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<=s.length()-1;i++)
        {
            r=r+map.get(s.charAt(i));
        }

        System.out.println(r);

    }
}
