package rc.coding.RC75.programs.string;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumOccurringCharacterInString {

    public static char maxChar(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch = 0;
        int max =0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet())
                {
                    if(max<map.get(entry.getKey()))
                    {
                        max = entry.getValue();
                        ch = entry.getKey();
                    }
                }

        return ch;
    }

    public static void main(String[] args) {
        String s ="swwwwwiiiiiiiiiiiiiisswss";
        System.out.println(maxChar(s));

    }
}
