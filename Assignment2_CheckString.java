package com.ankit.JavaAssignment;

import java.util.Scanner;

public class Assignment2_CheckString {
    public static boolean checkStringForAllLetters(String input) {
        int index = 0;
        boolean[] visited = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            visited[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner keyBoard=new Scanner(System.in);
        System.out.println("Enter the input String");
        String input=keyBoard.nextLine();
        boolean allLettersPresent=checkStringForAllLetters(input);
        if(allLettersPresent){
            System.out.println("All letters are present in the String");
        }
        else{
            System.out.println("All letters are not present in the String");
        }
        // time complexity of this program is O(n)
        // space complexity of this program is O(1);

    }
}
