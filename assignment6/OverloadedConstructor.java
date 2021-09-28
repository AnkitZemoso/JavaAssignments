package ankit.assignment6;
/*
Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
Create a class with a constructor that takes a String argument. During construction, print the argument. 
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/
public class OverloadedConstructor {

    public OverloadedConstructor(){
        this("Calling parameterised constructor");
        System.out.println("Inside default constructor");
    }

    public OverloadedConstructor(String string){
        System.out.println(string+" inside parameterised constructor");
    }

    public static void main(String[] args) {
        OverloadedConstructor[] array=new OverloadedConstructor[3];
        for(int i=0;i<3;i++){
            array[i]=new OverloadedConstructor("Hello Object "+(i+1));
        }
    }
}
