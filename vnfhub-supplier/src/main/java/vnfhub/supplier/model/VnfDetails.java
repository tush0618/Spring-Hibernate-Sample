package vnfhub.supplier.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vnf_details")
public class VnfDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;        
	
	@Column(name="vnf_id")
	private String vnfId;
	
	@Column(name="vnf_name")
	private String vnfName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVnfId() {
		return vnfId;
	}

	public void setVnfId(String vnfId) {
		this.vnfId = vnfId;
	}

	public String getVnfName() {
		return vnfName;
	}

	public void setVnfName(String vnfName) {
		this.vnfName = vnfName;
	}

}
