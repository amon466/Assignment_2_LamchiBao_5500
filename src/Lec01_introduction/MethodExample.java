package Lec01_introduction;

public class MethodExample {

    public static void message1() {
        System.out.println("DAY LA NHAN TIN ");
    }

    public static void message2() {
        System.out.println("DAY LA NHAN TIN ");
        message1();
        System.out.println("hoan thanh nha tin so 2 ");
    }

    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("done with main");
    }
}
