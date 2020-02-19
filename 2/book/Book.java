package book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(List<Author> authors, List<Chapter> chapters) {
        this.authors = authors;
        this.chapters = chapters;
    }

    public Book(Author author, List<Chapter> chapters) {
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        this.authors = authors;
        this.chapters = chapters;
    }
}
