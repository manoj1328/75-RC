package rc.coding.RC75.programs.string;

import java.util.HashMap;

public class CountOccurrencesEachCharacterInString {

    public static void main(String[] args) {
        String s = "madam";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
