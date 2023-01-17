package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();
//        Dog dog = context.getBean("dog", Dog.class);
//        dog.say();
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
