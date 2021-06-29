package javaPrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateClassPrac {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
       int a =2;
       Integer c = 2; //differnce between int and inetegr is that int a primitive data type and integer is a class like string,long,double all are classes
       //Also int only stores the val in memory and Integer creates an object of class integer  and hence it can use all relative methods 
       String b = "ffff"; 
       //Different way of using tostring
       if(a==c) {
    	   System.out.println(a);
    	   System.out.println(c);
    	   System.out.println(c.toString());
    	   System.out.println(Integer.toString(c));
    	   
    	   String newDate = "24-02-2021";
    	   Date dt = new Date();

    	   System.out.println(dt);
    	   System.out.println(dt.toString());
    	   SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm");
    	   Date newDateDt = sdf.parse("Afert parse"+newDate); // this is to convert a string to date format
    	   SimpleDateFormat sd = new SimpleDateFormat("M-d-yyyy hh:mm");
    	   System.out.println(sdf.format(dt));

    	   System.out.println(sd.format(dt));
    	   System.out.println(dt.toString());
    	   System.out.println(sdf.DAY_OF_WEEK_FIELD);
    	   System.out.println(sdf.DAY_OF_YEAR_FIELD);
    	   System.out.println(sdf.HOUR_OF_DAY0_FIELD);
    	   
    	   Calendar cal = Calendar.getInstance();
    	   SimpleDateFormat sdfCal = new SimpleDateFormat("M/d/yyyy hh:mm");
    	   System.out.println(sdf.format(cal.getTime()));
    	   System.out.println(cal.getTime());
    	   System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    	   System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    	   
       }
      
	}

}
