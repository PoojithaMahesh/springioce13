package springe13;

public class Mobile {

//	public void used() {
//		System.out.println("It is used to talk with ..........");
//	}
	
	private int id;
	private String name;
	private String ram;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + "]";
	}
	
}
