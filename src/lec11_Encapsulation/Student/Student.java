package lec11_Encapsulation.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        grades = new ArrayList<>();
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {

        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (double grade : grades) {
            sum = sum + grade;
        }

        return sum / grades.size();
    }

    public void display() {
        System.out.println("Student id = " + getId());
        System.out.println("Student name = " + getName());
        System.out.println("Grades:");

        for (double grade : grades) {
            System.out.println(grade);
        }
        System.out.println("Average = " + getAverage());
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id = ");
        setId(scanner.nextLine());
        System.out.println("Enter student name = ");
        setName(scanner.nextLine());
        System.out.println("Enter number of grades = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade " + (i + 1) + " = ");
            double grade = scanner.nextDouble();
            addGrade(grade);
        }
    }
}
