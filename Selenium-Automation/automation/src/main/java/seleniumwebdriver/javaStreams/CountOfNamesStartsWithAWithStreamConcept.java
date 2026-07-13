package seleniumwebdriver.javaStreams;

import java.util.ArrayList;

public class CountOfNamesStartsWithAWithStreamConcept {
    public static void main(String[] args) {
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
        // There is no life ofr intermediate Operation if there is no terminal
        // operation. So, we
        // need to have terminal operation to get the result. In this case, we are using
        // count() as terminal operation.
        // terminal operation will execute only when intermedaite operation (filter)
        // returns a result. In this case, filter is an intermediate operation that
        // returns a stream, and count() is a terminal operation that returns a long
        // value.
        //
        //
        long count = names.stream().filter(a -> a.startsWith("A")).count();
        System.out.println("Count of names starting with A: " + count);
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
    }

}
