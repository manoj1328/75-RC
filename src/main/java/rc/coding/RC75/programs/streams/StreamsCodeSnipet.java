package rc.coding.RC75.programs.streams;

import rc.coding.RC75.programs.model.EmployeDept;
import rc.coding.RC75.programs.model.Employee;
import rc.coding.RC75.programs.model.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCodeSnipet {
    public static void main(String[] args) {
        groupEmployeesByDepartmentAndAverageSalary();
        String s =" test";
        s.split()
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

    //10. Remove Duplicates
    private static void removeDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        //Set<Integer> set = new HashSet<>();
        //List<Integer> collect = list.stream().filter(x -> set.add(x)).collect(Collectors.toList());
        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
        collect1.add(10);
        System.out.println(collect1);
    }

    //11. Find Average of Numbers
    private static void findAverageNumbers() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        double average = list.stream().mapToInt(x -> x).average().orElse(0.0);
        System.out.println(average);
    }

    //12. Sort List Ascending and Descending
    private static void SortListAscendingOrDescending() {
        List<Integer> list = Arrays.asList(5, 1, 8, 3);
        List<Integer> list1 = list.stream().sorted().toList(); // asending order
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();// decendingorder
        System.out.println(list1);
        System.out.println(list2);
    }

    //13. Count Strings Starting with Specific Letter
    private static void countStringsStartingWithSpecificLetter() {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
        long a = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(a);
    }

    //14. Join Strings into Comma-Separated String
    private static void joinStringsIntoCommaSeparatedString() {
        List<String> list = Arrays.asList("Java", "Python", "C++");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }

    //15. Check if All Elements Are Positive
    private static void checkIfAllElementsArePositive() {
        List<Integer> list = Arrays.asList(2, 5, -7, 9);
        boolean b = list.stream().allMatch(x -> x > 0);
        System.out.println(b);
    }

    //16. Check if Any Number Divisible by 3
    private static void checkIfAnyNumberDivisibleByThree() {
        List<Integer> list = Arrays.asList(2, 4, 7, 9);
        boolean b = list.stream().anyMatch(x -> x % 3 == 0);
        System.out.println(b);
    }

    //17. Flatten List of Lists
    private static void flattenListOfLists() {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4),Arrays.asList(5,6));
        List<Integer> collect = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }

    //18. Find First Non-Empty String
    private static void findFirstNonEmptyString() {
        List<String> list = Arrays.asList("", "", "World", "ddd");
        String first = list.stream().filter(x -> x != "").findFirst().orElse(null);
        System.out.println(first);
    }

    //19. Find Second Highest Number
    private static void findSecondHighestNumber() {
        List<Integer> list = Arrays.asList(5, 8, 12, 3, 10);
        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());
    }

    //20. Sort Employees by Salary
    private static void sortEmployeesBySalary() {
        List<Employee> list = Arrays.asList(new Employee(101,"Jhon",50000),
                new Employee(103,"Alice",70000),
                new Employee(102,"Bob",40000)
                );
        List<Employee> list1 = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(list1);
    }

    //21. Average Age of Person Objects
    private static void averageAgeofPersonObjects() {
        List<Person> list = Arrays.asList(new Person(101,"A",20),
                new Person(102,"B",30),
                new Person(103,"C",40)
        );
        double v = list.stream().mapToInt(x -> x.getAge()).average().orElse(0);
        System.out.println(v);
    }

    //22. Partition Numbers into Even and Odd
    private static void partitionNumbersIntoEvenAndOdd() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(collect);
    }

    // 23. Count Occurrences of Each Element
    private static void  countOccurrencesOfEachElement() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
       // Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(x -> x.length()));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    // 24. Group Employees by Department and Average Salary
    private static void  groupEmployeesByDepartmentAndAverageSalary() {
        List<EmployeDept> list = Arrays.asList(new EmployeDept(103,"Alice",10, "IT"),
                new EmployeDept(103,"Alice",10, "IT"),
                new EmployeDept(103,"Alice",20, "ECE"),
                new EmployeDept(103,"Alice",30, "EEE")
                );
        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(EmployeDept::getDepartment, Collectors.averagingDouble(EmployeDept::getSalary)));
        System.out.println(collect);
    }




























}
