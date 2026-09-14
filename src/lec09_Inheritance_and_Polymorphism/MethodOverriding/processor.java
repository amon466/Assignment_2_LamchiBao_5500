package lec09_Inheritance_and_Polymorphism.MethodOverriding;

public class processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makesound();
        Dog dog = new Dog();
        dog.makesound();
    }

}
