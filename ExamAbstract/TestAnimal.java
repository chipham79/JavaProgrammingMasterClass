package examabstract;

public class TestAnimal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.greeting();
		
		Dog dog = new Dog();
		dog.greeting();
		
		BigDog bigDog = new BigDog();
		bigDog.greeting();
		
		Animal animal1 = new Cat();
		animal1.greeting();
		
		Animal animal2 = new Dog();
		
		animal2.greeting();
		
		Animal animal3 = new BigDog();
		animal3.greeting();
		
		Dog dog2 = (Dog) animal2;
		
		BigDog bigDog2 = (BigDog) animal3;
		
		Dog dog3 = (Dog) animal3;
		
		Cat cat2 = (Cat) animal2;
		
		dog2.gretting(dog3);
		
	}
	
}
