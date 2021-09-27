package ankit.assignment7.Ques4;

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
