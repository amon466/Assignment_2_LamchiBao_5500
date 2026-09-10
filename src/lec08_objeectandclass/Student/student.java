package lec08_objeectandclass.Student;

public class student {

    private String studentId;
    private String fullName;
    private String major;

    public student(String studentId, String fullName, String major) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println(studentId + " - " + fullName + " - " + major);
    }
}
