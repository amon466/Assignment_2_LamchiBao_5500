package lec09_Inheritance_and_Polymorphism.Upcasting;

import java.util.ArrayList;

public class processor {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        int dogcount = 0;
        int catcount = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogcount++;

            } else if (animal instanceof Cat) {
                catcount++;
            }

        }
        System.out.println("cat: " + catcount + "dog: " + dogcount);    
    }

}
