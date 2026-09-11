package lec11_Encapsulation.Getset;

public class processor {

    public static void main(String[] args) {
        Student student1 = new Student("lcb", 4);
        Student student2 = new Student("lkc", 4);
        Student student3 = new Student();
        student1.displayinfor();
        student2.displayinfor();
        student3.enterInfor();
        student3.displayinfor();
        System.out.println(Student.count);
        System.out.println(Student.university);
        Student.hello();
    }
}
