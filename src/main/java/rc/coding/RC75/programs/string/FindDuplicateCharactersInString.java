package rc.coding.RC75.programs.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "swiizs";
        Set<Character> set = new LinkedHashSet<>();
        List<Character> ans = new ArrayList<>();
        for(char c: s.toCharArray())
        {
            if(!set.add(c))
            {
                ans.add(c);
            }
        }
        System.out.println(ans);
    }
}
