import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FAQOnStreams {
    private static void commonElementsArrays(int[]arr1,int[]arr2){
        //use boxed() to case int stream to Integer stream
        List<Integer> result = Arrays.stream(arr1).distinct().filter(number ->
                Arrays.stream(arr2).anyMatch((arr2Number) -> arr2Number == number)).boxed().collect(Collectors.toList());
        System.out.println(result);
    }
    private static void reverseArrayInPlace(int []arr){
        IntStream.range(0,arr.length/2).forEach((i)->{
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        });
        System.out.println("Array after reversing "+ Arrays.toString(arr));
    }
    private static void findLongestString(String[]arr){
        // if requirement is just to find the longest string length

        int maxLength = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);
        System.out.println("maxLength of string is "+maxLength);

        //if task is to fetch the string with the longest length

        List<String> result = Arrays.stream(arr).sorted((str1, str2) -> str2.length() - str1.length()).limit(1).toList();
        System.out.println("largest String "+ result.get(0));
    }

    private static void removeDuplicateFromList(){
        String s= "keepduplicates";
        String result = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.joining());
        System.out.println("after removing duplicates "+ result);
    }

    private static void sortBasedOnSalary(Employee[] employees){
        System.out.println(getDescSortedEmployee(employees));
        // to fetch top 3 salaried employee
        List<Employee> topThreeHighestPaidEmployees = getDescSortedEmployee(employees).stream().skip(1).limit(3).toList();
        System.out.println("top 3 highest paid " + topThreeHighestPaidEmployees);
    }

    private static List<Employee> getDescSortedEmployee(Employee[] employees) {
        return Arrays.stream(employees)
                .sorted((emp1, emp2) -> (int) (emp2.salary() - emp1.salary())).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Employee [] employees = new Employee[]{
                new Employee(1, "saurabh", "Java",
                        List.of(new Tech("React",4),new Tech("Java",10),new Tech("angular",1)),
                        3456789),
                new Employee(2, "kumar", "Python",
                        List.of(new Tech("Vue",2),new Tech("Python",4),new Tech("GO",1)),
                        127865),
                new Employee(3, "saurabh kumar", "cpp",
                        List.of(new Tech("CPP",4),new Tech("DotNet",14),new Tech("C#",4)),
                        674507),
                new Employee(4, "Aditya", "JavaScript",
                        List.of(new Tech("Express",5),new Tech("Node",4),new Tech("LoopBack",1)),
                        3489645),
        };
        commonElementsArrays(new int[]{1,2,3,4,5},new int[]{4,5,6,7,8});
        reverseArrayInPlace(new int[]{2,3,4,5});
        findLongestString(new String[]{"Apple","Banana","Avocado","Apricot","Grapes"});
        removeDuplicateFromList();
        sortBasedOnSalary(employees);
    }
}
