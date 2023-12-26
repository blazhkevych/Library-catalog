package LibraryCatalog.CatalogItems;

import LibraryCatalog.Interfaces.LibraryItem;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private String genre;
    private int pageCount;

    public Book(String title, String author, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Page count: " + pageCount);
        System.out.println();
    }

    @Override
    public boolean searchByTitle(String searchTitle) {
        return title.equalsIgnoreCase(searchTitle);
    }

    @Override
    public boolean searchByAuthor(String searchAuthor) {
        return author.equalsIgnoreCase(searchAuthor);
    }
}
