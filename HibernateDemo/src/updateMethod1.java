import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateMethod1 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Employee emp = new Employee();
		emp.setId(1007);
		emp.setName("Ankitha");
		emp.setGender("female");
		emp.setSalary(64830.00);
		
        Transaction txt = s.beginTransaction();
		
		s.update(emp);
		txt.commit();
		
		System.out.println("object updated");
		s.close();
		sf.close();
		
	
	}

}
