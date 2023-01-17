package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class).addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;



        try{


//            Section section = new Section("Football");
//            Child child1 = new Child("Andrei", 5);
//            Child child2 = new Child("Nicas", 7);
//            Child child3 = new Child("Katia", 6);
//
//
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(section);
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ********************************************

//            Section section1 = new Section("Dance");
//            Section section2 = new Section("Art");
//            Section section3 = new Section("Tennis");
//            Child child1 = new Child("Andrei", 5);
//
//
//
//           child1.addSectionToChild(section1);
//           child1.addSectionToChild(section2);
//           child1.addSectionToChild(section3);
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ********************************************


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section sectionFromDb = session.get(Section.class,1);
//            System.out.println(sectionFromDb);
//            System.out.println(sectionFromDb.getChildrenList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ********************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child childFromDb = session.get(Child.class,4);
//            System.out.println(childFromDb);
//            System.out.println(childFromDb.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ********************************************
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section sectionFromDb = session.get(Section.class,1);
//            session.delete(sectionFromDb);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");




            Section section = new Section("Math");
            Child child1 = new Child("Sara", 11);
            Child child2 = new Child("Ilia", 8);
            Child child3 = new Child("Luba", 14);


            section.addChildToSection(child1);
            section.addChildToSection(child2);
            section.addChildToSection(child3);
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.persist(section);
            session.getTransaction().commit();
            System.out.println("Done!!!");
//            ********************************************

        }finally {
            session.close();
            factory.close();
        }
    }
}
