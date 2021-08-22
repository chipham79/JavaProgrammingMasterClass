package examabstract;

public class Dog extends Animal {

	@Override
	public void greeting() {
		System.out.println("Gow gow");
		
	}
	
	public void gretting( Dog another) {
		System.out.println("Woooo");
	}
	
	
	
}
