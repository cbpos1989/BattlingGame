/**
 * 
 */
package com.github.cbpos1989.BattlingGame;

/**
 * App will initialise the starting game conditions. Randomly selecting characters for each player from an enum of Characters.
 * 
 * @author Colm O'Sullivan
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class GameApp {
	private final int NUM_OF_CHARACTERS = 5;
	private final int MAX_DIE_ROLL = 6;
	
	private ArrayList<Character> startingList = new ArrayList<Character>();
	private ArrayList<Character> playerList = new ArrayList<Character>();
	private ArrayList<Character> aiList = new ArrayList<Character>();
	
	private Random rnd = new Random();
	
	public static void main (String[] args){
		//System.out.println("Working");
		
		GameApp ga = new GameApp();
		ga.intializeApp();
	}
	
	void intializeApp(){
		populateList();
		
		if(!startingList.isEmpty()){
			runGame();
		}
	}
	
	void runGame(){
		try {
			
			genRandomList(playerList);
			genRandomList(aiList);
			
			GameMenu frame = new GameMenu(playerList, aiList);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	int randomGenerator(int bound){
		return rnd.nextInt(bound);
	}
	
	void populateList(){
		for (Character c: Character.values()) {
			startingList.add(c);
			
		}
	}
	
	void genRandomList(ArrayList<Character> list){
		int idx = 0;
		
		for (int i = 0; i < NUM_OF_CHARACTERS;) {
			idx = randomGenerator(startingList.size()-1);
			
			if(startingList.get(idx) != null){
				list.add(startingList.get(idx));
				startingList.remove(idx);
				//System.out.println(list.get(i));
				++i;
			} else {
				continue;
			}
		}
		
	}
	
	void attack(Character attacker, Character defender){
		
		
		int attackerDieRoll = randomGenerator(MAX_DIE_ROLL) + 1;
		int defenderDieRoll = randomGenerator(MAX_DIE_ROLL) + 1;
		
		
		int hitPoints = attacker.getStrength() - attackerDieRoll;
		int defendPoints = defender.getCraft() - defenderDieRoll;
		
		
		
		if(hitPoints > defendPoints){
			System.out.println("Win");
			defender.setWillpower(hitPoints - defendPoints);
			BattleWindow.combatReport = defender.getName() + " was hit";
			
		} else {
			System.out.println("Lose");
			BattleWindow.combatReport = "Hit Missed";
		}
		
	}
}


