package vnfhub.supplier.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import vnfhub.supplier.bean.ProductBean;
import vnfhub.supplier.dao.ProductDAO;
import vnfhub.supplier.model.ProductDetails;
import vnfhub.supplier.model.VnfDetails;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductDAO productDAO;
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}


	@Override
	@Transactional
	public void addProduct(ProductBean product) {
		VnfDetails v = new VnfDetails();
		ProductDetails p = new ProductDetails();
		
		v.setVnfId(product.getVnfId());
		v.setVnfName(product.getVnfName());
		
		p.setProductId(product.getProductId());
		p.setProductName(product.getProductName());
		p.setVnfDetails(v);
		
		this.productDAO.addProduct(p);
	}
	
}
