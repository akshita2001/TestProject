import org.hibernate.SessionFactory;
import  org.hibernate.*;
import org.hibernate.cfg.*;

public class InsertRecord 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Faculty faculty=new Faculty();
		faculty.setFid(890);
		faculty.setName("Ravi");
		faculty.setDept("CSE");
		faculty.setDesignation("cc");
		faculty.setAge(49);
		faculty.setSalary(909089);
		Transaction txt=session.beginTransaction();
		session.save(faculty); //persistent state
		txt.commit();
		System.out.println("obj saved");
		
		session.close();
		sf.close();
		
		
	}


}
