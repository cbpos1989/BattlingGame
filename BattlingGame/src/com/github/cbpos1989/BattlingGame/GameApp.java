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
			
			playerList(playerList);
			GameMenu frame = new GameMenu(playerList);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	int randomGenerator(){
		return rnd.nextInt(startingList.size()-1);
	}
	
	void populateList(){
		for (Character c: Character.values()) {
			startingList.add(c);
			
		}
	}
	
	void playerList(ArrayList<Character> list){
		int idx = 0;
		
		for (int i = 0; i < NUM_OF_CHARACTERS;) {
			idx = randomGenerator();
			
			if(startingList.get(idx) != null){
				list.add(startingList.get(idx));
				System.out.println(list.get(i));
				++i;
			} else {
				continue;
			}
		}
		
	}
}


