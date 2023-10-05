package Zoo.Animals.Carnivorous;

import Zoo.Animals.Run;
import Zoo.Animals.Voice;
import Zoo.Food.Food;
import Zoo.Food.Meat;

public class Fox extends Carnivorous implements Run, Voice {

    @Override
    public String run(){
        String run = "Лиса бегает по территории";
        System.out.println(run);
        return run;
    }
    @Override
    public String voice(){
        String voice = "Лиса издает неведомые звуки";
        return voice;
    }
    @Override
    public void eat(Food food){
        String meat = "Лиса кушает мясо";
        String grass = "Лиса не ест траву";
        super.eat(food);
        if (food instanceof Meat){
            System.out.println(meat);
        } else System.out.println(grass);

    }
}
