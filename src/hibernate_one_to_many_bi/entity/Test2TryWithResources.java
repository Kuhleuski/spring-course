package hibernate_one_to_many_bi.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2TryWithResources {
    public static void main(String[] args) {

        Employee emp = new Employee("Vova", "Ivanov", 350);

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();


//            session.beginTransaction();
            Employee empFromDb = session.get(Employee.class,44);
            System.out.println(empFromDb.getName());
            System.out.println("Done!");
            session.getTransaction().commit();
        }
    }
}
