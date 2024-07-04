
public class Book {

    private String bookName;
    private int id;

    Book() {
        System.out.println("No perameter");
    }

    Book(String bookName) {
        System.out.println("Book Name: " + bookName);
    }

    Book(String bookName, int id) {
        System.out.println("Book Name: " + bookName + "\nId: " + id);
    }

    public void display(String bookName, int id) {

        System.out.println("Book Name: " + bookName + "\nId: " + id);
    }
   
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Maa");
        Book book3 = new Book("Bela sese", 100);
        book1.display("Bangla", 200);

    }
}
