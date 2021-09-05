package JavaGenerics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> { // extends Player: restricting the type of class that we can actually use for team. 
// If we attempt to use any class in other words that is not derived from player	
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<T>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName()+ " is already on this team");
			return false;
		}
		else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent, int outScore, int theirScore) {
		
		String message;
		
		if(outScore > theirScore) {
			won++ ;
			message = " beat ";
		}
		else if(outScore == theirScore) {
			tied++;
			message = " drew with ";
		}
		else {
			lost++;
			message = " lose to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, outScore);
		}
	}
	
	public int ranking() {
		return (won * 3) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		}
		else if(this.ranking() < team.ranking()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
