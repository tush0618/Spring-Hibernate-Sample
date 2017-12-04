package shoehouse.customer.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shoehouse.customer.bean.AddressBean;
import shoehouse.customer.bean.CardDetailsBean;
import shoehouse.customer.bean.LoginBean;
import shoehouse.customer.bean.RegisterBean;
import shoehouse.customer.dao.UserDAO;
import shoehouse.customer.model.UserAddress;
import shoehouse.customer.model.UserCardDetails;
import shoehouse.customer.model.UserProfile;


@Service
public class UserServiceImpl implements UserService{


	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(RegisterBean reg) {
		UserProfile userProfile = new UserProfile();
		String password = reg.getPassword();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		reg.setPassword(hashedPassword);
		
		userProfile.setFirstName(reg.getFirstName());
		userProfile.setLastName(reg.getLastName());
		userProfile.setEmail(reg.getEmail());
		userProfile.setPassword(hashedPassword);
		userProfile.setGender(reg.getGender());
		userProfile.setMobile(reg.getMobile());
		this.userDAO.addUser(userProfile);
	}

	@Override
	@Transactional
	public boolean userValidate(LoginBean log) {
		boolean valid = false;
		valid = this.userDAO.userValidate(log);
		return valid;
	}

	@Override
	@Transactional
	public void addAddress(AddressBean add) {
		UserAddress userAddress = new UserAddress();
		userAddress.setPincode(add.getPincode());
		userAddress.setName(add.getName());
		userAddress.setAddress(add.getAddress());
		userAddress.setTown(add.getTown());
		userAddress.setCity(add.getCity());
		userAddress.setState(add.getState());
		userAddress.setMobile(add.getMobile());
		userAddress.setDefaultAddress(add.isDefaultAddress());
		userAddress.setAddressType(add.getAddressType());
		userAddress.setEmail("tushar0618@gmail.com");
		this.userDAO.addAddress(userAddress);
	}

	@Override
	@Transactional
	public void addCards(CardDetailsBean card) {
		UserCardDetails userCardDetails = new UserCardDetails();
		userCardDetails.setCardnumber(card.getCardnumber());
		userCardDetails.setCardName(card.getCardName());
		userCardDetails.setExpiryMonth(card.getExpiryMonth());
		userCardDetails.setExpiryYear(card.getExpiryYear());
		userCardDetails.setEmail("tushar0618@gmail.com");
		this.userDAO.addCards(userCardDetails);
	}


	

}

