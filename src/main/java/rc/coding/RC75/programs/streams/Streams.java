package rc.coding.RC75.programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        removeDups();
    }

    //66. Filter even numbers from a list.
    private static void filterEvenNumber() {
        List<Integer> list = Arrays.asList(6, 4, 7, 2, 4, 8, 0, 1, 4, 3);
        List<Integer> collect = list.stream()
                                    .filter(x -> x % 2 == 0)
                                    .collect(Collectors.toList());
        System.out.println(collect);
    }

    //67. Filter odd numbers from a list.
    private static void filterOddNumber() {
        List<Integer> list = Arrays.asList(6, 4, 7, 2, 4, 8, 0, 1, 4, 3);
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    //68. Find maximum number in a list.
    private static void findMaxNumber() {
        List<Integer> list = Arrays.asList(6, 4, 7, 2, 4, 8, 0, 1, 4, 3);
        Optional<Integer> collect = list.stream().reduce((a,b) -> Integer.max(a,b));
        System.out.println(collect);
    }

    //69. Find maximum number in a list.
    private static void findMinNumber() {
        List<Integer> list = Arrays.asList(6, 4, 7, 2, 4, 8, 1, 4, 3);
        Optional<Integer> collect = list.stream().reduce((a,b) -> Integer.min(a,b));
        System.out.println(collect);
    }

    //70. Find sum of all elements in a list.
    private static void findSumNumber() {
        List<Integer> list = Arrays.asList(6, 4);
        Optional<Integer> collect = list.stream().reduce((a,b) -> a+b);
        System.out.println(collect);
    }

    //71. Find average of numbers in a list.
    private static void findAverage() {
        List<Integer> list = Arrays.asList(6, 6, 6, 10);
        Double collect = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(collect);
    }

    //72. Remove duplicate elements from a list.
    private static void removeDups() {
        List<Integer> list = Arrays.asList(6, 6, 6, 10);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    //73. Sort list in ascending order.
    private static void sortInAscending() {
        List<Integer> list = Arrays.asList(8, 4, 5, 6, 6, 6, 10);
       // List<Integer> collect = list.stream().sorted();
        //System.out.println(collect);
    }



}
