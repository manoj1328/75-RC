package rc.coding.RC75.programs.string;

import java.util.LinkedHashMap;

public class ReverseWordsInSentence {

    public static void main(String[] args) {
        String s = "Interview this Crack Lets";

        String[] split = s.split(" ");
        String rev="";

        for(int i=split.length-1;i>=0;i--)
        {
          rev = rev + split[i] + " ";
        }

        System.out.println(rev.trim());
    }
}
