package ankit.assignment7.Ques1;

import java.util.ArrayList;
import java.util.List;
/*
 Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, 
 and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, 
 fill it with different specific types of Rodents, and call your base-class methods to see what happens. 
 Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.
*/
public class Main {
    public static void main(String[] args) {
        List<Rodent> rodents=new ArrayList<>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());

        for(Rodent rodent:rodents){
            rodent.displayInfo();
        }

    }
}
