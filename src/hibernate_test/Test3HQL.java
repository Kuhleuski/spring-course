package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3HQL {
    public static void main(String[] args) {


        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){

            Session session = factory.getCurrentSession();

            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee").getResultList();

//            List<Employee> employees = session.createQuery("from Employee where name = 'Sergey'")
//                    .getResultList();

            List<Employee> employees = session.createQuery("from Employee where name = 'Sergey'" +
                            " and salary >= 500")
                    .getResultList();


            for (Employee e :employees){
                System.out.println(e);
            }


            session.getTransaction().commit();

        }
    }
}
