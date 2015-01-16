package com.dicegame.frauddice;

import com.dicegame.dice.Dice;



public class FraudDice extends Dice{
	
private int result = 0;
	
// 일반모드: 보통 주사위와 동일합니다.
	int normalDice() {
     
		return dice();
		
	}

	
	// 약함모드: 5이상의 눈금이 나오면 다시 던집니다.
	int weakDice() {
		do  { 
			normalDice();
		}while(normalDice() >= 5); 
		return 	result;									
	    }

	
	
	// 강함모드: 2이하의 눈금이 나오면 다시 던집니다.
	int strongDice() {
		
     do{
    	  normalDice();
     }while(normalDice()<=2);
        return result;
	}

	
	
	// 본인의 합계득점을 기억하는 메소드.
	void myScore(int result) {

	}

}
