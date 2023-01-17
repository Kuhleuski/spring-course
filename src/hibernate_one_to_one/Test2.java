package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

//        Employee emp = new Employee("Irina","Petrova","Dev",123);
//        Detail detail = new Detail("Barselona", "+375(33) 123 44 66","Irina@mail.ru");
//        emp.setEmpDetail(detail);
//        detail.setEmployee(emp);


        try{

            session = factory.getCurrentSession();
            session.beginTransaction();

//            session.save(detail);

//            Detail detailFromDb = session.get(Detail.class,6);

//            Employee employee = session.get(Employee.class,5);


//            session.getTransaction().commit();
//            System.out.println(detailFromDb.getEmployee() +", "+detailFromDb);
//            System.out.println(employee +", "+ employee.getEmpDetail());

//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Detail detail = session.get(Detail.class,2);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);



            session.getTransaction().commit();

        }

        finally {
            session.close();
            factory.close();
        }
    }
}
