package com.dicegame.recorder;

/**
 * 4. 기록원(Recorder)

- 기록원은 게임의 진행상황과 결과를 기록하는 역할을 담당합니다.

- 기록은 System.out.println(); 으로 처리합니다.

- 두가지를 기록할 수 있습니다.

모든 플레이어의 스코어를 기록하며, 사기주사위를 쓰는 플레이어의 경우 주사위의 상태까지 보여줍니다.
 * */


import diceGame.Dice;
import diceGame.FraudPlayer;
import diceGame.GameMain;
import diceGame.Player;

public class Recorder {

	
	
	/*list로 변환할필요가 있음...*/
	public int playerSumScore1_1 = 0;
	public int playerSumScore1_2 = 0;
	

	public int playerSumScore2_1 = 0;
	public int playerSumScore2_2 = 0;
	
	public int resultPlayer1_1;
	public int resultPlayer1_2;
	
	public int resultPlayer2_1;
	public int resultPlayer2_2;
	
	public void playerRecoder() {

		// System.out.println("[ 최강훈:6[NORMAL] 김준하:6 ]");
//처음은 무조건 일반주사위를 던지는 것부터 시작한다.
		
		System.out.println("[" +  + ":" +  + "[]"
				+  + ":" +  + "]");

		
		System.out.println("[" +  + ":" +  + "[]"
				+  + ":" +  + "]");
	  }
	}

