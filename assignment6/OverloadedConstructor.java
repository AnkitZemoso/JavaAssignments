package ankit.assignment6;

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
