package JavaConcepts_And_Programs.Concepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassConcept {
    public static void main(String args[]){
        // current date and time
        Date date=new Date();
        date.toString();
        System.out.println(date);
        //mm/dd/yyyy
        SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy H:m:s");
        SimpleDateFormat sdf1=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat("d/M/yyyy");
        System.out.println(sdf2.format(date));
        System.out.println(sdf1.format(date));
       System.out.println(sdf.format(date));
    }

}
