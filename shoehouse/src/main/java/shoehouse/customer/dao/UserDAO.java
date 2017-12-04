package shoehouse.customer.dao;

import shoehouse.customer.bean.LoginBean;
import shoehouse.customer.model.UserAddress;
import shoehouse.customer.model.UserCardDetails;
import shoehouse.customer.model.UserProfile;

public interface UserDAO {
	
	public void addUser(UserProfile reg);
	
	public boolean userValidate(LoginBean log);

	public void addAddress(UserAddress userAddress);

	public void addCards(UserCardDetails userCardDetails);
	
	
}
