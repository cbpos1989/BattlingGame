/**
 * 
 */
package com.github.cbpos1989.BattlingGame;
/**
 * enum to hold all of the games character with thier states and behaviours.
 * 
 * @author Colm O'Sullivan
 *
 */
public enum Character {
	Lugh(14, 11, 10), 
	Brigid(8, 16, 8),
	Boann(10, 15, 9),
	Banba(10, 13, 12),
	Danu(10 , 12, 15),
	Cainte(8, 15, 13),
	Donn(14, 13, 11),
	Ériu(12, 12, 10),
	Étaín(13, 11, 14),
	Fódla(12, 14, 13),
	Macha(16, 10, 12),
	Nechtan(13, 10, 15),
	Fionn(15, 13, 10),
	CúChulainn(16, 9, 14);
	
	private int strength;
	private int craft;
	private int willpower;
	private boolean isAlive = true;
	private boolean hasBattled;
	
	Character(int strength, int craft, int willpower){
		this.strength = strength;
		this.craft = craft;
		this.willpower = willpower;
	}
	
	public String getName(){
		return super.toString();
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public int getCraft(){
		return this.craft;
	}
	
	public int getWillpower(){
		return this.willpower;
	}
	
	public void setWillpower(int willpower){
		this.willpower = willpower;
	}
	
	public boolean getStatus(){
		return this.isAlive;
	}
	
	public void setStatus(boolean status){
		this.isAlive = status;
	}
	
	public boolean hasBattled(){
		return this.hasBattled;
	}
	
	public String toString(){
		return  super.toString() + "\n Strength: " + this.strength + " Craft: " + this.craft + " Willpower: "+ this.willpower;
	}
}
