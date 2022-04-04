package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {


    @Test
    void testThickBookBig() {

        // given:

        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        // when:

        String expected = book1.thickBook();

        String actual = "Книга " + book1.title + " слишком толстая";
//        String actual = "Книга Война и мир слишком толстая";

        // then:

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThickBookSmall() {

        // given:

        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        // when:

        String expected = book2.thickBook();

        String actual = "Книга " + book2.title + " тонкая";

        // then:

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testComparisonBookLess() {
        // given:

        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        // when:

        String expected = book2.comparisonBook(book1);

        String actual = "В книге " + book2.title + " страниц меньше, чем в книге " + book1.title;

        // then:

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void testComparisonBookMore() {
        // given:

        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        // when:

        String expected = book1.comparisonBook(book2);

        String actual = "В книге " + book1.title + " страниц больше чем в " + book2.title;

        // then:

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testComparisonBookEqual() {
        // given:

        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        // when:

        String expected = book1.comparisonBook(book1);

        String actual = "В книгах одинаковое колличество страниц";

        // then:

        Assertions.assertEquals(expected, actual);

    }
}