import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HCQLDemo 
{
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Criteria c = session.createCriteria(Employee.class);
		
		//equal-eq
		//c.add(Restrictions.eq("id", 1002));
		
		//lessthan-lt
		//c.add(Restrictions.lt("salary", 10000.00));
		
		//greaterthan-gt
		//c.add(Restrictions.gt("salary", 20000.00));
		
		//graterthan or equal to -ge
		//c.add(Restrictions.ge("salary",64830.00));
		
		//lessthan or equal to - le
		//c.add(Restrictions.le("salary",64830.00));
		
		//between
		//c.add(Restrictions.between("salary",0.00,20000.00));
		
		//not equal
		//c.add(Restrictions.not(Restrictions.eq("id", 1007)));
		
		//like
		//c.add(Restrictions.like("name","Ak%"));
		//c.add(Restrictions.like("name","A%"));
		//c.add(Restrictions.like("name","%"));
		//c.add(Restrictions.like("name","%ta"));
		//c.add(Restrictions.like("name","A__hi_a"));
		//c.add(Restrictions.like("name","_______"));
		
		//not like
		//c.add(Restrictions.not(Restrictions.like("name","_______")));
		
		//idEq
		//c.add(Restrictions.idEq(1001));
		
		//isNotNull
		//c.add(Restrictions.isNotNull("salary"));
		
		//isNull
		//c.add(Restrictions.isNull("salary"));
		
		//pagination
		
		
		//and
		//c.add(Restrictions.and(Restrictions.like("name","A__hi_a"),Restrictions.ge("salary",64830.00)));
		
		//or
		//c.add(Restrictions.or(Restrictions.like("name","A__hi_a"),Restrictions.ge("salary",64830.00)));
		
		//in
		//c.add(Restrictions.in("id",new Integer[] {1001,1002}));
		//c.add(Restrictions.in("name",new String[] {"Akshita","Akanksha"}));
		
		//projection
		//c.setProjection(Projections.property("name"));
		
		//sum
		//c.setProjection(Projections.sum("salary"));
		
		//count
		//c.setProjection(Projections.rowCount());
		//List list = c.list();
		//System.out.println(list.get(0));
		
		//avg
		//c.setProjection(Projections.avg("salary"));
		
		//min
		//c.setProjection(Projections.min("salary"));
		
		//max
		//c.setProjection(Projections.max("salary"));
		
		//count
		//c.setProjection(Projections.count("salary"));
		
		//id column as projection
		c.setProjection(Projections.id());
		
		
		List list = c.list();
		//System.out.println("Total records="+list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
//		List<Employee> list = c.list();
//		for (Employee emp:list)
//		{
//			System.out.println(emp.getId()+","+emp.getName()+","+emp.getGender()+","+emp.getSalary());
//		}
	}

}
