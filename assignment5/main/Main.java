package ankit.assignment5.main;

import ankit.assignment5.data.DefaultClass;
import ankit.assignment5.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {

        DefaultClass obj1=new DefaultClass();
        obj1.printLocalVariables();
        obj1.printClassMembers();

        SingletonClass obj2=SingletonClass.initialiseClass("Hello");
        obj2.PrintString();
    }
}
