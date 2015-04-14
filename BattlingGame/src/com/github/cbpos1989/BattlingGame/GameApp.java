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

import javax.swing.JDialog;
import javax.swing.JFrame;

public class GameApp {
	private final int NUM_OF_CHARACTERS = 5;
	private final int MAX_DIE_ROLL = 6;
	private final int MAX_D12_ROLL = 12;
	
	private ArrayList<Character> startingList = new ArrayList<Character>();
	private Random rnd = new Random();
	private static GameMenu frame;
	
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
		
		try{
			genRandomList(playerList);
			genRandomList(aiList);
			
			frame = new GameMenu();
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
			idx = randomGenerator(startingList.size());
			
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
	
	void attack(Character attacker, Character defender, JFrame battleWindow){
		
		
		int attackerDieRoll = randomGenerator(MAX_DIE_ROLL) + 1;
		int defenderDieRoll = randomGenerator(MAX_D12_ROLL) + 1;
		
		
		int hitPoints = attacker.getPower() - attackerDieRoll;
		hitPoints+= randomGenerator(MAX_D12_ROLL) + 1;
		int defendPoints = defender.getWeakness() + defenderDieRoll;
	
		System.out.println("Die Rolls " + attackerDieRoll + " " + defenderDieRoll);
		System.out.println("Attack/Defend Points " + hitPoints + " " + defendPoints );
		

		if(hitPoints > defendPoints){
			
			defender.setWillpower(defender.getWillpower() - (hitPoints - defendPoints));
			
			checkWillpower(defender);
			if(GameMenu.isBattling == false){
				JDialog message = new DeathMessage(defender.getName(), battleWindow);
				message.setVisible(true);
			}
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
			frame.updatePlayerText();
			frame.updateAIText();
			
			
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


