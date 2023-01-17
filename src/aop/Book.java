package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @Value("${book.yearOfPublishing}")
    private int yearOfPublishing;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
