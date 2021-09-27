package com.ankit.JavaAssignment;
// Using the documentation for java.util.regex.Pattern as a resource,
// write and test a regular expression that checks a sentence to see that it begins with a capital letter
// and ends with a period.

public class Assignment9_Regex {
    public static boolean checkValidSentence(String sentence){
        String pattern="[A-Z].*[.]";
        return sentence.matches(pattern);
    }

    public static void test(){
        String statement1="This is a valid Sentence it should pass the test.";
        if(checkValidSentence(statement1)){
            System.out.println("Statement 1 passes the test.");
        }
        else{
            System.out.println("Statement 1 doesn't passes the test.");
        }

        String statement2="this string doesn't have its first letter Capital.It will fail the test.";
        if(checkValidSentence(statement2)){
            System.out.println("Statement 2 passes the test.");
        }
        else{
            System.out.println("Statement 2 doesn't passes the test.");
        }

        String statement3="This sentence is missing a period it will fail the test";
        if(checkValidSentence(statement3)){
            System.out.println("Statement 3 passes the test.");
        }
        else{
            System.out.println("Statement 3 doesn't passes the test.");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
