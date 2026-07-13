package seleniumwebdriver.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueNumberusingStream {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        System.out.println(numbersList);
        numbersList.stream().distinct().sorted().forEach(s -> System.out.println(s));
        System.out.println("=================================================");
        List<Integer> uniqueNums = numbersList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Third element: " + uniqueNums.get(2));
    }

}
