package JavaConcepts_And_Programs.Concepts;

public class StringWithSpecialChars {
    public static void main(String[] args){
        String s1="#$%789@#*293&^$";
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
      //  String s2=s1.split("%")[1].trim();
       // s2=s2.split("@")[0].trim();
               // System.out.println(s2);

    }

}
