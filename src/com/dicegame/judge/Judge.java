package com.dicegame.judge;

/**

 * 3. ����(Judge)
 - ������ ���� ��������� �� �� �ֽ��ϴ�.



 - ������ ��Ͽ��� ���ؼ� �� ���帶�� �ֻ��� ������ ���(���)�� �� ������, ��� ���尡 ����Ǹ� ���ڸ� �����մϴ�.
 * */

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.dicegame.fraudplayer.FraudPlayer;
import com.dicegame.player.Player;

public class Judge {

	Player player1;
	Player player2;

	public int playerNum;

	// ������� �޼ҵ�: ������ ����� �� �ֽ��ϴ�.
	public Object playerRegister1(String name, int tendency) {

		if (tendency == 1) {
			Player player1 = new Player();// �Ϲ� �÷��̾� ����.

		} else if (tendency == 2) {
			FraudPlayer player1 = new FraudPlayer();// ��� �÷��̾� ����.
		}

		return player1;
	}

	
	public Object playerRegister2(String name, int tendency) {

		if (tendency == 1) {
			Player player2 = new Player();// �Ϲ� �÷��̾� ����.

		} else if (tendency == 2) {
			FraudPlayer player2 = new FraudPlayer();// ��� �÷��̾� ����.
		}

		return player2;
	}
	
	
	
	//��� ���尡 ����Ǹ� ���ڸ� ����
	
	public String distinctWin(Player player1, Player player2) {
		int sumplayer1 = 0;
		int sumplayer2 = 0;
		String win = " ";
		
		sumplayer1 = player.myScore();
		sumplayer2 = player.myScore();
		
        if(sumplayer1 > sumplayer2){
        	
        	win = player1.myname();
        	
        }else if(sumplayer1 < sumplayer2){
        	
        	win = player2.myname();
        }else{
        	
        	win = "���";
        }
        return win;
	}


	// ��ϸ޼ҵ�: �� ���帶�� �ֻ��� ������ ���(���)�� �� ������, 
public int rounsumPrint(){
	
}




}
