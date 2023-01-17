package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {


        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){

            Session session = factory.getCurrentSession();
            session.beginTransaction();



            Employee emp = session.get(Employee.class,1);
            emp.setSalary(2212);


            List<Employee> employeeList = session.createQuery("from Employee where name = 'Sergey' ").getResultList();

            for (Employee e: employeeList){
                e.setSalary(100);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
