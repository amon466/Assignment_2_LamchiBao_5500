package lec09_Inheritance_and_Polymorphism.Upcasting;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (int i = 0; i < 3; i++) {
            animals[i].makesound();
        }
        Animal animal = new Animal();
        System.out.println("source" + animal.source);

    }

}
