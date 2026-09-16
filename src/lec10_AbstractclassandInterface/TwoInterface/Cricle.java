package lec10_AbstractclassandInterface.TwoInterface;

public class Cricle implements colortable, Drawtable {

    @Override
    public void fillcolor() {
        System.out.println("make color red");
    }

    @Override
    public void draw() {
        System.out.println("make draw cricle");
    }

}
