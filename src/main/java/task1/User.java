package task1;

public class User {
    String name;
    String surname;
    String email;
    Book book;

    static int counterUser;

    public User(String name, String surname, String email, Book book) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.book = book;

        counterUser++;
    }

    public String toString() {
        return name + " " + surname + " , " + email + " ," + " взял книгу " + book.title + " , " + book.author;
    }
}

