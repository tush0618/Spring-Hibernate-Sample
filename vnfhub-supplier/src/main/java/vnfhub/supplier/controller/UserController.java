package vnfhub.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vnfhub.supplier.model.Login;
import vnfhub.supplier.model.Register;
import vnfhub.supplier.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String getRegisterPage(Model model) {
		model.addAttribute("register", new Register());
		return "register";
	}

	@RequestMapping(value = "/register/process", method = RequestMethod.POST)
	public String processRegister(@ModelAttribute("register") Register register,  BindingResult result) {
		userService.addUser(register);
		return "success";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@RequestMapping(value = "/login/process", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("login") Login login,  BindingResult result) {
		boolean valid = false;
		System.out.println(2);
		valid = userService.userValidate(login);
		System.out.println(7);
		if(valid==true)
		{
			return "success";
		}
		else 
		{
			return "error";
		}
	}
}