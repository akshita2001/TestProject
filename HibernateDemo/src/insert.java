import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class insert 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Employee emp = new Employee();
		//emp.setId(1005);
		emp.setName("Ravi");
		emp.setGender("male");
		emp.setSalary(48900.39);
		
		Transaction txt = s.beginTransaction();
		
		s.save(emp);
		txt.commit();
		
		System.out.println("data inserted");
		s.close();
		sf.close();
		
	}

}
