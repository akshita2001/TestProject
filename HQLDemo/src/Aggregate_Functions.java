import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Aggregate_Functions 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Query qry1 = session.createQuery("select count(*) from Faculty");
	    List list1 = qry1.list();
	    System.out.println(list1.get(0));
	    
	    Query qry2 = session.createQuery("select max(salary) from Faculty");
	    List list2 = qry2.list();
	    System.out.println(list2.get(0));
	    
	    Query qry3 = session.createQuery("select min(salary) from Faculty");
	    List list3 = qry3.list();
	    System.out.println(list3.get(0));
	    
	    Query qry4 = session.createQuery("select sum(salary) from Faculty");
	    List list4 = qry4.list();
	    System.out.println(list4.get(0));
	    
	    
	    Query qry5 = session.createQuery("select avg(salary) from Faculty");
	    List list5 = qry5.list();
	    System.out.println(list5.get(0));
		
		
	    session.close();
	    sf.close();
	}

}
