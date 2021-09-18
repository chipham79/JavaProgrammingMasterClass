package JavaGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {
	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("joe");
		BaseballPlayer pat = new BaseballPlayer("pat");
		SoccerPlayer beck = new SoccerPlayer("beck");
		
		Team<FootballPlayer> teamA = new Team<FootballPlayer>("Team A"); // Only FootballPlayer can add
		teamA.addPlayer(joe);
		//teamA.addPlayer(pat); // get an error if we use Team<FootballPlayer>
		//teamA.addPlayer(beck); // get an error if we use Team<FootballPlayer>
	
		
		System.out.println(teamA.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> soccerTeam = new Team<SoccerPlayer>("MU");
		soccerTeam.addPlayer(beck);
		
		Team<FootballPlayer> teamB = new Team<FootballPlayer>("Team B");
		FootballPlayer gordon = new FootballPlayer("Gordon");
		teamB.addPlayer(gordon);
		
		Team<FootballPlayer> teamC = new Team<FootballPlayer>("Team C");
		FootballPlayer fremantle = new FootballPlayer("Fremantle");
		teamC.addPlayer(fremantle);
		
		teamA.matchResult(teamB, 1, 0);
		teamA.matchResult(teamC, 3, 8);
		
		teamB.matchResult(teamA, 2, 1);
		teamB.matchResult(teamC, 1, 1);
		
		System.out.println("Ranking");
		System.out.println(teamA.getName() + ": " + teamA.ranking());
		System.out.println(teamB.getName() + ": " + teamB.ranking());
		System.out.println(teamC.getName() + ": " + teamC.ranking());
		
		System.out.println(teamA.compareTo(teamB));
		System.out.println(teamA.compareTo(teamC));
		
		System.out.println(teamB.compareTo(teamC));
		System.out.println(teamB.compareTo(teamA));
		
		
	}
}
