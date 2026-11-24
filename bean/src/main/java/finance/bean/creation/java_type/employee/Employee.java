package finance.bean.creation.java_type.employee;

public class Employee {
	
	String name;
	String Brand;
	String Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Brand=" + Brand + ", Id=" + Id + "]";
	}
	
	

}
