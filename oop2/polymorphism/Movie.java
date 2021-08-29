package oop2.polymorphism;

public class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
	
}

class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}
	
	@Override
	public String plot() {
		return "A shark eats a lot of people";
	}
}

class IndenpendenceDay extends Movie {
	public IndenpendenceDay() {
		super("Indenpendence Day");
	}
	
	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie {
	public MazeRunner() {
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class StartWar extends Movie {
	public StartWar() {
		super("Start War");
	}
	
	@Override
	public String plot() {
		return "Imperial Forces try to take over the universe";
	}
}

class Forgetable extends Movie {
	public Forgetable() {
		super("Forgetable");
	}
}
