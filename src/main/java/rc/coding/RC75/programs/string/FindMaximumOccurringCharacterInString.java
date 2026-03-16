package rc.coding.RC75.programs.string;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;

import java.util.*;
import java.util.stream.Collectors;

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
        String ss ="swwwwwiiiiiiiiiiiiiisswss";
       // System.out.println(maxChar(s));

        List<String> list = new ArrayList<String>();
        list.add("Manoj");
        list.add("Sridharan");
        list.add("Manoj");
        list.add("Sridharan");
        list.add("Sridharan");

        int maxStrings = list.stream()
                        .mapToInt(String::length).max().getAsInt();

        System.out.println(maxStrings);

    }
}
