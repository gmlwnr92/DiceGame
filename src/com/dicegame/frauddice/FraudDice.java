package com.dicegame.frauddice;

import com.dicegame.dice.Dice;



public class FraudDice extends Dice{
	
private int result = 0;
	
// �Ϲݸ��: ���� �ֻ����� �����մϴ�.
	int normalDice() {
     
		return dice();
		
	}

	
	// ���Ը��: 5�̻��� ������ ������ �ٽ� �����ϴ�.
	int weakDice() {
		do  { 
			normalDice();
		}while(normalDice() >= 5); 
		return 	result;									
	    }

	
	
	// ���Ը��: 2������ ������ ������ �ٽ� �����ϴ�.
	int strongDice() {
		
     do{
    	  normalDice();
     }while(normalDice()<=2);
        return result;
	}

	
	
	// ������ �հ������ ����ϴ� �޼ҵ�.
	void myScore(int result) {

	}

}
