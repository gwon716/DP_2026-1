package hw.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private List<Book> sortedBooks;
    private int index;

    public YearIterator(BookShelf bookShelf, String genre) {
        this.sortedBooks = new ArrayList<>();
        
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book book = bookShelf.getBookAt(i);
            if (book.getGenre().equals(genre)) {
                sortedBooks.add(book);
            }
        }
        sortedBooks.sort((b1, b2) -> b2.getYear() - b1.getYear());
    }

    @Override
    public boolean hasNext() {
       return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
       return sortedBooks.get(index++);
    }
    
}
