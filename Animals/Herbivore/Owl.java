package Zoo.Animals.Herbivore;

import Zoo.Animals.Fly;
import Zoo.Animals.Run;
import Zoo.Animals.Voice;
import Zoo.Food.Food;
import Zoo.Food.Meat;

public class Owl extends Herbivore implements Run, Fly, Voice {
    @Override
    public String fly() {
        String fly = "Сова летает в клетке";
        return fly;
    }

    @Override
    public String run() {
        String run = "Сова ходит по ветке дерева";
        return run;
    }

    @Override
    public String voice() {
        String voice = "Сова издает звук уу-уу!";
        return voice;
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        String grass = "Сова не ест траву";
        String meat = "Сова ест мышь";
        if (food instanceof Meat){
            System.out.println(meat);
        } else System.out.println(grass);
    }
}
