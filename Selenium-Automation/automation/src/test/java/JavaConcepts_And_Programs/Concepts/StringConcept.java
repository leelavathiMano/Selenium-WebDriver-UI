package JavaConcepts_And_Programs.Concepts;

public class StringConcept {
       public static void main(String args[]){
        // String is an Object with the sequence of characters
        // If we are declaring another string with the same name but diff object always it
        // will point to first created memory allocation only
        // where as if you use new keyword for creating a string evertime it will create a new memory
        // and store the value even if the string name is same

        //String Literal
        String s1="Leela";
        String s2="Leela";
        String s3="Preksha";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String s4=new String("Senthil");
        String s5=new String("naren");
        System.out.println(s4);
        System.out.println(s5);

        //how do ypu convert the string into Array -- by using split() method we can convert
        String s6= "Preksha is studying in joykids school";
        System.out.println(s6);
        //Conversion and print all witfdxtycghh for loop
        String[] SplitArrayWord=  s6.split(" ");
        for(int i=0;i<=SplitArrayWord.length-1;i++)
        {
System.out.println(SplitArrayWord[i]);
        }
// if you want to print the entire word as letter by letter
        String s7= "Senthil is cute boy";
        for (int j=0;j<s7.length();j++){
            System.out.println(s7.charAt(j));
        }
        // Print the word in reverse order
        for(int i=SplitArrayWord.length-1;i>=0;i--)
        {
            System.out.println(SplitArrayWord[i]);
        }
        //reverse the characters
        for (int k=s7.length()-1;k>=0;k--){
            System.out.println(s7.charAt(k));
        }
    }



}
