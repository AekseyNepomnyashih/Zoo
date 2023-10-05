package Zoo.Animals.Carnivorous;

import Zoo.Animals.Animal;
import Zoo.Animals.Run;
import Zoo.Animals.Swim;
import Zoo.Animals.Voice;
import Zoo.Food.Food;
import Zoo.Food.Meat;

public class Bear extends Carnivorous implements Run, Swim, Voice {

    @Override
    public String run() {
        String run = "Медведь бегает по территории";
        System.out.println(run);
        return run;
    }

    @Override
    public String swim() {
        String swim = "Медведь плавает в бассейне";
       // System.out.println(swim);
        return swim;

    }
    @Override
    public String voice(){
        String voice = "Медведь рычит";
        return voice;
    }


    @Override
    public void eat(Food food){
        String meat = "Медведь кушает мясо";
        String grass = "Медведь предпочитает мясо";
        super.eat(food);
        if (food instanceof Meat){
            System.out.println(meat);
        } else System.out.println(grass);

    }
}
