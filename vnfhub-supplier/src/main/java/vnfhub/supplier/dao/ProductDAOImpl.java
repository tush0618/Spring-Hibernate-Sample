package vnfhub.supplier.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import vnfhub.supplier.model.ProductDetails;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void addProduct(ProductDetails p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}
	
	

}
