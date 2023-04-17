package HashMap_Practice;


import java.util.HashMap;

public class Book {
        private int id;
        private String author;
        private String publisher;
        private int quantity;

        public Book(int id, String author, String publisher, int quantity) {
            this.id = id;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public String getAuthor() {
            return author;
        }

        public String getPublisher() {
            return publisher;
        }

        public int getQuantity() {
            return quantity;
        }

        public static void main(String[] args) {
            HashMap<Integer, Book> bookMap = new HashMap<>();


            Book book1 = new Book(1, "Stephen King", "Scribner", 10);
            bookMap.put(book1.getId(), book1);

            Book book2 = new Book(2, "J.K. Rowling", "Bloomsbury Publishing", 20);
            bookMap.put(book2.getId(), book2);

            Book book3 = new Book(3, "George Orwell", "Secker & Warburg", 30);
            bookMap.put(book3.getId(), book3);


            System.out.println("Keys: " + bookMap.keySet());


            for (Book book : bookMap.values()) {
                System.out.println("Id: " + book.getId() + ", Author: " + book.getAuthor() +
                        ", Publisher: " + book.getPublisher() + ", Quantity: " + book.getQuantity());
            }
        }




    }

