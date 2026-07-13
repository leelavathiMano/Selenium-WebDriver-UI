package seleniumwebdriver.javaStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectStream {
    public static void main(String[] args) {
        System.out.println("Collect Stream");
        List<String> nameList = Stream
                .of("Senthil", "Preksha", "Ananad", "Lee", "Arvind", "Alex", "Narendra", "Anand", "Amit")
                .filter(s -> s.startsWith("A")).sorted()
                .map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());
        nameList.forEach(s -> System.out.println(s));
        System.out.println("First element: " + nameList.get(0));

    }

}
