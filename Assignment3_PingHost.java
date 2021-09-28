package com.ankit.JavaAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.

*/
public class Assignment3_PingHost {
    public static void main(String[] args) throws IOException {
        Scanner keyBoard=new Scanner(System.in);
        String command=keyBoard.nextLine();
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader stream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String s = "",average="";
        while ((s = stream.readLine()) != null) {
            System.out.println(s);
            int startIndex=s.indexOf("Average");
            if(startIndex!=-1 ) {
                average = s.substring(startIndex + 10);
            }

        }
        System.out.println("Average time taken: "+average);

    }
}
