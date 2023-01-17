package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Pet myPet = context.getBean("myPet", Cat.class);
        Pet yourPet = context.getBean("myPet", Cat.class);

        System.out.println(myPet.equals(yourPet));
        System.out.println(myPet==yourPet);

        System.out.println(myPet);
        System.out.println(yourPet);



        context.close();
    }
}
