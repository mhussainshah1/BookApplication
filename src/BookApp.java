/**
 * Create a project in IntelliJ called BookApplication.
 *
 * Create a Book class that allows for Book title, author, description, price and isInStock variables
 *
 * The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method
 * called getDisplayText() which prints the author, title and description.
 *
 *
 * The application shall also contain getters and setters for each private member variable.
 *
 * Create another class called BookApp which contains the main method. In the main method you shall create an instance
 * of a Book and print the Author, Title and Description.
 *
 * Publish your solution to GitHub and submit your GitHub url as the assignment.
 */
public class BookApp {
    public static void main(String[] args) {
        Book book = new Book("Oracle Certified Associate JavaSE 8 Programmer I Study Guide Exam 1Z0-808",
                "Jeanne Boyarsky & Scott Selikoff","OCAJP Exam guide",98.56, true);
        System.out.println(book.getDisplayText());
    }
}
