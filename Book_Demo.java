class Book {
    private int book_id;
    private String title;
    private String author;
    private double price;
    public static int totalbooks = 0;

    // Fixed constructor signature (added types)
    public Book(int book_id, String title, String author, double price) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.price = price;
        totalbooks++;
    }

    void display() {
        System.out.println("Book Id: " + book_id);
        System.out.println("Title is: " + title);
        System.out.println("Author is: " + author);
        System.out.println("Price is: " + price);
    }

    void search(int id) {
        if (this.book_id == id) {
            System.out.println("BOOK ID: " + book_id);
        } else {
            System.out.println("Book Not Found");
        }
    } // Fixed missing closing brace

    void search(String t) {
        // Fixed method name from equalIsIgnoreCase to equalsIgnoreCase
        if (this.title.equalsIgnoreCase(t)) {
            System.out.println("BOOK Title: " + title);
        } else {
            System.out.println("Book Not Found");
        }
    }

    Book costlier_book(Book b) {
        if (this.price > b.price) 
            return this;
        else 
            return b;
    }
}

public class Book_Demo {
    public static void main(String[] args) {
        // Fixed single quotes (' ') to double quotes (" ") for strings and types in constructor calls
        Book b1 = new Book(101, "Jungle Book", "JK Rowlings", 500);
        Book b2 = new Book(102, "Java Programming", "ABC", 490);
        Book b3 = new Book(103, "Python Programming", "XYZ", 300);
        
        System.out.println("BOOK DETAILS:");
        b1.display();
        b2.display();
        b3.display();
        
        System.out.println("\nSearch Operations:");
        b1.search(101);
        b3.search("Python Programming");
        
        Book costlier = b1.costlier_book(b2);
        System.out.println("\nCostlier book:");
        costlier.display();
        
        System.out.println("Total Book Count: " + Book.totalbooks);
    }
}

