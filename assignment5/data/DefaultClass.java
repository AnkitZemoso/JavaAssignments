package ankit.assignment5.data;
/*
Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized, add a method to print these variables. 
Add another method in the same class with two local variables and print their values without initializing them.

*/
public class DefaultClass {
    private int number;
    private char character;

    public void printClassMembers(){
        System.out.println("Number: "+number+" Character: "+character);
    }

    public void printLocalVariables(){
        int local1,local2;
        // We can't access uninitialized local variables.
        // System.out.println("Local1: "+local1+" Local2: "+local2);
    }
}
