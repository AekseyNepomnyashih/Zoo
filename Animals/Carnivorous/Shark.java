package Zoo.Animals.Carnivorous;

import Zoo.Animals.Animal;
import Zoo.Animals.Swim;
import Zoo.Food.Food;
import Zoo.Food.Meat;

public class Shark extends Carnivorous implements Swim{
    @Override
    public String swim() {
        String swim = "Акула плавает в аквариуме";
        return swim;
    }

    @Override
    public void eat(Food food){
        String meat = "Акула ест мясо";
        String grass = "Акула не ест водоросли";
        super.eat(food);
        if (food instanceof Meat){
            System.out.println(meat);
        } else System.out.println(grass);

    }
}
