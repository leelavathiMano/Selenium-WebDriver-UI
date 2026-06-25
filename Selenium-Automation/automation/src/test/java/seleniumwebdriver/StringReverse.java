package seleniumwebdriver;

public class StringReverse {
    public static void main(String[] args){
        String str= "rahul shetty academy";
        String reverse="";
        String reverse1="";
        String[] sr=str.split(" ");
        System.out.println(sr.length);
        for(int i=sr.length-1;i>=0;i--){
    reverse=reverse+sr[i]+" ";        
    }
        System.out.println(reverse);
        for(int j=sr.length-1;j>=0;j--){
            reverse1=reverse1+str.charAt(j);
        }
        System.out.println(reverse1);
}
}