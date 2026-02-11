package rc.coding.RC75.programs.string;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String s = "Manoj";
        int v=0;
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                v++;
            }else
            {
                c++;
            }
        }

        System.out.println("Vowels - "+v+" Consonants - "+c);
    }
}
