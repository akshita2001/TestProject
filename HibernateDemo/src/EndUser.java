import org.hibernate.cfg.*;
import org.hibernate.*;

public class EndUser 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		//insert
		/*
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Akshita");
		emp.setGender("female");
		emp.setSalary(100000.00);
		*/
		
		
		
		//update method-1
		/*
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Akshita");
		emp.setGender("female");
		emp.setSalary(123800.67);
		*/
		
		
		
		//update method-2
		/*
		Object obj = s.load(Employee.class, new Integer(1002));
		Employee emp = (Employee)obj;
		emp.setName("Ravi");
		emp.setGender("male");
		*/
		
		
		//delete
		/*
		Object obj = s.load(Employee.class, new Integer(1003));
		Employee emp = (Employee)obj;
		*/
		
		
		//select
		Object obj = s.load(Employee.class, new Integer(1001));
		Employee emp = (Employee)obj;
		
		
		System.out.println(emp.getId()+","+emp.getName()+","+emp.getGender()+","+emp.getSalary());
		
		
		Transaction txt = s.beginTransaction();
		
		
		//s.save(emp);
		//s.update(emp);
		//s.delete(emp);
		
		txt.commit();
		
		System.out.println("object updated");
		s.close();
		sf.close();
	}

}
