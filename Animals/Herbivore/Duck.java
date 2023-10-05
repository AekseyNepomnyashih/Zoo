package Zoo.Animals.Herbivore;

import Zoo.Animals.*;
import Zoo.Food.Food;
import Zoo.Food.Grass;

public class Duck extends Herbivore implements Fly, Swim, Run, Voice {
    @Override
    public String fly() {
        String fly = "Утка летает";
        return fly;
    }

    @Override
    public String run() {
        String run = "Утка ,бегает по территории";
        return run;
    }

    @Override
    public String swim() {
        String swim = "Утка плавает в пруду";
        return swim;
    }
    @Override
    public String voice(){
    String voice = "Утка крякает";
    return voice;
    }
    @Override
    public void eat(Food food){
        String grass = "Утка щиплет травку";
        String meat = "Утка не ест мясо";
        super.eat(food);
        if (food instanceof Grass){
            System.out.println(grass);
        } else System.out.println(meat);
    }
}
