package ankit.assignment7.Ques4;

public class CycleFactory {
    public Cycle createCycle(String cycleType){
        if(cycleType.equals("BiCycle"))
            return new BiCycle();
        else if(cycleType.equals("TriCycle"))
            return new TriCycle();
        else if(cycleType.equals("UniCycle"))
            return new UniCycle();
        return null;
    }
}
