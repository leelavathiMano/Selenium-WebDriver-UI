package JavaConcepts_And_Programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {
        public static void main(String args[]){
       Calendar cal= Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        SimpleDateFormat sdf= new SimpleDateFormat();

        }

}
