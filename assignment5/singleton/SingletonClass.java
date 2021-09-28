package ankit.assignment5.singleton;
/*
Create another class in package yourname.assignment.singleton containing a non static String member variable. 
Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.
*/
public class SingletonClass {
    private String string;

    public static SingletonClass initialiseClass(String initialValue){
         // string = initialValue;
        // Non-Static field cannot be referenced from static context.
        return new SingletonClass();
    }

    public void PrintString(){
        System.out.println(string);
    }
}
