package task1;

class Author {
    String name;
    String surname;
    int birthday;
    String country;

    public Author(String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    public String toString() {
        return name + " " + surname;
    }
}