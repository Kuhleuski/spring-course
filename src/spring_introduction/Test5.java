package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");


        Cat cat = context.getBean("myPet", Cat.class);
        cat.say();

        Cat yourCat = context.getBean("myPet", Cat.class);
        yourCat.say();

        context.close();

    }
}
