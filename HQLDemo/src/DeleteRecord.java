import org.hibernate.*;
import org.hibernate.cfg.*;

public class DeleteRecord 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		//delete method-1
		Query qry1= session.createQuery("delete from Faculty where fid=:v1");
		qry1.setParameter("v1", 1234);
		int n1 = qry1.executeUpdate();
		System.out.println(n1+"Object Deleted");
		
		//delete method-2
//		Query qry2= session.createQuery("delete from Faculty where fid=?");
//		qry2.setInteger(0, 4567);
//		int n2 = qry2.executeUpdate();
//		System.out.println(n2+"Object Deleted");
		
		//delete method-3
//		Query qry3= session.createQuery("delete from Faculty where fid=19");
//		int n3 = qry3.executeUpdate();
//		System.out.println(n3+"Object Deleted");
		
		Transaction txt = session.beginTransaction();
		txt.commit();
		session.close();
		sf.close();
		
	}

}
