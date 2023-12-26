import LibraryCatalog.CatalogItems.Almanac;
import LibraryCatalog.CatalogItems.Book;
import LibraryCatalog.Catalog;
import LibraryCatalog.CatalogItems.Newspaper;
import LibraryCatalog.TestInit.TestAlmanacInit;
import LibraryCatalog.TestInit.TestBookInit;
import LibraryCatalog.TestInit.TestCatalogInit;
import LibraryCatalog.TestInit.TestNewspaperInit;

import java.util.Scanner;

/**
 * Практика на наследование и полиморфизм.
 * <p>
 * Разработать приложение «Каталог библиотеки». В библиотеке могут храниться книги, газеты и альманахи (сборники произведений нескольких авторов).
 * Для книги у нас должен быть автор книги, название книги, жанр, количество страниц.
 * Для газеты должно быть название газеты, дата выхода номера газеты, перечень основных заголовков газеты.
 * Для альманаха должно быть название альманаха и перечень произведений (книг), которые в нем напечатаны.
 * Разработать интерфейсный класс с необходимым перечнем виртуальных абстрактных методов.
 * Для каталога предусмотреть возможность тестовой инициализации, вывода всего каталога на экран, поиск по названию книги или газеты, поиск по автору.
 * Должно быть предусмотрено сохранение каталога в файл и восстановление каталога из файла.
 * <p>
 * <p>
 * Классы:
 * <p>
 * - КЛАСС Каталог
 * - Список книг, газет, альманахов (массив интерфейсов)
 * - Вывод на экран
 * - Поиск по названию
 * - Поиск по автору
 * Методы:
 * - Добавление книги
 * - Добавление газеты
 * - Добавление альманаха
 * - Удаление книги
 * - Удаление газеты
 * - Удаление альманаха
 * - Поиск по названию
 * - Поиск по автору
 * - Вывод на экран (выводит все книги, газеты и альманахи) (переопределить toString)
 *
 * <p>
 * - КЛАСС Тестовая инициализация для каталога (отдельная статическая фабрика для создания каталога с тестовыми данными)
 * - массив с книгами, газетами и альманахами (через интерфейс)
 * <p>
 * - КЛАСС Тестовая инициализация для книг (отдельная статическая фабрика для создания каталога с тестовыми данными). Которая создает случайную книгу.
 * <p>
 * - КЛАСС Тестовая инициализация для газет (отдельная статическая фабрика для создания каталога с тестовыми данными). Которая создает случайную газету.
 * <p>
 * - КЛАСС Тестовая инициализация для альманахов (отдельная статическая фабрика для создания каталога с тестовыми данными). Которая создает случайный альманах.
 * <p>
 * - КЛАСС статический SaveLoad (Сохранение каталога в файл и восстановление каталога из файла)
 * (через байтики, через двоичный код, через сериализацию)
 * Методы:
 * - Сохранение каталога в файл (сериализация, принимает каталог и путь к файлу для сохранения)
 * - Восстановление каталога из файла (де-сериализация, принимает путь к файлу для восстановления, возвращает каталог)
 * <p>
 * - КЛАСС Книга
 * - Название
 * - Автор
 * - Жанр
 * - Количество страниц
 * <p>
 * - КЛАСС Газета:
 * - Название
 * - Автор (поле заглушка для полиморфной работы, использоваться не будет нигде)
 * - Дата выхода
 * - Список заголовков (массив строк)
 * <p>
 * - КЛАСС Альманах
 * - Название
 * - Список книг (массив книг)
 * <p>
 * Интерфейс (для газеты, книги и альманаха):
 * Виртуальные абстрактные методы:
 * - Вывод на экран
 * - Поиск по названию
 * - Поиск по автору
 * <p>
 * Дополнительные материалы по заданию:
 * https://refactoring.guru/ru/design-patterns/bridge - паттерн мост (видео 2,26)
 */

public class Main {

    // Метод теста книги
    public static void testBook() {
        System.out.println("````````````````````````````````````````testBook Start````````````````````````````````````````\n");

        Book randomBook = TestBookInit.createRandomBook();
        randomBook.display();

        System.out.println("````````````````````````````````````````testBook End````````````````````````````````````````");
    }

    // Метод теста газеты
    public static void testNewspaper() {
        System.out.println("````````````````````````````````````````testNewspaper Start````````````````````````````````````````\n");

        Newspaper randomNewspaper = TestNewspaperInit.createRandomNewspaper();
        randomNewspaper.display();

        System.out.println("````````````````````````````````````````testNewspaper End````````````````````````````````````````");
    }

    // Метод теста альманаха
    public static void testAlmanac() {
        System.out.println("````````````````````````````````````````testAlmanac Start````````````````````````````````````````\n");

        Almanac almanac = TestAlmanacInit.createRandomAlmanac();
        almanac.display();

        System.out.println("````````````````````````````````````````testAlmanac End````````````````````````````````````````");
    }

    // Метод теста каталога
    public static void testCatalog() {
        System.out.println("````````````````````````````````````````testCatalog Start````````````````````````````````````````\n");

        Catalog catalog = TestCatalogInit.createRandomCatalog();
        System.out.println("*".repeat(150));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tИсходный каталог:");
        System.out.println("*".repeat(150));
        System.out.println();

        // Вывести по центру консоли "Исходный каталог:"
        catalog.displayCatalog();

        System.out.println("*".repeat(150));
        System.out.println("Добавляем в каталог случайный альманах...");
        catalog.addAlmanac(TestAlmanacInit.createRandomAlmanac());

        System.out.println("Добавляем в каталог случайную книгу...");
        catalog.addBook(TestBookInit.createRandomBook());

        System.out.println("Добавляем в каталог случайную газету...");
        catalog.addNewspaper(TestNewspaperInit.createRandomNewspaper());
        System.out.println("*".repeat(150));
        System.out.println();

        // Выводим каталог после добавления новых элементов в него (альманаха, книги и газеты)
        System.out.println("*".repeat(150));
        System.out.println("Каталог после добавления новых элементов в него (альманаха, книги и газеты):");
        System.out.println("*".repeat(150));
        System.out.println();
        catalog.displayCatalog();

        // Поиск по названию книги или газеты (альманахи в поиске не участвуют)
//        System.out.println("*".repeat(150));
//        System.out.println("Поиск по названию книги или газеты (альманахи в поиске не участвуют)");
//        System.out.println("*".repeat(150));
//        System.out.println("Введите название книги или газеты для поиска:");
        Scanner scanner = new Scanner(System.in);
//        String searchTitle = scanner.nextLine();
//        catalog.searchByTitle(searchTitle);
//
//        // Поиск по автору книги (газеты и альманахи в поиске не участвуют)
//        System.out.println("*".repeat(150));
//        System.out.println("Поиск по автору книги (газеты и альманахи в поиске не участвуют)");
//        System.out.println("*".repeat(150));
//        System.out.println("Введите автора книги для поиска:");
//        String searchAuthor = scanner.nextLine();
//        catalog.searchByAuthor(searchAuthor);

        // Удаляем из каталога альманах по индексу (id)
//        System.out.println("*".repeat(150));
//        System.out.println("Удаляем из каталога альманах по индексу (id)");
//        System.out.println("*".repeat(150));
//        System.out.println("Введите индекс (id) альманаха для удаления:");
//        int id = scanner.nextInt();
//
//        catalog.removeAlmanac(id);
//
//        // Выводим каталог после удаления альманаха
//        System.out.println("*".repeat(150));
//        System.out.println("Каталог после удаления альманаха:");
//        System.out.println("*".repeat(150));
//        System.out.println();
//        catalog.displayCatalog();

        // Удаляем из каталога книгу по индексу (id)
//        System.out.println("*".repeat(150));
//        System.out.println("Удаляем из каталога книгу по индексу (id)");
//        System.out.println("*".repeat(150));
//        System.out.println("Введите индекс (id) книги для удаления:");
//        int id = scanner.nextInt();
//
//        catalog.removeBook(id);
//
//        // Выводим каталог после удаления книги
//        System.out.println("*".repeat(150));
//        System.out.println("Каталог после удаления книги:");
//        System.out.println("*".repeat(150));
//        System.out.println();
//        catalog.displayCatalog();

// Удаляем из каталога газету по индексу (id)
//        System.out.println("*".repeat(150));
//        System.out.println("Удаляем из каталога газету по индексу (id)");
//        System.out.println("*".repeat(150));
//        System.out.println("Введите индекс (id) газеты для удаления:");
//        int id = scanner.nextInt();
//
//        catalog.removeNewspaper(id);
//
//        // Выводим каталог после удаления газеты
//        System.out.println("*".repeat(150));
//        System.out.println("Каталог после удаления газеты:");
//        System.out.println("*".repeat(150));
//        System.out.println();
//        catalog.displayCatalog();

        // TODO: Все выше протестировано и работает.

        // Сохраняем каталог в файл
        System.out.println("*".repeat(150));
        System.out.println("Сохраняем каталог в файл");
        System.out.println("*".repeat(150));
        System.out.println("Введите путь к файлу для сохранения каталога:");
        //String path = scanner.nextLine();
        String path = "./catalog.txt";
        catalog.saveCatalogToFile(path);


        System.out.println("````````````````````````````````````````testCatalog End````````````````````````````````````````");
    }

    public static void main(String[] args) {
//        testBook();
//        testNewspaper();
//        testAlmanac();
        testCatalog();
    }
}