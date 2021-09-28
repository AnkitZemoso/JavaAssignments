package ankit.assignment5.main;

import ankit.assignment5.data.DefaultClass;
import ankit.assignment5.singleton.SingletonClass;
/*
Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. 
Create object of second class using static method and then call the other method to print the String.

*/
public class Main {
    public static void main(String[] args) {

        DefaultClass obj1=new DefaultClass();
        obj1.printLocalVariables();
        obj1.printClassMembers();

        SingletonClass obj2=SingletonClass.initialiseClass("Hello");
        obj2.PrintString();
    }
}
