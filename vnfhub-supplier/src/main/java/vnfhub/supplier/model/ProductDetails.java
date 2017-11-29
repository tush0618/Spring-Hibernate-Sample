package vnfhub.supplier.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;        
	
	@Column(name="PRODUCT_ID")
	private String productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@JoinColumn(name = "VNF_ID", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private VnfDetails vnfDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public VnfDetails getVnfDetails() {
		return vnfDetails;
	}

	public void setVnfDetails(VnfDetails vnfDetails) {
		this.vnfDetails = vnfDetails;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productId=" + productId + ", productName=" + productName
				+ ", vnfDetails=" + vnfDetails + "]";
	}
	
	
	
	
}
