package polymorphism;

public class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "Fruit";
		taste = "Fruit's Taste";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}