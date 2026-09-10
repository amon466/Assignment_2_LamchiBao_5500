package lec08_objeectandclass.Student;

public class Main {

   public static void main(String[] args) {
        student student1 = new student("S001", "An Nguyen", "IT");
        student student2 = new student("S002", "Binh Tran", "SE");

        student1.displayInfo();
        student2.displayInfo();
    }
}
