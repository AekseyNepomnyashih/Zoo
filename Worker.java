package Zoo;

import Zoo.Animals.Animal;
import Zoo.Food.Food;


public  class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public Animal getVoice(Animal animal){
        System.out.println(animal.voice());
        return animal;
   }
}
