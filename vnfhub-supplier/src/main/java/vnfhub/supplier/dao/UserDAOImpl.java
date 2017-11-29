package vnfhub.supplier.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
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
		String inputPassword = log.getPassword();
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Login l where l.userId = :userId";      

		Query<Login> query = session.createQuery(hql);
		query.setParameter("userId", log.getUserId());
		System.out.println(hql);
		List<Login> result = query.list();
		System.out.println("resultset:"+result);
		if ((result != null) && (result.size() > 0)) {
			String hashedPassword = result.get(0).getPassword();
			boolean match = BCrypt.checkpw(inputPassword, hashedPassword);
			if(match==true)
			{
				valid = match;
			}
			else
			{
				valid = false;
 			}
		}
		return valid;
	}

}
