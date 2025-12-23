import java.util.Comparator;
import java.util.TreeSet;

class Book {
    private String title;
    private double price;

    public Book() {
        super();
    }

    public Book(String title, double price) {
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + "\t" + price;
    }
}

class bookcmp implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Book b1 = (Book) obj1;
        Book b2 = (Book) obj2;

        int priceCompare = (int) (b2.getPrice() - b1.getPrice());
        if (priceCompare == 0) {
            priceCompare = b1.getTitle().compareTo(b2.getTitle());
        }
        return priceCompare;
    }
}

public class Bookcompare {
    public static void main(String[] args) {
        bookcmp cmp = new bookcmp();
        TreeSet<Book> books = new TreeSet<>(cmp);

        books.add(new Book("Java Fundamentals", 450.0));
        books.add(new Book("Python Basics", 300.0));
        books.add(new Book("C++ Guide", 300.0));

        System.out.println(books);
    }
}
