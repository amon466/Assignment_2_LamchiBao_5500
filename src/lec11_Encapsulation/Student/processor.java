
package lec11_Encapsulation.Student;

public class processor {
    public static void main(String[] args) {
       Student student1 = new Student("SV001", "LCB");
       student1.addGrade(8);
       student1.addGrade(7.5);
       student1.addGrade(9);
       student1.display();
       Student student2 = new Student();
        student2.addInfo();
        student2.display();
    }
}
