package hashset;

public class Food {
	private int id;
	private String name;
	private String type;
	
	public Food(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
