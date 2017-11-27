package vnfhub.supplier.service;

import vnfhub.supplier.model.Login;
import vnfhub.supplier.model.Register;

public interface UserService {
	
	public void addUser(Register reg);
	
	public boolean userValidate(Login log);
}
