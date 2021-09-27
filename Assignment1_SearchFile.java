package com.ankit.JavaAssignment;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_SearchFile {
    public void searchFile()
    {

        // address of files or folder where to search
        File file = new File("D:\\");

        // storing all files present in the directory
        String[] files = file.list();

        System.out.println("Files present in present Directory: ");

        System.out.println(Arrays.toString(files));

        Scanner keyBoard = new Scanner(System.in);

        while(true){
            boolean isFilePresent=false;

            System.out.println("Enter the Name of file or folder you want to Search.");

            //string to store the name of the file

            String pattern =keyBoard.nextLine();

            System.out.println(Arrays.toString(files));

            for (String string : files){
                boolean isMatch = string.matches(pattern);
                // str1 is true than print the following
                if (isMatch){
                    isFilePresent=true;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ String.valueOf(file.getAbsolutePath())+"\\"+string);
                }
            }

            //if file not found

            if(isFilePresent)
            {
                System.out.println("Do you want to continue Search ");
                System.out.println("Press 1 to continue else press any key to exit");
                int keyPress=keyBoard.nextInt();
                keyBoard.nextLine();
                if(keyPress!=1){
                    break;
                }

            }
            else{
                System.out.println("File not found , Reenter the name of the file.");
            }
        }
    }

    public static void main(String[] args){
        Assignment1_SearchFile obj =new Assignment1_SearchFile();

        obj.searchFile();
    }
}
