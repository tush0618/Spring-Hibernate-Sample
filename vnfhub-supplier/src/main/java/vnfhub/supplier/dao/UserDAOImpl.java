package vnfhub.supplier.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import vnfhub.supplier.model.Login;
import vnfhub.supplier.model.Register;

@Repository
public class UserDAOImpl implements UserDAO{
	
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(Register reg ) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(reg);

	}

	@Override
	public boolean userValidate(Login log) {
	
		boolean valid = false;
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(4);
		String hql = "from Login l where l.userid = :userId and l.password = :password";      
		
		Query query = session.createQuery(hql);
		query.setParameter("userId", log.getUserid());
		query.setParameter("password", log.getPassword());
		System.out.println(hql);
		System.out.println(5);
		List result = query.list();
		System.out.println("resultset:"+result);
		
		if ((result != null) && (result.size() > 0)) {
			valid= true;
		}
		return valid;
	}

}
