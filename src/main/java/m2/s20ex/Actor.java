package m2.s20ex;

public abstract class Actor {
	private String name;
	

	public Actor(String name) {
		this.name=name;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Actor [name =" + name +"]";
	}
}