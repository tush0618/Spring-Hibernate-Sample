package shoehouse.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import shoehouse.customer.bean.AddressBean;
import shoehouse.customer.bean.CardDetailsBean;
import shoehouse.customer.bean.LoginBean;
import shoehouse.customer.bean.RegisterBean;
import shoehouse.customer.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String getRegisterForm(Model model) {
		model.addAttribute("register", new RegisterBean());
		return "Register";
	}

	@RequestMapping(value = "/register/success", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("register") RegisterBean register,  BindingResult result) {
		userService.addUser(register);
		return "success";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginForm(Model model) {
		model.addAttribute("login", new LoginBean());
		return "Login";
	}

	@RequestMapping(value = "/my", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("login") LoginBean login, RedirectAttributes attr,  BindingResult result, Model model) {
		boolean valid = false;
		System.out.println(2);
		valid = userService.userValidate(login);
		System.out.println(7);
		if(valid==true)
		{
			return "Home";
		}
		else 
		{
			attr.addFlashAttribute("message", "Incorrect Email/Password. Please try again");
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value="/my/address/add", method = RequestMethod.GET)
	public String getAddressForm(Model model) {
		model.addAttribute("address", new AddressBean());
		return "Address";
	}
	
	@RequestMapping(value = "/my/address", method = RequestMethod.POST)
	public String listAddress(@ModelAttribute("address") AddressBean address,  BindingResult result) {
		userService.addAddress(address);
		return "AddressList";
	}
	
	
	
	
	@RequestMapping(value="/my/cards/add", method = RequestMethod.GET)
	public String getCardDetailsPage(Model model) {
		model.addAttribute("cards", new CardDetailsBean());
		return "CardDetails";
	}
	
	@RequestMapping(value = "/my/cards", method = RequestMethod.POST)
	public String listCards(@ModelAttribute("cards") CardDetailsBean cards,  BindingResult result) {
		userService.addCards(cards);
		return "CardDetailsList";
	}

}