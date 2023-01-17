package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;

import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {





        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

//        Employee emp1 = new Employee("Michail","Ivanov",500);
//        Employee emp2 = new Employee("Sergey","Sergeev",2000);
//        Employee emp3 = new Employee(  "Irina","Nick",300);
//
//
//
//
//        Department dep1 = new Department("Sales",500,250);
//        Department dep2  = new Department("IT",500,250);
//
//        dep1.addEmployeeToDepartment(emp1);
//        dep1.addEmployeeToDepartment(emp2);
//        dep2.addEmployeeToDepartment(emp3);


        try{

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class,12);
            session.delete(emp);

//            session.save(dep1);
//            session.save(dep2);

            session.getTransaction().commit();

        }

        finally {
            session.close();
            factory.close();
        }
    }
}
