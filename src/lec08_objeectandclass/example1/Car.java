package lec08_objeectandclass.example1;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displaydetails() {
        System.out.println("car model: " + model + "year:  " + year);
    }

}