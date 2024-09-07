package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;
import com.model.Manager;
import com.model.Supervisor;
import com.utility.HibernateUtility;



public class EmployeeDAOImpl implements EmployeeDAO{

	 

	@Override
	public void saveManager(Manager manager) {
		SessionFactory factory=HibernateUtility.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(manager);
		tx.commit();
		session.close();
		
	}

	@Override
	public void saveSupervisor(Supervisor supervisor) {
		SessionFactory factory=HibernateUtility.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(supervisor);
		tx.commit();
		session.close();
		
	}

	@Override
	public List<Manager> getAllManager() {
	List<Manager>emplist=new ArrayList<Manager>();
	SessionFactory factory=HibernateUtility.getFactory();
	Session session=factory.openSession();
	Query  query=session.createQuery("from Manager m");
	emplist=query.list();
	return emplist;
//	Criteria criteria = session.createCriteria(Supervisor.class);
//	criteria.add(Restrictions.like("deptName", "mgr"));
//	List<Manager> list = criteria.list();
//		return list;

	}
	@Override
	public List<Supervisor> getAllSupervisor() {
	List<Supervisor>emplist=new ArrayList<Supervisor>();
	SessionFactory factory=HibernateUtility.getFactory();
	Session session=factory.openSession();
	Query  query=session.createQuery("from Supervisor m");
	emplist=query.list();
	return emplist;
	
//	Criteria criteria = session.createCriteria(Supervisor.class);
//	criteria.add(Restrictions.like("deptName", "sp"));
//	List<Supervisor> list = criteria.list();
//		return list;
	}

	@Override
	public List<Employee> getEmployeeById(int id) {
		List<Employee>emplist=new ArrayList<Employee>();
		SessionFactory factory=HibernateUtility.getFactory();
		Session session=factory.openSession();
		
		return emplist;
	}

	@Override
	public List getAllEmployee() {
		
		return null;
	}
 

}
