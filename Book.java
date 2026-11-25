public class Book {

    // 1. Private Attributes (Encapsulation)
    private String title;
    private String author;
    private double price;
    private int year;

    // 2. Static Attribute (shared by all objects)
    private static int bookCount = 0;

    // 3. Default Constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 1.0;
        this.year = 2026;
        bookCount++;
    }

    // 4. Parameterized Constructor (with validation)
    public Book(String title, String author, double price, int year) {
        // Use setters to reuse validation logic
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setYear(year);
        bookCount++;
    }

    // 5. Copy Constructor
    public Book(Book other) {
        this(other.title, other.author, other.price, other.year);
    }

    // 6. Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public static int getBookCount() {
        return bookCount;
    }

    // 7. Setters with Validation
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. Keeping previous value.");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author. Keeping previous value.");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Must be > 0.");
        }
    }

    public void setYear(int year) {
        if (year >= 1400 && year <= 2026) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Must be between 1400 and 2026.");
        }
    }

    // 8. Behavior
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price + " DA");
        System.out.println("Year : " + year);
        System.out.println("----------------------------------------");
    }

    // 9. Behavior with logic
    public boolean isRecent() {
        return year >= 2020;
    }

    // 10. Static behavior
    public static void resetCounter() {
        bookCount = 0;
        System.out.println("Book counter has been reset.");
    }
}