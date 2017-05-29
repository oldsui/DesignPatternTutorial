package I_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Aggregate {


    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
        this.iterator();
    }

    public Iterator iterator() {
        return new BookIterator(this);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int i) {
        return books.get(i);
    }

    public int getSize() {
        return books.size();
    }
}
