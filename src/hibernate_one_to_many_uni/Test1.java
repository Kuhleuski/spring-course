package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        Department department = new Department("HR",500,2500);

        Employee emp1 = new Employee("Roman", "Petrov",300);
        Employee emp2 = new Employee("Victor", "Sergeenko",1209);

        department.addEmployeeToDepartment(emp1);
        department.addEmployeeToDepartment(emp2);

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()) {
//            session.beginTransaction();

//            Department depFromDb2 = session.get(Department.class,3);
//            session.save(department);


//            session.getTransaction().commit();

            session.beginTransaction();
            Department depFromDb = session.get(Department.class,5);
            System.out.println(depFromDb.getEmployees());
            session.getTransaction().commit();
        }
    }
}
