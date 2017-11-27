package vnfhub.supplier.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "USERDETAILS")
public class Register {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;        
 
@Column(name="FIRSTNAME")
private String fname;
 
@Column(name="LASTNAME")
private String lname;
 
@Column(name="USERID")
private String userid;
 
@Column(name="TYPE")
private String type;
 
@Column(name="ORGANIZATION")
private String organization;
 
@Column(name="DEPARTMENT")
private String department;
 
@Column(name="ROLE")
private String role;
 
@Column(name="EMAIL")
private String email;
 
@Column(name="PASSWORD")
private String password;
 
@Column(name="CPASSWORD")
private String cpassword;
 
public int getId() {
return id;
}
 
public void setId(int id) {
this.id = id;
}
 
public String getFname() {
return fname;
}
 
public void setFname(String fname) {
this.fname = fname;
}
 
public String getLname() {
return lname;
}
 
public void setLname(String lname) {
this.lname = lname;
}
 
public String getUserid() {
return userid;
}
 
public void setUserid(String userid) {
this.userid = userid;
}
 
public String getType() {
return type;
}
 
public void setType(String type) {
this.type = type;
}
 
public String getOrganization() {
return organization;
}
 
public void setOrganization(String organization) {
this.organization = organization;
}
 
public String getDepartment() {
return department;
}
 
public void setDepartment(String department) {
this.department = department;
}
 
public String getRole() {
return role;
}
 
public void setRole(String role) {
this.role = role;
}
 
public String getEmail() {
return email;
}
 
public void setEmail(String email) {
this.email = email;
}
 
public String getPassword() {
return password;
}
 
public void setPassword(String password) {
this.password = password;
}
 
public String getCpassword() {
return cpassword;
}
 
public void setCpassword(String cpassword) {
this.cpassword = cpassword;
}
 
 
 
 
 
}        