package Zoo;

import Zoo.Animals.Animal;
import Zoo.Animals.Carnivorous.Bear;
import Zoo.Animals.Carnivorous.Fox;
import Zoo.Animals.Carnivorous.Shark;
import Zoo.Animals.Herbivore.Duck;
import Zoo.Animals.Herbivore.Elephant;
import Zoo.Animals.Herbivore.Owl;
import Zoo.Food.Food;
import Zoo.Food.Grass;
import Zoo.Food.Meat;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {


        Worker Paulo = new Worker();
        Bear bear = new Bear();
        Fox fox = new Fox();
        Shark shark = new Shark();
        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Owl owl = new Owl();
        Grass grass = new Grass();
        Meat meat = new Meat();

        // Методы животного
        bear.run();
        bear.swim();
        bear.eat(grass);
        System.out.println();

        // Методы работника зоопарка
        Paulo.feed(bear, meat);
        Paulo.feed(bear, grass);
        System.out.println();


        Paulo.getVoice(duck);
        Paulo.getVoice(fox);
        System.out.println();

        // Пруд - массив 1
      /*Animal [] pool = {bear,duck, shark};
        for (Animal i: pool) {
            System.out.println(i.swim());
        }*/

        // Пруд - массив 2 с Generics
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(bear);
        listOfAnimal.add(shark);
        listOfAnimal.add(duck);
        pool(listOfAnimal);
        }
        private static void pool(List<Animal> list){
        for (Animal animal : list){
            System.out.println(animal.swim());
        }
        }


    }

