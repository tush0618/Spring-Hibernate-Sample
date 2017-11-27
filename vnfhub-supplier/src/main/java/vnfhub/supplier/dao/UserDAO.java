package vnfhub.supplier.dao;

import vnfhub.supplier.model.Login;
import vnfhub.supplier.model.Register;

public interface UserDAO {
	
	public void addUser(Register reg);
	
	public boolean userValidate(Login log);
}
