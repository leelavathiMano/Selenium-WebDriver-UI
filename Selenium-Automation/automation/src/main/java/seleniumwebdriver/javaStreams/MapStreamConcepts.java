package seleniumwebdriver.javaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.Assert;

public class MapStreamConcepts {
    public static void main(String[] args) {
        Stream.of("Senthil", "Preksha", "Ananad", "Lee", "Arvind", "Alex", "Narendra", "Anand", "Amit")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        Stream.of("Senthil", "Preksha", "Ananad", "Lee", "Arvind", "Alex", "Narendra", "Anand", "Amit")
                .filter(s -> s.startsWith("A")).sorted()
                .map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
        // Merge two list in to one list and then sort the list and print the first
        // element of the list.
        System.out.println(
                "Merge two list in to one list and then sort the list and print the first element of the list.");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Senthil");
        names.add("Preksha");
        names.add("Ananad");
        names.add("Lee");
        names.add("Arvind");
        names.add("Alex");
        names.add("Narendra");
        names.add("Anand");
        names.add("Amit");
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Eshwar");
        names1.add("Sathish");
        names1.add("Kumar");
        names1.add("Leela");
        names1.add("Arvindan");
        names1.add("Jai");
        names1.add("hello");
        names1.add("janu");
        names1.add("mano");
        Stream<String> newString = Stream.concat(names.stream(), names1.stream());
        newString.sorted().forEach(s -> System.out.println(s));
        // check the presence of any name
        Stream<String> newString1Stream = Stream.concat(names.stream(), names1.stream());
        boolean isPresent = newString1Stream.anyMatch(s -> s.equalsIgnoreCase("Leela"));
        System.out.println("Is 'Leela' present: " + isPresent);
        Assert.assertTrue(isPresent);
    }
}
