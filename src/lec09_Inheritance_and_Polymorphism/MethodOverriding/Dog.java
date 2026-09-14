package lec09_Inheritance_and_Polymorphism.MethodOverriding;

public class Dog extends Animal {

    @Override
    public void makesound() {
        System.out.println("gau gau");
    }

}
