package vnfhub.supplier.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vnfhub.supplier.dao.UserDAO;
import vnfhub.supplier.model.Login;
import vnfhub.supplier.model.Register;

@Service
public class UserServiceImpl implements UserService{


	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(Register reg) {
		this.userDAO.addUser(reg);
	}

	@Override
	@Transactional
	public boolean userValidate(Login log) {
		boolean valid = false;
		System.out.println(3);
//		String userid = log.getUserid();
//		String password = log.getPassword();
		valid = this.userDAO.userValidate(log);
		System.out.println(6	);
		return valid;
	}




}

