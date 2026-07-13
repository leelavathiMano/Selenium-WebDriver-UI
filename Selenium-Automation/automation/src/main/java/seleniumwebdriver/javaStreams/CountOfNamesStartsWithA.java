package seleniumwebdriver.javaStreams;

import java.util.ArrayList;

public class CountOfNamesStartsWithA {
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
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).startsWith("A")) {
                count++;
            }

        }
        System.out.println("Count of names starting with A: " + count);
    }

}
