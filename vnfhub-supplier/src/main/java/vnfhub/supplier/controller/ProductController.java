package vnfhub.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vnfhub.supplier.bean.ProductBean;
import vnfhub.supplier.model.Register;
import vnfhub.supplier.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String addProductPage(Model model) {
		model.addAttribute("product", new ProductBean());
		return "addProduct";
	}

	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") ProductBean product,  BindingResult result) {
		productService.addProduct(product);
		return "success";
	}
	
	
}
