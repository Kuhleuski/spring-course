package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
        System.out.println("-----------------------------");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");
        return "война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
        System.out.println("-----------------------------");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("-----------------------------");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-----------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-----------------------------");
    }
}
