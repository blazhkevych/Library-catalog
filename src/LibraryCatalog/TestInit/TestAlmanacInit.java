package LibraryCatalog.TestInit;

import LibraryCatalog.CatalogItems.Almanac;
import LibraryCatalog.CatalogItems.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAlmanacInit {
    private static List<String> almanacTitles = generateAlmanacTitles();

    private static List<String> generateAlmanacTitles() {
        // Здесь можно добавить реальные названия альманахов
        List<String> titles = new ArrayList<>();
        titles.add("The World Almanac and Book of Facts");
        titles.add("The Old Farmer's Almanac");
        titles.add("The Nautical Almanac");
        titles.add("The Whitaker's Almanack");
        titles.add("The Poor Richard's Almanack");
        titles.add("The American Almanac and Repository of Useful Knowledge");
        titles.add("The Astronomical Almanac");
        titles.add("The Almanac of American Politics");
        titles.add("The Oxford Almanack");
        titles.add("The Almanac of the Dead");
        titles.add("The Almanac of American Letters");
        titles.add("The Almanac of British Politics");
        titles.add("The Almanac of American History");
        titles.add("The Almanac of Modern Terrorism");
        titles.add("The Almanac of Women and Minorities in World Politics");
        titles.add("The Almanac of American Philanthropy");
        titles.add("The Almanac of Canadian Politics");
        titles.add("The Almanac of Science and Technology");
        titles.add("The Almanac of Higher Education");
        titles.add("The Almanac of the Unelected");
        titles.add("The Almanac of the Christian World");
        titles.add("The Almanac of the Environment");
        titles.add("The Almanac of Seapower");
        titles.add("The Almanac of the Canning, Freezing, Preserving Industries");
        titles.add("The Almanac of Transatlantic Politics");
        titles.add("The Almanac of British Literature");
        titles.add("The Almanac of New York City");
        titles.add("The Almanac of American Employers");
        titles.add("The Almanac of Contemporary Judicial Restatements");
        titles.add("The Almanac of Renewable Energy");
        titles.add("The Almanac of Quotations");
        titles.add("The Almanac of the Federal Judiciary");
        titles.add("The Almanac of State Legislatures");
        titles.add("The Almanac of Architecture and Design");
        titles.add("The Almanac of World Military Power");
        titles.add("The Almanac of Irish Politics");
        titles.add("The Almanac of International Jobs and Careers");
        titles.add("The Almanac of European Politics");
        titles.add("The Almanac of American Education");
        titles.add("The Almanac of World War I");
        titles.add("The Almanac of Consumer Markets");
        titles.add("The Almanac of the Executive Branch");
        titles.add("The Almanac of Australian History");
        titles.add("The Almanac of Airpower");
        titles.add("The Almanac of British Columbia");
        titles.add("The Almanac of American Culture");
        titles.add("The Almanac of World Crime");
        titles.add("The Almanac of Canadian Literature");
        titles.add("The Almanac of the Endangered");
        titles.add("The Almanac of the Infamous, the Incredible, and the Ignored");

        return titles;
    }

    public static Almanac createRandomAlmanac() {
        Random random = new Random();
        String title = getRandomElement(almanacTitles);
        List<Book> books = new ArrayList<>();
        int numberOfBooks = random.nextInt(5) + 1;

        for (int i = 0; i < numberOfBooks; i++) {
            books.add(TestBookInit.createRandomBook());
        }

        return new Almanac(title, books);
    }

    private static <T> T getRandomElement(List<T> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }

}
