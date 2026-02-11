package rc.coding.RC75.programs.string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "swiizs";
        Set<Character> set = new LinkedHashSet<>();
        String ans = "";
        for(char c: s.toCharArray())
        {
            if(set.add(c))
            {
                ans=ans+c;
            }
        }
        System.out.println(ans);
    }
}
