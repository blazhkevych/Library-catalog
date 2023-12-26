package LibraryCatalog.Interfaces;

/**
 * Интерфейс (для газеты, книги и альманаха)
 */
public interface LibraryItem {

    // Вывод на экран
    void display();

    // Поиск по названию
    boolean searchByTitle(String title);

    // Поиск по автору
    boolean searchByAuthor(String author);


}
