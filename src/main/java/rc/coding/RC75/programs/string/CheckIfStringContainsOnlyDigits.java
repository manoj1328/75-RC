package rc.coding.RC75.programs.string;

import java.util.HashMap;

public class CheckIfStringContainsOnlyDigits {

    public static boolean isDigi(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="a12345";
        System.out.println(CheckIfStringContainsOnlyDigits.isDigi(s));

    }
}
