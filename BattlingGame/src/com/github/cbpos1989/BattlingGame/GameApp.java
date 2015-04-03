/**
 * 
 */
package com.github.cbpos1989.BattlingGame;

/**
 * @author Colm O'Sullivan
 *
 */
import java.util.ArrayList;

public class GameApp {
	private ArrayList<Character> startingList = new ArrayList<Character>();
	
	public static void main (String[] args){
		//System.out.println("Working");
		
		GameApp ga = new GameApp();
		ga.intializeApp();
	}
	
	void intializeApp(){
		populateList();
	}
	
	void populateList(){
		
		
		for(Character c: Character.values()){
			startingList.add(c);
			System.out.println(c);
			
		}
		
		
	}
}


