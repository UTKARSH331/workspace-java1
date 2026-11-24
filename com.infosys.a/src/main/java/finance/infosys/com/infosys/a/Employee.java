package finance.infosys.com.infosys.a;

//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{

	String name;
	String brand;
	String Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", brand=" + brand + ", Id=" + Id + "]";
	}
	
	
	
}
