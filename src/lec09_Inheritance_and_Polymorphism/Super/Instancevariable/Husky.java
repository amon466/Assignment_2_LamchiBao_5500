package lec09_Inheritance_and_Polymorphism.Super.Instancevariable;

public class Husky extends Dog {

    int price = 1500;

    public void displayprice() {
        System.out.println("dog price" + super.price);
        System.out.println("husky price" + price);
    }
}
