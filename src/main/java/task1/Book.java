package task1;

public class Book {
    Author author;
    String title;
    int pages;
    int year;

    static int maxPages = 0;
    static int allBooks = 0;

    public Book(Author author, String title, int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.title = title;
        this.year = year;

        maxPages = Math.max(maxPages, pages);
        allBooks++;
    }

    public String toString() {
        return "Автор [" + author.name + " " + author.surname + "] название [" + title +
                "] колличество страниц [" + pages + "] издана в [" + year + "] году";
    }

    public String thickBook() {
        if (pages >= 500)
            return "Книга " + title + " слишком толстая";
        else
            return "Книга " + title + " тонкая";
    }

    public String comparisonBook(Book book) {
        String result;
        if (this.pages > book.pages) {
            result = "В книге " + this.title + " страниц больше чем в " + book.title;
        } else if (this.pages == book.pages) {
            result = "В книгах одинаковое колличество страниц";
        } else {
            result = "В книге " + this.title + " страниц меньше, чем в книге " + book.title;
        }
        return result;
    }
}
