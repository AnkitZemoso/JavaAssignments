package ankit.assignment7.Ques1;

import java.util.ArrayList;
import java.util.List;

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
