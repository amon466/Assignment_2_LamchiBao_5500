package lec11_Encapsulation.Getset;

import java.util.Scanner;

public class Student {

    private String studenid;
    private float gpa;

    public static String university = "vn-us";
    public static int count=0;

    public Student() {
        count = count + 1;

    }

    public Student(String studenid, float gpa) {
        this.studenid = studenid;
        this.gpa = gpa;
        count = count + 1;
    }

    public String getStudenid() {
        return studenid;
    }

    public float getGpa() {
        return gpa;
    }

    public void setStudenid(String studenid) {
        this.studenid = studenid;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void displayinfor() {
        System.out.println("studen id =" + getStudenid() + "gpa:" + getGpa());
    }

    public void enterInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student id= ");
        String studentid = scanner.nextLine();
        setStudenid(studenid);
        System.out.println("gpa= ");
        setGpa(scanner.nextFloat());

    }
    public static void hello(){
        System.out.println("hello vn-us");
    }

}
