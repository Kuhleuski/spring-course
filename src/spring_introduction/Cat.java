package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow  ");
    }

    public void init(){
        System.out.println("Class Cat: init method");
    }

    public void destroy(){
        System.out.println("Cass Cat: destroy method");
    }
}
