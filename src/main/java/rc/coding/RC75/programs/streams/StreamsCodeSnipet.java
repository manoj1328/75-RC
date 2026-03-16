package rc.coding.RC75.programs.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCodeSnipet {
    public static void main(String[] args) {
        sumOfSquaresOfEvenNumbers();
    }

    //1. Filter Even Numbers from a List
    private static void filterEvenNumber() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }

    //2. Convert Numbers in List to Their Squares
    private static void convertToTheirSquares() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }

    //3. Square Even Numbers from List
    private static void SquaresEvenNos() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).map(y -> y * y).collect(Collectors.toList());
        System.out.println(collect);
    }

    //4. Find First Number Greater Than 10
    private static void findFirstNoGreaterThanTen() {
        List<Integer> list = Arrays.asList(3, 7, 9, 11, 15);
        Optional<Integer> first = list.stream().filter(x -> x > 10).findFirst();
        System.out.println(first);
    }

    //5. Count Numbers Greater Than 5
    private static void countNosGreaterThanFive() {
        List<Integer> list = Arrays.asList(2, 5, 6, 8, 3, 9);
        long count = list.stream().filter(x -> x > 5).count();
        System.out.println(count);
    }

    //6. Find Sum/Product of All Numbers
    private static void FindSumAndProductofAllNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Integer sum = list.stream().reduce(0, Integer::sum);
        Integer product = list.stream().reduce(1, (a,b) -> a*b);
        System.out.println(sum);
        System.out.println(product);
    }

    //7. Find Sum of Even Numbers
    private static void findSumofEvenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer reduce = list.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }

    //8. Find Maximum Number in List
    private static void FindMaximumNumberInList() {
        List<Integer> list = Arrays.asList(1, 2, 11, 3, 4, 5, 6);
        Integer reduce = list.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(reduce);
    }

    //9. Sum of Squares of Even Numbers
    private static void sumOfSquaresOfEvenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Integer reduce = list.stream().filter(x -> x % 2 == 0).map(y -> y*y).reduce(0, Integer::sum);
        System.out.println(reduce);
    }

























}
