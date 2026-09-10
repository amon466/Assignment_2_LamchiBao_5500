package lec08_objeectandclass.Book;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookInfo() {

        System.out.println(title + " : " + author + " : " + price);
    }
}
