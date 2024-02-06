package LibraryCatalog.CatalogItems;

import LibraryCatalog.Interfaces.LibraryItem;

import java.io.Serializable;
import java.util.List;

public class Newspaper implements LibraryItem, Serializable {
    private String title;
    //private String author; // Поле заглушка для полиморфной работы // Забивать null при создании газеты и не выводить на экран
    private String publicationDate;
    private List<String> headlines; // Список заголовков газеты

    public Newspaper(String title,  String publicationDate, List<String> headlines) {
        this.title = title;
        //this.author = "";
        this.publicationDate = publicationDate;
        this.headlines = headlines;
    }

    public String getAuthor() {
        return "";
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public List<String> getHeadlines() {
        return headlines;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        //this.author = "";
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setHeadlines(List<String> headlines) {
        this.headlines = headlines;
    }

    // Дополнительные методы для управления списком заголовков газеты
    public void addHeadline(String headline) {
        headlines.add(headline);
    }

    public void removeHeadline(String headline) {
        headlines.remove(headline);
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        //System.out.println("Author: " + author); // Забивать null при создании газеты и не выводить на экран
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Headlines:");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
        System.out.println();
    }

    @Override
    public boolean searchByTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    @Override
    public boolean searchByAuthor(String author) {
        return false;
    }
}

