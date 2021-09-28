package ankit.assignment7.Ques3;
/*
Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. 
Create a class by implementing the new interface and also inheriting from a concrete class. 
Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
*/
public class Main {
    void a(Interface1 i){
        i.method1();
        i.method2();
    }
    void b(Interface2 i){
        i.method3();
        i.method4();
    }
    void c(Interface3 i){
        i.method5();
        i.method6();
    }
    void d(Interface4 i){
        i.method7();
    }


    public static void main(String[] args) {
        Main obj1=new Main();
        ClassImpl obj2=new ClassImpl();
        obj1.a(obj2);
        obj1.b(obj2);
        obj1.c(obj2);
        obj1.d(obj2);

    }
}
