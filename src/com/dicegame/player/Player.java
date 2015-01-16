package com.dicegame.player;

/**
 * 2. 플레이어(Player, FraudPlayer)

- 플레이어는 이름을 정할수 있고, 주사위를 들고있습니다. 또한 본인의 합계득점을 기억합니다.


 * */


import com.dicegame.dice.Dice;
import com.dicegame.judge.Judge;

public class Player extends Judge {
	
	public String myname = " ";
    
	
	//주사위를 던지는 메소드.
	int throwDice(){
		Dice obj1 = new Dice();
		return obj1.dice();	
	}
	
	// 본인의 합계득점을 기억하는 메소드.
	 void myScore(int result){
		
		 
	 }
	 
	// 이름설정 메소드
	public String myname(String name) {
		myname = name;
		return name;
	}
}