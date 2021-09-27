package ankit.assignment5.data;

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
