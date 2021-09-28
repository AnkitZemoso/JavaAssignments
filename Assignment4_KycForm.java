package com.ankit.JavaAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/*
Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

*/
public class Assignment4_KycForm {
    public static String computeRange(String signUpDateString, String currentDateString) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date signUpDate=formatter.parse(signUpDateString);
        Date currentDate=formatter.parse(currentDateString);

        if(signUpDate.compareTo(currentDate)>0)
            return "No range";


        Date startDate=signUpDate;
        startDate.setYear(currentDate.getYear());


        Calendar calendar=Calendar.getInstance();
        calendar.setTime(startDate);

        calendar.add(Calendar.DATE,30);
        Date endDate=calendar.getTime();

        calendar.add(Calendar.DATE,-60);
        startDate=calendar.getTime();

        if(endDate.compareTo(currentDate)>0)
            endDate=currentDate;

        return formatter.format(startDate)+" "+formatter.format(endDate);
    }



    public static void main(String[] args) throws ParseException {

        Scanner keyBoard=new Scanner(System.in);
        System.out.println("Enter the no of dates you want to check");
        int testCases=keyBoard.nextInt();
        while(testCases-->0){
            System.out.println("Enter the signup Date");
            String signUp=keyBoard.next();

            System.out.println("Enter the current date");
            String current=keyBoard.next();

            String range=computeRange(signUp,current);
            System.out.println(range);

        }


    }
}
