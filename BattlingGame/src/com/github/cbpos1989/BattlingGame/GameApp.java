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
	private Random rnd = new Random();
	
	public static ArrayList<Character> playerList = new ArrayList<Character>();
	public static ArrayList<Character> aiList = new ArrayList<Character>();
	
	
	
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
			
			GameMenu frame = new GameMenu();
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
	
	/*void removeListEntry(ArrayList<Character> list, Character character){
		list.remove(character);
		
		System.out.println(list);
	}*/
	
	void attack(Character attacker, Character defender){
		
		
		int attackerDieRoll = randomGenerator(MAX_DIE_ROLL) + 1;
		int defenderDieRoll = randomGenerator(MAX_DIE_ROLL) + 1;
		
		
		int hitPoints = attacker.getStrength() - attackerDieRoll;
		int defendPoints = defender.getCraft() - defenderDieRoll;
	
		
		
		if(hitPoints > defendPoints){
			
			defender.setWillpower(defender.getWillpower() - (hitPoints - defendPoints));
			
			checkWillpower(defender);
			
		} else {
			
			BattleWindow.combatReport = "Hit Missed";
		}
		
	}
	
	void checkWillpower(Character defender){
		if(defender.getWillpower() < 1){
			BattleWindow.combatReport = defender.getName() + " was slain";
			GameMenu.isBattling = false;
			defender.setWillpower(0);
			defender.setStatus(false);
			
			if(BattleWindow.isPlayerTurn){
				GameMenu.playerScore++;
			} else {
				GameMenu.aiScore++;
			}
		} else{
			BattleWindow.combatReport = defender.getName() + " was hit";
		}
	}
}


