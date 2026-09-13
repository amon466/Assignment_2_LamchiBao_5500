package lec11_Encapsulation.CarProfile;

import java.util.Scanner;

public class CarProfile {

    private String make;
    private String model;
    private int year;

    public CarProfile() {

    }

    public CarProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayinfor() {
        System.out.println("Make = " + getMake()
                + " Model = " + getModel()
                + " Year = " + getYear());
    }

    public void enterInfor() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter make = ");
        setMake(scanner.nextLine());
        System.out.println("Enter model = ");
        setModel(scanner.nextLine());
        System.out.println("Enter year = ");
        setYear(scanner.nextInt());
    }
}
