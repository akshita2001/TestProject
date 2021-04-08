import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class select 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		//1
		Query qry1 = session.createQuery("from Faculty");
		List<Faculty> list1 = qry1.list();
		System.out.println("Total no. of Records="+list1.size());
		for(Faculty faculty : list1)
		{
			System.out.println(faculty.getFid()+","+faculty.getName()+","+faculty.getDept()+","+faculty.getDesignation()+","+faculty.getAge());
		}
		
		
		//2
//		Query qry2 = session.createQuery("from Faculty where fid=:v1");
//		List<Faculty> list2 = qry2.list();
//		System.out.println("Total no. of Records="+list2.size());
//		for(Faculty faculty : list2)
//		{
//			System.out.println(faculty.getFid()+","+faculty.getName()+","+faculty.getDept()+","+faculty.getDesignation()+","+faculty.getAge());
//		}
		
		
		//3
//		Query qry3 = session.createQuery("from Faculty where fid=?");
//		qry3.setInteger(0, 1234);
//		List<Faculty> list3 = qry3.list();
//		System.out.println("Total no. of Records="+list3.size());
//		for(Faculty faculty : list3)
//		{
//			System.out.println(faculty.getFid()+","+faculty.getName()+","+faculty.getDept()+","+faculty.getDesignation()+","+faculty.getAge());
//		}
//		
		
		//4
//		Query qry4 = session.createQuery("from Faculty where fid=890");
//		List<Faculty> list4 = qry4.list();
//		System.out.println("Total no. of Records="+list4.size());
//		for(Faculty faculty : list4)
//		{
//			System.out.println(faculty.getFid()+","+faculty.getName()+","+faculty.getDept()+","+faculty.getDesignation()+","+faculty.getAge());
//		}
		
		
		session.close();
		sf.close();
	}

}
