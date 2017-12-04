package shoehouse.customer.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import shoehouse.customer.bean.LoginBean;
import shoehouse.customer.model.UserAddress;
import shoehouse.customer.model.UserCardDetails;
import shoehouse.customer.model.UserProfile;


@Repository
public class UserDAOImpl implements UserDAO{


	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(UserProfile reg ) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(reg);

	}

	@Override
	public boolean userValidate(LoginBean log) {

		boolean valid = false;
		String inputPassword = log.getPassword();
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from UserProfile u where u.email = :email";      

		Query<UserProfile> query = session.createQuery(hql);
		query.setParameter("email", log.getEmail());
		System.out.println(hql);
		List<UserProfile> result = query.list();
		System.out.println("resultset:"+result);
		if ((result != null) && (result.size() > 0)) {
			String hashedPassword = result.get(0).getPassword();
			boolean match = BCrypt.checkpw(inputPassword, hashedPassword);
			System.out.println("Input: "+inputPassword+" Hashed Pass: "+hashedPassword+" Match: "+match);
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

	@Override
	public void addAddress(UserAddress userAddress) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(userAddress);

	}

	@Override
	public void addCards(UserCardDetails userCardDetails) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(userCardDetails);

	}

}
