package com.ankit.JavaAssignment;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. 
Save the results in a text file.
*/
public class Assignment11_CheckOccurence {
    public static void checkOccurence(String fileName) throws IOException {
        FileReader reader=new FileReader(fileName);
        Map<Character,Integer> characterMap=new HashMap<Character,Integer>();

        int ch;

        while((ch= reader.read())!=-1){
            // System.out.println((char)ch);
            if(ch!=32){
                characterMap.put((char)ch, characterMap.getOrDefault((char)ch,0)+1);
            }
        }



        PrintWriter writer=new PrintWriter("save.txt");
        /*characterMap.forEach((k,v)-> {
            writer.println(k+" "+v);
        });*/

        writer.println(characterMap);

        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner keyBoard=new Scanner(System.in);
        System.out.println("Enter the file Name: ");
        String fileName=keyBoard.nextLine();
        checkOccurence(fileName);
    }
}
