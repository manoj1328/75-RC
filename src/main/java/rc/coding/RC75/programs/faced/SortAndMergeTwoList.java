package rc.coding.RC75.programs.faced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAndMergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 1, 3);
        List<Integer> list2 = Arrays.asList(4, 2, 6);
        List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
