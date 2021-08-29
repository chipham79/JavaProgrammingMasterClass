package oop2.polymorphism.challenge;

public class Ford extends Car{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> accelerate()";
	}
}
