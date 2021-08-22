package examabstract;

public class BigDog extends Dog{
	@Override
	public void greeting() {
		System.out.println("Woow!");
	}
	
	@Override
	public void gretting( Dog another) {
		System.out.println("WooooWWW");
	}
}
