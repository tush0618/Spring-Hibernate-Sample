package vnfhub.supplier.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
		String password = reg.getPassword();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		reg.setPassword(hashedPassword);
		reg.setConfirmPassword(hashedPassword);
		this.userDAO.addUser(reg);
	}

	@Override
	@Transactional
	public boolean userValidate(Login log) {
		boolean valid = false;
		valid = this.userDAO.userValidate(log);
		return valid;
	}




}

