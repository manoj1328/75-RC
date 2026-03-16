package rc.coding.RC75.programs.faced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStringsHavingMaximumLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Manoj",
                "Sridharan",
                "Manoj",
                "Sridharan",
                "Sridharan"
        );
        int i = list.stream().mapToInt(x -> x.length()).max().orElse(0);
        List<String> collect = list.stream().filter(x -> x.length() == i).collect(Collectors.toList());

        System.out.println(collect);
    }
}
