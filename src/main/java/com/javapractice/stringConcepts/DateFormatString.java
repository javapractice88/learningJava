package com.javapractice.stringConcepts;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatString {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.format("%tB %td, %tY", cal, cal, cal);
        System.out.println();
        System.out.format("%tH:%tM, %tp", cal, cal, cal);
        System.out.println();

        Date now = new Date();
        System.out.println(now.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        System.out.println(simpleDateFormat.format(now));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm a");
        System.out.println(simpleDateFormat2.format(now));
    }
}
