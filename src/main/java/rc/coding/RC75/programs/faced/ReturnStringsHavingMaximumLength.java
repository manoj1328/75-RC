package rc.coding.RC75.programs.faced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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

        List<String> longest = list.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .orElse(Collections.emptyList());

        System.out.println(collect);
    }
}
