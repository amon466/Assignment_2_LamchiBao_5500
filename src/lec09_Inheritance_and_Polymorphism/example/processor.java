package lec09_Inheritance_and_Polymorphism.example;

public class processor {

    public static void main(String[] args) {
        cat cat = new cat();
        System.out.println(cat.source);
        cat.makesound();
        System.out.println("catID: " + cat.CatID);
        cat.catchmouse();
        dog dog = new dog();
        System.out.println(dog.source);
        dog.makesound();
        System.out.println("dogid: " + dog.DogID);
        dog.guardHouse();
    }
}
