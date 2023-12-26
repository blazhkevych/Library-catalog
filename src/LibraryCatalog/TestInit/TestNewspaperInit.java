package LibraryCatalog.TestInit;

import LibraryCatalog.CatalogItems.Newspaper;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestNewspaperInit {
    private static List<String> newspaperTitles = generateNewspaperTitles();
    private static List<String> allHeadlines = generateAllHeadlines();


    private static List<String> generateAllHeadlines() {
        // Здесь можно добавить реальные заголовки газет
        List<String> headlines = new ArrayList<>();
        headlines.add("Making a splash: the best – and funniest – Guardian headlines over 200 years");
        headlines.add("Peruvian drug dealers taken down by police squad dressed as Santa Claus");
        headlines.add("First Microbes Breathed Sulfur Before It Was Cool");
        headlines.add("This Toronto Office Burglar Left Behind a Valuable Clue—A Photocopy of His Own Face");
        headlines.add("The Best Funny Headlines: Funny Breaking News");
        headlines.add("Lucas in the sky with diamonds");
        headlines.add("25 Funny Newspaper Headlines to Crack You Up");
        headlines.add("Frog in your throat? Isaac Newton's plague-cure recipe surfaces");
        headlines.add("Queen in rumpus at Palace");
        headlines.add("Biggest asp disaster in the world");
        headlines.add("Weird News - Funny and bizarre stories in the news");
        headlines.add("Boys will be fathers");
        headlines.add("Britain to send patrol ship to Guyana amid Venezuela border dispute");
        headlines.add("Why US double standards on Israel and Russia play into a dangerous game");
        headlines.add("New Zealand mayor clarifies there’s no need to ‘stop pooing’ amid town’s sewerage stench crisis");
        headlines.add("Australia v Pakistan: Boxing Day Test, day one – as it happened");
        headlines.add("BBC reporter captures rare Brocken spectre");
        headlines.add("Plane held over trafficking fears lands in India");
        headlines.add("India's power-hitting global women's cricket star");
        headlines.add("Letters of forbidden love revealed in Spanish archive");
        headlines.add("Netanyahu vows to intensify Gaza campaign");
        headlines.add("Air strike kills Iranian commander in Syria");
        headlines.add("Increased patrols after Dublin restaurant shooting");
        headlines.add("Pope: Free Israeli hostages and end the Gaza war");
        headlines.add("Protesters try to storm city hall in Serbian capital");
        headlines.add("Beijing shivers through coldest December on record");
        headlines.add("Migrant caravan heads for US in 'exodus from poverty'");
        headlines.add("Man dies after Dublin restaurant shooting");
        headlines.add("Demonstrators throw rocks at Belgrade City Hall");
        headlines.add("Christmas dinners from around the world");
        headlines.add("Ukraine celebrates first Christmas on 25 December");
        headlines.add("Netanyahu says Israel paying 'heavy price' for war");
        headlines.add("Two in court over Limerick €21m cocaine seizure");
        headlines.add("Thousands arrested in Sri Lanka anti-drug raids");
        headlines.add("Cat makes history in Sydney to Hobart yacht race");
        headlines.add("Checks at Cologne Cathedral after attack warning");
        headlines.add("Slovakia arrest over threat to copy Prague attack");
        headlines.add("Tanker hit off India coast by drone from Iran - US");
        headlines.add("Explosion at Indonesia nickel plant kills 13 staff");
        headlines.add("Antique box tells heart-breaking and forgotten UK history");
        headlines.add("UK to send warship to Guyana amid Venezuela tensions");
        headlines.add("The Scot who was trusted by Catherine the Great");
        headlines.add("A tour round the world's Christmas lights");
        headlines.add("Stakes are immense as Biden presses Israel to change course");
        headlines.add("Argentine demo organisers told to cover security costs");
        headlines.add("Why there are so many Bollywood deepfakes");
        headlines.add("Biden grants pardons for certain marijuana offences");
        headlines.add("Plane grounded in France over human trafficking fears");
        headlines.add("Will the Supreme Court overrule Colorado's Trump verdict");
        headlines.add("Kenyan ex-minister arrested over graft allegations");

        return headlines;
    }

    private static List<String> generateNewspaperTitles() {
        // Здесь можно добавить реальные названия газет
        List<String> newspaperTitles = new ArrayList<>();
        newspaperTitles.add("The New York Times");
        newspaperTitles.add("The Guardian");
        newspaperTitles.add("The Wall Street Journal");
        newspaperTitles.add("The Washington Post");
        newspaperTitles.add("The Times of India");
        newspaperTitles.add("The Daily Mail");
        newspaperTitles.add("The People's Daily");
        newspaperTitles.add("The Sydney Morning Herald");
        newspaperTitles.add("The Asahi Shimbun");
        newspaperTitles.add("The Globe and Mail");
        newspaperTitles.add("The Independent");
        newspaperTitles.add("The Financial Times");
        newspaperTitles.add("The Los Angeles Times");
        newspaperTitles.add("The Daily Telegraph");
        newspaperTitles.add("The China Daily");
        newspaperTitles.add("The Hindu");
        newspaperTitles.add("The Irish Times");
        newspaperTitles.add("The Times of London");
        newspaperTitles.add("The Straits Times");
        newspaperTitles.add("The Boston Globe");
        newspaperTitles.add("The Jerusalem Post");
        newspaperTitles.add("The Le Monde");
        newspaperTitles.add("The Frankfurter Allgemeine Zeitung");
        newspaperTitles.add("The El País");
        newspaperTitles.add("The Haaretz");
        newspaperTitles.add("The Dawn");
        newspaperTitles.add("The Clarín");
        newspaperTitles.add("The Al-Ahram");
        newspaperTitles.add("The Corriere della Sera");
        newspaperTitles.add("The Yomiuri Shimbun");
        newspaperTitles.add("The Toronto Star");
        newspaperTitles.add("The Chicago Tribune");
        newspaperTitles.add("The National Post");
        newspaperTitles.add("The Süddeutsche Zeitung");
        newspaperTitles.add("The Deccan Chronicle");
        newspaperTitles.add("The Daily Mirror");
        newspaperTitles.add("The Sun");
        newspaperTitles.add("The Bild");
        newspaperTitles.add("The Pravda");
        newspaperTitles.add("The La Repubblica");
        newspaperTitles.add("The O Globo");
        newspaperTitles.add("The The Australian");
        newspaperTitles.add("The The Star");
        newspaperTitles.add("The The New Zealand Herald");
        newspaperTitles.add("The The Korea Herald");
        newspaperTitles.add("The The Bangkok Post");
        newspaperTitles.add("The The Jakarta Post");
        newspaperTitles.add("The The Manila Bulletin");
        newspaperTitles.add("The The Daily Express");

        return newspaperTitles;
    }

    public static Newspaper createRandomNewspaper() {
        Random random = new Random();
        String title = getRandomElement(newspaperTitles);
        //String author = ""; // Поле заглушка для полиморфной работы
        String releaseDate = generateRandomDate(); // Генерация случайной даты выхода номера газеты
        List<String> headlines = generateRandomHeadlines(random.nextInt(11) + 10, allHeadlines);

        return new Newspaper(title,  releaseDate, headlines);
    }

    private static List<String> generateRandomHeadlines(int numberOfHeadlines, List<String> allHeadlines) {
        List<String> selectedHeadlines = new ArrayList<>();
        Random random = new Random();

        // Выбираем уникальные заголовки случайным образом
        while (selectedHeadlines.size() < numberOfHeadlines && !allHeadlines.isEmpty()) {
            String selectedHeadline = getRandomElement(allHeadlines);
            if (!selectedHeadlines.contains(selectedHeadline)) {
                selectedHeadlines.add(selectedHeadline);
            }
        }

        return selectedHeadlines;
    }

    private static String generateRandomDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        // Задаем начальную дату в формате "dd.MM.yyyy"
        String startDateString = "01.01.1900";
        Date startDate;
        try {
            startDate = dateFormat.parse(startDateString);
        } catch (Exception e) {
            // Обработка ошибок, если не удалось преобразовать дату
            e.printStackTrace();
            return "";
        }

        // Получаем текущую дату
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        // Генерируем случайную дату между начальной датой и текущей датой
        long randomTimeInMillis = getRandomTimeInMillis(startDate.getTime(), currentDate.getTime());
        Date randomDate = new Date(randomTimeInMillis);

        // Преобразуем случайную дату в строковый формат
        return dateFormat.format(randomDate);
    }

    private static long getRandomTimeInMillis(long min, long max) {
        Random random = new Random();
        return min + (long) (random.nextDouble() * (max - min));
    }

    private static <T> T getRandomElement(List<T> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
