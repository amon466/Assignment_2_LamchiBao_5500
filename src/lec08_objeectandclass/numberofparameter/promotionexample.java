
package lec08_objeectandclass.numberofparameter;
public class promotionexample {
    public static void print(long l, double d) {
        System.out.println("Method 1");
    }

    public static void print(double d, long l) {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        print(5, 5.0);
        print(5.0, 5);
    }
}