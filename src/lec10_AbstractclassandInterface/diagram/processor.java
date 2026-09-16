
package lec10_AbstractclassandInterface.diagram;


public class processor {
    public static void main(String[] args) {
        Fulltimeemployee fulltimeemployee =new Fulltimeemployee(5);
        System.out.println("shalary"+fulltimeemployee.CaculateSalary());
        System.out.println("nam"+fulltimeemployee.name);
    }
        
}
