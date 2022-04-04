package task1;
public class BookReader {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг", 1947, "США");
        Author author2 = new Author("Лев", "Толстой", 1876, "Россия");

        Book book1 = new Book(author2, "Война и мир", 1600, 1900);
        Book book2 = new Book(author1, "Лонгольеры", 400, 1990);
        Book book3 = new Book(author1, "Сияние", 800, 1977);

        User user1 = new User("Алексей", "Алексеев", "емейл@почта", book2);
        User user2 = new User("Иван", "Иванов", "емейл@почта.рф", book1);
        User user3 = new User("Петр", "Петров", "емейл@почта", book3);

        System.out.println(book1);
        System.out.println(book1.thickBook());

        System.out.println(book1.comparisonBook(book2));

        System.out.println("Пользователей он-лайн: " + User.counterUser);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("Всего книг в библиотеке: " + Book.allBooks + " книги");
        System.out.println("Самая толстая книга, содержит: " + Book.maxPages + " страниц");
    }
}