package com.dicegame.judge;

/**

 * 3. 심판(Judge)
 - 심판을 통해 선수등록을 할 수 있습니다.



 - 심판은 기록원을 통해서 매 라운드마다 주사위 총합을 기록(출력)할 수 있으며, 모든 라운드가 종료되면 승자를 판정합니다.
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

	// 선수등록 메소드: 선수를 등록할 수 있습니다.
	public Object playerRegister1(String name, int tendency) {

		if (tendency == 1) {
			Player player1 = new Player();// 일반 플레이어 생성.

		} else if (tendency == 2) {
			FraudPlayer player1 = new FraudPlayer();// 사기 플레이어 생성.
		}

		return player1;
	}

	
	public Object playerRegister2(String name, int tendency) {

		if (tendency == 1) {
			Player player2 = new Player();// 일반 플레이어 생성.

		} else if (tendency == 2) {
			FraudPlayer player2 = new FraudPlayer();// 사기 플레이어 생성.
		}

		return player2;
	}
	
	
	
	//모든 라운드가 종료되면 승자를 판정
	
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
        	
        	win = "비김";
        }
        return win;
	}


	// 기록메소드: 매 라운드마다 주사위 총합을 기록(출력)할 수 있으며, 
public int rounsumPrint(){
	
}




}
