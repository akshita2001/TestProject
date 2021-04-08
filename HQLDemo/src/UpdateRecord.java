import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class UpdateRecord 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		//update method-1
		Query qry1= session.createQuery("update Faculty set name=:v1 where fid=:v2");
		qry1.setParameter("v1", "Akhil");
		qry1.setParameter("v2", 1234);
		int n1 = qry1.executeUpdate();
		System.out.println(n1+"Object Updated");
		
		
		//update method-2
//		Query qry2= session.createQuery("update Faculty set name=?,age=? whre fid=?");
//		qry2.setString(0, "Akhil");
//		qry2.setInteger(1, 20);
//		qry2.setInteger(2, 7890);
//		int n2 = qry1.executeUpdate();
//		System.out.println(n2+"Object Updated");
		
		//update method-3
//		Query qry3= session.createQuery("update Faculty set name='Ravi' whre fid=908");
//		int n3 = qry3.executeUpdate();
//		System.out.println(n3+"Object Updated");
//		
		Transaction txt = session.beginTransaction();
		txt.commit();
		session.close();
		sf.close();
		
	}

}
