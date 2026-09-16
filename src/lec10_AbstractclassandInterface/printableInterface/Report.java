package lec10_AbstractclassandInterface.printableInterface;

public class Report implements Printable {

    public String Title;

    public Report(String Title) {
        this.Title = Title;
    }

    public Report() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Override
    public void Printable() {
        System.out.println("report title: " + getTitle());
    }

}
