package LibraryCatalog.CatalogItems;

import LibraryCatalog.Interfaces.LibraryItem;

import java.io.Serializable;
import java.util.List;

public class Almanac implements LibraryItem, Serializable {
    private String title;
    private List<Book> books; // Список книг в альманахе

    public Almanac(String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Дополнительные методы для управления списком книг в альманахе
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void display() {
        System.out.println("Almanac: " + title);
        System.out.println("Books in the Almanac:\n");

        // добавить перед выводом каждой книги в альманахе порядковый номер книги начиная с 1
        int i = 1;
        for (Book book : books) {
            System.out.println("Book #" + i);
            book.display();
            i++;
        }
        i = 1;
    }

    @Override
    public boolean searchByTitle(String searchTitle) {
        for (Book book : books) {
//            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
//                return true;
//            }
            if (book.searchByTitle(searchTitle)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchByAuthor(String searchAuthor) {
        for (Book book : books) {
//            if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
//                return true;
//            }
            if (book.searchByAuthor(searchAuthor)) {
                return true;
            }
        }
        return false;
    }
}
