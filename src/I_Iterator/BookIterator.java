package I_Iterator;

import java.util.Iterator;


public class BookIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;

    public BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext () {
        return index < bookShelf.getSize();
    }

    public Object next () {
        if (!hasNext()) {
            return null;
        }
        return bookShelf.getBookAt(index++);
    }
}
