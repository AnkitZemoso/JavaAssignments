package ankit.assignment7.Ques1;

public class Mouse extends Rodent{

    public Mouse(){
        System.out.println("Inside Mouse Constructor");
    }
    @Override
    public void displayInfo() {
        System.out.println("Inside Mouse Method");
    }
}
