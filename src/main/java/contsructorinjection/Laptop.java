package contsructorinjection;

public class Laptop {

	private int id;
	private String name;
	private double cost;
	
	public Laptop(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
