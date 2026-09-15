package lec10_AbstractclassandInterface.Interface.Example1;

public class Cricle implements IShape, Icolor {

    @Override
    public void drawshape() {
        System.out.println("drawing a cricle");    
    }

    @Override
    public void fillcolor() {
        System.out.println("make a color");
    }

}
