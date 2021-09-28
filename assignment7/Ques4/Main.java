package ankit.assignment7.Ques4;
/*
Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
*/
public class Main {
    public static void main(String[] args) {
        CycleFactory factory=new CycleFactory();

        Cycle c1= factory.createCycle("BiCycle");
        Cycle c2= factory.createCycle("TriCycle");
        Cycle c3= factory.createCycle("UniCycle");

        c1.display();
        c2.display();
        c3.display();
    }
}
