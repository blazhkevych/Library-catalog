package LibraryCatalog;

import LibraryCatalog.CatalogItems.Almanac;
import LibraryCatalog.CatalogItems.Book;
import LibraryCatalog.CatalogItems.Newspaper;
import LibraryCatalog.Interfaces.LibraryItem;
import LibraryCatalog.SerializationDeserialization.SerializationBridge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<LibraryItem> items;
    private SerializationBridge serializationBridge;

    public Catalog() {
        this.items = new ArrayList<>();
        this.serializationBridge = new SerializationBridge() {
            @Override
            public byte[] serialize(Catalog catalog) {
                return new byte[0];
            }

            @Override
            public Catalog deserialize(byte[] data) {
                return null;
            }
        };
    }

    public Catalog(SerializationBridge serializationBridge) {
        this.serializationBridge = serializationBridge;
    }

    public void addBook(Book book) {
        items.add(book);
    }

    public void addNewspaper(Newspaper newspaper) {
        items.add(newspaper);
    }

    public void addAlmanac(Almanac almanac) {
        items.add(almanac);
    }

    public void removeBook(int idBook) {
        items.remove(idBook);
    }

    public void removeNewspaper(int idNewspaper) {
        items.remove(idNewspaper);
    }

    public void removeAlmanac(int idAlmanac) {
        items.remove(idAlmanac);
    }

    // поиск по названию книги или газеты
    public void searchByTitle(String title) {
        // флажок книга или газета найдена, или нет
        boolean isItemFound = false;
        for (LibraryItem item : items) {
            if (item instanceof Book || item instanceof Newspaper) {
                if (item.searchByTitle(title)) {
                    int id = items.indexOf(item);
                    System.out.println("id of the " + item.getClass().getSimpleName() + " is " + id);
                    item.display();
                    // книга или газета найдена
                    isItemFound = true;
                }
            }
        }
        // если флажок в false, то книга или газета не найдена и выводим сообщение об этом
        if (!isItemFound) {
            System.out.println("Book with title " + "--> " + "`" + title + "`" + " <--" + " not found");
        }
    }

    // поиск по автору книги
    public void searchByAuthor(String author) {
        // флажок книга найдена, или нет
        boolean isItemFound = false;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (item.searchByAuthor(author)) {
                    int id = items.indexOf(item);
                    System.out.println("id of the " + item.getClass().getSimpleName() + " is " + id);
                    item.display();
                    // книга найдена
                    isItemFound = true;
                }
            }
        }
        // если флажок в false, то книга не найдена и выводим сообщение об этом
        if (!isItemFound) {
            System.out.println("Book with author " + "--> " + "`" + author + "`" + " <--" + " not found");
        }
    }

    // Метод подсчета количества книг в каталоге
    public int countBooks() {
        int count = 0;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                count++;
            }
        }
        return count;
    }

    // Метод подсчета количества газет в каталоге
    public int countNewspapers() {
        int count = 0;
        for (LibraryItem item : items) {
            if (item instanceof Newspaper) {
                count++;
            }
        }
        return count;
    }

    // Метод подсчета количества альманахов в каталоге
    public int countAlmanacs() {
        int count = 0;
        for (LibraryItem item : items) {
            if (item instanceof Almanac) {
                count++;
            }
        }
        return count;
    }

    public void displayCatalog() {
        displayCatalogLibraryHeader();
        displayCatalogBooks();
        displayCatalogNewspapers();
        displayCatalogAlmanac();
    }

    // Вывести "В каталоге находится альманахов:" и вывести все альманахи
    private void displayCatalogAlmanac() {
        int countAlmanacs = countAlmanacs();
        System.out.println("*".repeat(40));
        System.out.println("\tВ каталоге находится " + countAlmanacs + " альманахов:");
        System.out.println("*".repeat(40));
        int i = 1;
        int idAlmanac = -1;
        for (LibraryItem item : items) {
            idAlmanac++;
            if (item instanceof Almanac) {
                Almanac almanac = (Almanac) item;
                System.out.println("Almanac #" + i + " (id: " + idAlmanac + ")");
                almanac.display();
                i++;
            }
        }
    }

    // Вывести "В каталоге находится газет:" и вывести все газеты
    private void displayCatalogNewspapers() {
        int countNewspapers = countNewspapers();
        System.out.println("*".repeat(40));
        System.out.println("\tВ каталоге находится " + countNewspapers + " газет::");
        System.out.println("*".repeat(40));
        int i = 1;
        int idNewspaper = -1;
        for (LibraryItem item : items) {
            idNewspaper++;
            if (item instanceof Newspaper) {
                Newspaper newspaper = (Newspaper) item;
                System.out.println("Newspaper #" + i + " (id: " + idNewspaper + ")");
                newspaper.display();
                i++;
            }
        }
    }

    // Вывести "В каталоге находится книг:" и вывести все книги
    private void displayCatalogBooks() {
        int countBooks = countBooks();
        System.out.println("*".repeat(40));
        System.out.println("\tВ каталоге находится " + countBooks + " книг:");
        System.out.println("*".repeat(40));
        int i = 1;
        int idBook = -1;
        for (LibraryItem item : items) {
            idBook++;
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Book #" + i + " (id: " + idBook + ")");
                book.display();
                i++;
            }
        }
    }

    // Вывести "Каталог библиотеки"
    private static void displayCatalogLibraryHeader() {
        System.out.println("*".repeat(40));
        System.out.println("********** Каталог библиотеки **********");
        System.out.println("*".repeat(40));
        System.out.println();
    }

    // Метод для сохранения каталога в файл
    public void saveCatalogToFile(String filePath) {
        byte[] serializedData = serializationBridge.serialize(this);
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            if (serializedData != null) {
                fos.write(serializedData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для восстановления каталога из файла
    public void loadCatalogFromFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] data = fis.readAllBytes();
            Catalog loadedCatalog = serializationBridge.deserialize(data);
            if (loadedCatalog != null) {
                this.items = loadedCatalog.items;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
