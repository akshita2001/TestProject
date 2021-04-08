import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Object obj = s.load(Employee.class, new Integer(1005));
		Employee emp = (Employee)obj;
		
		Transaction txt = s.beginTransaction();
		
		s.delete(emp);
		txt.commit();
		
		System.out.println("object updated");
		s.close();
		sf.close();
		
	}

}
