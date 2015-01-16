package com.dicegame.dice;



public class Dice {
	//1~6사이의 랜덤한 값반환.
	public int dice() {
		int result = (int)(Math.random()*6)+1;
		return result;
	}
	
	

}
