package ankit.assignment5.singleton;

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
