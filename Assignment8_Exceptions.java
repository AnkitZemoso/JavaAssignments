package com.ankit.JavaAssignment;

import java.util.Scanner;
/*
Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause 
that will catch all three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

*/
class InvalidMarksException extends Exception {
    public InvalidMarksException(String exception){
        super(exception);
    }
}

class InvalidIdException extends Exception{
    public InvalidIdException(String exception){
        super(exception);
    }
}

class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String exception){
        super(exception);
    }
}

class Student{
    public void checkDetails(int marks,String id,String phoneNumber) throws InvalidMarksException,InvalidIdException,InvalidPhoneNumberException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Marks should be in range 0 to 100");
        }
        if(!id.startsWith("St")){
            throw new InvalidIdException("Student id must start from St");
        }
        if(phoneNumber.length()!=10){
            throw new InvalidPhoneNumberException("Phone number must have 10 digits");
        }

    }
}
public class Assignment8_Exceptions {
    public static void main(String[] args) {
        Scanner keyBoard=new Scanner(System.in);

        System.out.println("Enter Student Id");
        String id=keyBoard.nextLine();

        System.out.println("Enter Student Marks");
        int marks=keyBoard.nextInt();
        keyBoard.nextLine();
        System.out.println("Enter Student Phone no.");
        String phoneNo= keyBoard.nextLine();

        Student student=new Student();

        try{
            student.checkDetails(marks,id,phoneNo);
        }
        catch ( InvalidMarksException | InvalidPhoneNumberException | InvalidIdException  e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Finally block got Executed");
        }
    }

}
