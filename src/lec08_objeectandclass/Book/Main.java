package lec08_objeectandclass.Book;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert C. Martin", 25.0);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 30.0);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
