package com.github.cbpos1989.BattlingGame;

public enum Character {
	Lugh(8, 5), 
	Brigid(2,10),
	Boann(4, 9),
	Banba(4,7),
	Danu(4,6),
	Cainte(2,9),
	Donn(8,7),
	Ériu(6,6),
	Étaín(7,5),
	Fódla(6,8),
	Macha(10, 4),
	Nechtan(7,4),
	Fionn(9,7),
	CúChulainn(10,3);
	
	private int strength;
	private int craft;
	
	Character(int strength, int craft){
		this.strength = strength;
		this.craft = craft;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public int getCraft(){
		return this.craft;
	}
	
	public String toString(){
		return  "Strength: " + this.strength + " Craft: " + this.craft;
	}
}
