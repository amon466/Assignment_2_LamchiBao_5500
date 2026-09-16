
package lec10_AbstractclassandInterface.diagram;


public abstract class diagram {
    String name;

    public diagram(String name) {
        this.name = name;
    }

    public diagram() {
    }

    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayinfor(){
        System.out.println("name"+getName());
    }
    abstract double CaculateSalary();
    
}

