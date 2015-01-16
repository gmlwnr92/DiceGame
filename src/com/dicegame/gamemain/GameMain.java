package com.dicegame.gamemain;

/**
 * 5. 메인(GameMain)

 - 메인메소드가 존재하며 여기서 프로그램이 실행됩니다.

 - 플레이어의 이름을 정할 수 있습니다.

 - 주사위는 5번 던지는것으로 하겠습니다.
 * */

/*요구사항

 1) 클래스이름은 위 설명에서 괄호안의 이름을 사용하면 됩니다.

 2) 패키지를 꼭 구분하여 작성해 주세요.

 3) 배열은 사용하지 않습니다. 컬렉션 프레임워크(List 또는 Map)를 사용해주세요.

 4) 어떤메소드든 10줄이상 넘어가지 않도록 작성해주세요.

 5) 각 클래스에 테스트케이스를 작성해주세요.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.dicegame.judge.Judge;
import com.dicegame.recorder.Recorder;

public class GameMain {
	public int throwDice = 5;// 주사위는 총 다섯번 던지는 것임.
	public static String player1_name = " ";
	public static String player2_name = " ";
	
	public static int player1_Tendency = 0;
	public static int player2_Tendency = 0;

	static Judge obj1 = new Judge();
	static Recorder obj2 = new Recorder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 일단, 선수가 2명이라고 가정...-_-;;;

		System.out.println("첫번째 선수의 이름과 성향을 입력하세요: ");
		System.out.println("**선수의 성향은 normal(1), fraud(2) 숫자를 입력하시면 됩니다.**");

		player1_name = sc.next();
		player1_Tendency = sc.nextInt();

		System.out.println("두번째 선수의 이름과 성향을 입력하세요: ");
	    player2_name = sc.next();
		player2_Tendency = sc.nextInt();
		
		
		


		obj1.playerRegister1(); // Judge를 통해 명수와 사기&일반플레이어를 가림.

		obj2.playerRecoder2();// 레코더의 기록을 주사위를 굴린 결과 출력.

	}

}

/*
 * 출력 결과.
 * 
 * [ 최강훈:6[NORMAL] 김준하:6 ]
 * 
 * [ 최강훈:8[NORMAL] 김준하:10 ]
 * 
 * [ 최강훈:13[STRONG] 김준하:14 ]
 * 
 * [ 최강훈:16[STRONG] 김준하:17 ]
 * 
 * [ 최강훈:21[STRONG] 김준하:23 ]
 * 
 * 승자를 기록합니다.
 * 
 * ex)
 * 
 * 김준하가 승리했습니다!
 */
