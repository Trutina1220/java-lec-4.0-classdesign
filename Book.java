import java.util.ArrayList;

public class Book {
    private String name;
    private double price;
    private int qty;
    private ArrayList<Author> authors = new ArrayList<Author>();

    public Book(){}
    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name,  ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorsName()
    {
        String all ="";
        for (Author author : authors) {
            all += author.getName() + "  ";
        }
        return all;
    }

    public String getAuthorsEmail()
    {
        String all ="";
        for (Author author : authors) {
            all += author.getEmail() + "  ";
        }
        return all;
    }

    public String getAuthorsGender()
    {
        String all ="";
        for (Author author : authors) {
            all += author.getGender() + "  ";
        }
        return all;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + this.getAuthorsName() + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
