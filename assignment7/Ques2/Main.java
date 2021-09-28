package ankit.assignment7.Ques2;

import java.util.ArrayList;
import java.util.List;
/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
Create instances of all three types and upcast them to an array of Cycle. 
Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
*/
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
