package lec10_AbstractclassandInterface.diagram;

public class Fulltimeemployee extends diagram {

    private double salary;

    public Fulltimeemployee(double salary) {
        this.salary = salary;
    }

    public Fulltimeemployee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    double CaculateSalary() {
        return getSalary();
    }

}
