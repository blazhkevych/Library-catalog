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
 * - Список книг (массив интерфейсов)
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
 *  (агрегирует классы тестовой инициализации для книг, газет и альманахов)
 *  - массив с книгами, газетами и альманахами (через интерфейс)
 *
 * - КЛАСС Тестовая инициализация для книг (отдельная статическая фабрика для создания каталога с тестовыми данными)
 *
 * - КЛАСС Тестовая инициализация для газет (отдельная статическая фабрика для создания каталога с тестовыми данными)
 *
 * - КЛАСС Тестовая инициализация для альманахов (отдельная статическая фабрика для создания каталога с тестовыми данными)
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
 * - КЛАСС Газета
 * - Название
 * - Автор (поле заглушка для полиморфной работы, использоваться не будет нигде)
 * - Дата выхода
 * - Список заголовков (массив строк)
 * <p>
 * - КЛАСС Альманах
 * - Название
 * - Список книг (массив интерфейсов)
 * <p>
 * Интерфейс (для газеты, книги и альманаха):
 * Виртуальные абстрактные методы:
 * - Вывод на экран
 * - Поиск по названию
 * - Поиск по автору
 *
 * Дополнительные материалы по заданию:
 * https://refactoring.guru/ru/design-patterns/bridge - паттерн мост (видео 2,26)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}