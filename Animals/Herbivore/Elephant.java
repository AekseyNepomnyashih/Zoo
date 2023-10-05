package Zoo.Animals.Herbivore;

import Zoo.Animals.Run;
import Zoo.Animals.Voice;
import Zoo.Food.Food;
import Zoo.Food.Grass;

public class Elephant extends Herbivore implements Run, Voice {
    @Override
    public String run() {
        String run = "Слон ходит по территории";
        return run;
    }

    @Override
    public String voice() {
        String voice = "Слон издает звук ту-ту";
        return voice;
    }
    @Override
    public void eat(Food food){
        String grass = "Слон ест траву";
        String meat = "Слон не ест мясо";
        super.eat(food);
        if (food instanceof Grass){
            System.out.println(grass);
        } else System.out.println(meat);
    }
}
