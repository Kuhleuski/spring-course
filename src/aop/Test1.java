package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();

        Book book = context.getBean("book", Book.class);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearOfPublishing());





//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        context.close();

    }
}
