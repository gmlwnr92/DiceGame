package com.dicegame.gamemain;

/**
 * 5. ����(GameMain)

 - ���θ޼ҵ尡 �����ϸ� ���⼭ ���α׷��� ����˴ϴ�.

 - �÷��̾��� �̸��� ���� �� �ֽ��ϴ�.

 - �ֻ����� 5�� �����°����� �ϰڽ��ϴ�.
 * */

/*�䱸����

 1) Ŭ�����̸��� �� ������ ��ȣ���� �̸��� ����ϸ� �˴ϴ�.

 2) ��Ű���� �� �����Ͽ� �ۼ��� �ּ���.

 3) �迭�� ������� �ʽ��ϴ�. �÷��� �����ӿ�ũ(List �Ǵ� Map)�� ������ּ���.

 4) ��޼ҵ�� 10���̻� �Ѿ�� �ʵ��� �ۼ����ּ���.

 5) �� Ŭ������ �׽�Ʈ���̽��� �ۼ����ּ���.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.dicegame.judge.Judge;
import com.dicegame.recorder.Recorder;

public class GameMain {
	public int throwDice = 5;// �ֻ����� �� �ټ��� ������ ����.
	public static String player1_name = " ";
	public static String player2_name = " ";
	
	public static int player1_Tendency = 0;
	public static int player2_Tendency = 0;

	static Judge obj1 = new Judge();
	static Recorder obj2 = new Recorder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ϴ�, ������ 2���̶�� ����...-_-;;;

		System.out.println("ù��° ������ �̸��� ������ �Է��ϼ���: ");
		System.out.println("**������ ������ normal(1), fraud(2) ���ڸ� �Է��Ͻø� �˴ϴ�.**");

		player1_name = sc.next();
		player1_Tendency = sc.nextInt();

		System.out.println("�ι�° ������ �̸��� ������ �Է��ϼ���: ");
	    player2_name = sc.next();
		player2_Tendency = sc.nextInt();
		
		
		


		obj1.playerRegister1(); // Judge�� ���� ����� ���&�Ϲ��÷��̾ ����.

		obj2.playerRecoder2();// ���ڴ��� ����� �ֻ����� ���� ��� ���.

	}

}

/*
 * ��� ���.
 * 
 * [ �ְ���:6[NORMAL] ������:6 ]
 * 
 * [ �ְ���:8[NORMAL] ������:10 ]
 * 
 * [ �ְ���:13[STRONG] ������:14 ]
 * 
 * [ �ְ���:16[STRONG] ������:17 ]
 * 
 * [ �ְ���:21[STRONG] ������:23 ]
 * 
 * ���ڸ� ����մϴ�.
 * 
 * ex)
 * 
 * �����ϰ� �¸��߽��ϴ�!
 */
