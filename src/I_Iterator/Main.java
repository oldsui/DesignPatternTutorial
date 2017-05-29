package I_Iterator;


public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        for (int i = 1; i < 10; i++) {
            bookShelf.appendBook(new Book("book_" + i));
        }

        BookIterator bookIterator = (BookIterator) bookShelf.iterator();

        while(bookIterator.hasNext()) {
            Book currentBook = (Book)bookIterator.next();
            System.out.println("Book name: " + currentBook.getName());
        }

    }

}
