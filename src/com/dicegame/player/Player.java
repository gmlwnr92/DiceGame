package com.dicegame.player;

/**
 * 2. �÷��̾�(Player, FraudPlayer)

- �÷��̾�� �̸��� ���Ҽ� �ְ�, �ֻ����� ����ֽ��ϴ�. ���� ������ �հ������ ����մϴ�.


 * */


import com.dicegame.dice.Dice;
import com.dicegame.judge.Judge;

public class Player extends Judge {
	
	public String myname = " ";
    
	
	//�ֻ����� ������ �޼ҵ�.
	int throwDice(){
		Dice obj1 = new Dice();
		return obj1.dice();	
	}
	
	// ������ �հ������ ����ϴ� �޼ҵ�.
	 void myScore(int result){
		
		 
	 }
	 
	// �̸����� �޼ҵ�
	public String myname(String name) {
		myname = name;
		return name;
	}
}