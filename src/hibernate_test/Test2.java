package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory()){

            Session session = factory.getCurrentSession();

            Employee emp2 = new Employee("Oleg","Sidorov","Pizza",230);

            session.beginTransaction();
            session.save(emp2);
//            session.getTransaction().commit();?\

            int myId = emp2.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employeeFromDb = session.get(Employee.class,myId);
            System.out.println(employeeFromDb);
            session.getTransaction().commit();


            System.out.println("Done!");
        }
    }
}
