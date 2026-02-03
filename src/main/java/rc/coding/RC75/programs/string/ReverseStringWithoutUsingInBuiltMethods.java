package rc.coding.RC75.programs.string;

import org.springframework.boot.SpringApplication;
import rc.coding.RC75.Rc75Application;

import java.util.Arrays;

public class ReverseStringWithoutUsingInBuiltMethods {

    public static void main(String[] args) {
        String s = "Hello";
        char[] charArray = s.toCharArray();
        String rev="";
        for(int i=charArray.length-1;i>=0;i--)
        {
            rev =rev + charArray[i];
        }
        System.out.println(rev);
        System.out.println(s.length());
        System.out.println(charArray[4]);



    }
}
