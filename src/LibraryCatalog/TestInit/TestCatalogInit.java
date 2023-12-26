package LibraryCatalog.TestInit;

import LibraryCatalog.Catalog;

public class TestCatalogInit {

    public static Catalog createRandomCatalog() {
        Catalog catalog = new Catalog();

        // Добавить в каталог случайное количество от 3 до 7 случайных книг
        int randomBooksCount = (int) (Math.random() * 5) + 3;
        for (int i = 0; i < randomBooksCount; i++) {
            catalog.addBook(TestBookInit.createRandomBook());
        }

        // Добавить в каталог случайное количество от 3 до 7 случайных газет
        int randomNewspapersCount = (int) (Math.random() * 5) + 3;
        for (int i = 0; i < randomNewspapersCount; i++) {
            catalog.addNewspaper(TestNewspaperInit.createRandomNewspaper());
        }

        // Добавить в каталог случайное количество от 3 до 7 случайных альманахов
        int randomAlmanacsCount = (int) (Math.random() * 5) + 3;
        for (int i = 0; i < randomAlmanacsCount; i++) {
            catalog.addAlmanac(TestAlmanacInit.createRandomAlmanac());
        }

        return catalog;
    }
}
