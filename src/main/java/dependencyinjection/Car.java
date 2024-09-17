package dependencyinjection;

public class Car {

	private int id;
	private String name;
	
	private Tyre tyre;

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

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", tyre=" + tyre + "]";
	}
	
}
