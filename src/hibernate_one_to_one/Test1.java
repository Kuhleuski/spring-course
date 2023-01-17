package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;

        try{




//            Detail detailEmp = new Detail("Borisov","+375(29) 444 98 23","Artur@mail.ru");
//            Employee employee = new Employee("Artur", "Abelian","Sales",2000);
//
//            employee.setEmpDetail(detailEmp);

            session = factory.getCurrentSession();
            session.beginTransaction();

//            session.save(employee);

//            Employee empFromDb = session.get(Employee.class,20);
//            System.out.println(empFromDb.getEmpDetail());

            session.delete(session.get(Employee.class,3));

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
