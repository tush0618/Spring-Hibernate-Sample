package shoehouse.customer.service;

import shoehouse.customer.bean.AddressBean;
import shoehouse.customer.bean.CardDetailsBean;
import shoehouse.customer.bean.LoginBean;
import shoehouse.customer.bean.RegisterBean;

public interface UserService {
	
	public void addUser(RegisterBean reg);
	
	public boolean userValidate(LoginBean log);

	public void addAddress(AddressBean address);

	public void addCards(CardDetailsBean cards);
	
	
}
