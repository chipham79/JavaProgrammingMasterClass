package oop2.encapsulation;

public class MainTestPlayer {
	public static void main(String[] args) {
		Player player = new Player("Jack Son", 450, "Gun");
		
		System.out.println("Initial Health= " + player.getHealth());
		
		int damage = 50;
		player.loseHealth(damage);
		System.out.println("Remaining health= " + player.getHealth());

		
	}
}
