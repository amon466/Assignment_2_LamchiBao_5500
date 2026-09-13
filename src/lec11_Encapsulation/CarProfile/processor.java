package lec11_Encapsulation.CarProfile;

public class processor {

    public static void main(String[] args) {

        CarProfile car1 = new CarProfile("Toyota", "Camry", 2024);

        CarProfile car2 = new CarProfile();
        car1.displayinfor();
        car2.enterInfor();
        car2.displayinfor();
    }
}
