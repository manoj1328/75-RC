package rc.coding.RC75.programs.string;

import rc.coding.RC75.programs.streams.Streams;

import java.util.Arrays;
import java.util.HashMap;

public class CheckIfStringContainsOnlyDigits {

    public static boolean isDigi(String s)
    {
//        for(int i=0;i<s.length();i++)
//        {
//            if(!Character.isDigit(s.charAt(i)))
//            {
//                return false;
//
//            }
//        }
//        return true;
      return  s.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        String s ="12345";
        System.out.println(CheckIfStringContainsOnlyDigits.isDigi(s));

    }
}
