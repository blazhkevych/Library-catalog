package LibraryCatalog.TestInit;

import LibraryCatalog.CatalogItems.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestBookInit {
    private static List<String> authors = generateAuthors();
    private static List<String> genres = generateGenres();
    private static List<String> bookTitles = generateBookTitles();

    private static List<String> generateAuthors() {
        // Здесь можно добавить реальных авторов
        List<String> authors = new ArrayList<>();
        authors.add("William Shakespeare");
        authors.add("Agatha Christie");
        authors.add("Barbara Cartland");
        authors.add("Danielle Steel");
        authors.add("Harold Robbins");
        authors.add("Georges Simenon");
        authors.add("Enid Blyton");
        authors.add("J. K. Rowling");
        authors.add("Sidney Sheldon");
        authors.add("Eiichiro Oda");
        authors.add("Gilbert Patten");
        authors.add("Tom Clancy");
        authors.add("Dr. Seuss");
        authors.add("Akira Toriyama");
        authors.add("Leo Tolstoy");
        authors.add("Corín Tellado");
        authors.add("Dean Koontz");
        authors.add("Jackie Collins");
        authors.add("Horatio Alger");
        authors.add("Nora Roberts");
        authors.add("EM Forster");
        authors.add("AS Byatt");
        authors.add("Kingsley Amis");
        authors.add("Laurence Sterne");
        authors.add("Sally Rooney");
        authors.add("Guy Gunaratne");
        authors.add("David Chariandy");
        authors.add("Jessie Greengrass");
        authors.add("Eley Williams");
        authors.add("David Almond");
        authors.add("Martin Amis");
        authors.add("Valerie Anand");
        authors.add("Julie Andrews");
        authors.add("Sam Angus");
        authors.add("Jane Austen");
        authors.add("Miguel de Cervantes");
        authors.add("Alexandre Dumas");
        authors.add("Charles Dickens");
        authors.add("Arthur Conan Doyle");
        authors.add("Victor Hugo");
        authors.add("Jules Verne");
        authors.add("Rick Riordan");
        authors.add("Ernest Hemingway");
        authors.add("Jack Higgins");
        authors.add("Isaac Asimov");
        authors.add("Leon Uris");
        authors.add("Rachel Cusk");
        authors.add("WG Sebald");
        authors.add("Rudyard Kipling");
        authors.add("George Orwell");

        return authors;
    }

    private static List<String> generateGenres() {
        // Здесь можно добавить реальные жанры
        List<String> genres = new ArrayList<>();
        genres.add("Action/Adventure");
        genres.add("Children's");
        genres.add("Classic");
        genres.add("Contemporary");
        genres.add("Fantasy");
        genres.add("Graphic Novel");
        genres.add("Historical Fiction");
        genres.add("Horror");
        genres.add("LGBTQ+");
        genres.add("Literary Fiction");
        genres.add("Mystery");
        genres.add("New Adult");
        genres.add("Romance");
        genres.add("Science Fiction");
        genres.add("Thriller");
        genres.add("Western");
        genres.add("Biography");
        genres.add("Memoir");
        genres.add("Self-Help");
        genres.add("Business");
        genres.add("Cookbook");
        genres.add("Travel");
        genres.add("History");
        genres.add("Science");
        genres.add("Art");
        genres.add("Poetry");
        genres.add("Essay");
        genres.add("Humor");
        genres.add("Sports");
        genres.add("True Crime");
        genres.add("Dystopian");
        genres.add("Steampunk");
        genres.add("Urban Fantasy");
        genres.add("Paranormal Romance");
        genres.add("Magical Realism");
        genres.add("Cyberpunk");
        genres.add("Space Opera");
        genres.add("Hard-Boiled");
        genres.add("Cozy Mystery");
        genres.add("Epic Fantasy");
        genres.add("Gothic");
        genres.add("Sword and Sorcery");
        genres.add("Dark Fantasy");
        genres.add("Chick Lit");
        genres.add("Bildungsroman");
        genres.add("Satire");
        genres.add("Tragedy");
        genres.add("Comedy");
        genres.add("Psychological");

        return genres;
    }

    private static List<String> generateBookTitles() {
        // Здесь можно добавить реальные названия книг
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("The Catcher in the Rye");
        bookTitles.add("To Kill a Mockingbird");
        bookTitles.add("The Hitchhiker's Guide to the Galaxy");
        bookTitles.add("The Handmaid's Tale");
        bookTitles.add("The Hunger Games");
        bookTitles.add("The Fault in Our Stars");
        bookTitles.add("The Girl with the Dragon Tattoo");
        bookTitles.add("The Da Vinci Code");
        bookTitles.add("The Kite Runner");
        bookTitles.add("The Lord of the Rings");
        bookTitles.add("Harry Potter and the Philosopher's Stone");
        bookTitles.add("The Chronicles of Narnia");
        bookTitles.add("The Little Prince");
        bookTitles.add("Alice's Adventures in Wonderland");
        bookTitles.add("The Lion, the Witch and the Wardrobe");
        bookTitles.add("The Hobbit");
        bookTitles.add("Animal Farm");
        bookTitles.add("Nineteen Eighty-Four");
        bookTitles.add("Brave New World");
        bookTitles.add("Fahrenheit 451");
        bookTitles.add("The Giver");
        bookTitles.add("Divergent");
        bookTitles.add("The Maze Runner");
        bookTitles.add("The Perks of Being a Wallflower");
        bookTitles.add("The Book Thief");
        bookTitles.add("The Alchemist");
        bookTitles.add("Life of Pi");
        bookTitles.add("The Secret Life of Bees");
        bookTitles.add("The Help");
        bookTitles.add("The Color Purple");
        bookTitles.add("The Picture of Dorian Gray");
        bookTitles.add("Pride and Prejudice");
        bookTitles.add("Jane Eyre");
        bookTitles.add("Wuthering Heights");
        bookTitles.add("Frankenstein");
        bookTitles.add("Dracula");
        bookTitles.add("The Strange Case of Dr. Jekyll and Mr. Hyde");
        bookTitles.add("The Adventures of Sherlock Holmes");
        bookTitles.add("The Hound of the Baskervilles");
        bookTitles.add("The Three Musketeers");
        bookTitles.add("The Count of Monte Cristo");
        bookTitles.add("Les Misérables");
        bookTitles.add("The Phantom of the Opera");
        bookTitles.add("Don Quixote");
        bookTitles.add("War and Peace");
        bookTitles.add("Crime and Punishment");
        bookTitles.add("The Brothers Karamazov");
        bookTitles.add("Anna Karenina");
        bookTitles.add("The Master and Margarita");

        return bookTitles;
    }

    public static Book createRandomBook() {
        Random random = new Random();
        String author = getRandomElement(authors);
        String genre = getRandomElement(genres);
        String title = getRandomElement(bookTitles);
        int pageCount = random.nextInt(500) + 50; // Генерация случайного количества страниц

        return new Book(title, author, genre, pageCount);
    }

    private static <T> T getRandomElement(List<T> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
