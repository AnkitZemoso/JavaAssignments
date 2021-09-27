package ankit.assignment7.Ques2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cycle> cycles=new ArrayList<Cycle>();
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());
        cycles.add(new Unicycle());

        for(Cycle cycle:cycles){
            // cycle.balance();

            // As there is no balance method in cycle class so it will create an error.
            // As Parent class has no balanced method.

        }

        for(Cycle cycle:cycles){
            if(cycle instanceof Bicycle){
                Bicycle bicycle=(Bicycle)cycle;
                bicycle.balance();
            }

            if(cycle instanceof Unicycle){
                Unicycle unicycle=(Unicycle) cycle;
                unicycle.balance();
            }

            if(cycle instanceof Tricycle){
                Tricycle tricycle=(Tricycle)cycle;
                // tricycle.balance();
                // We can't call balance in tricycle as it doesnot has any balance method.
            }
        }

    }
}
