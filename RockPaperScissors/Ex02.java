package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("가위 바위 보 게임");
		System.out.println("1.주먹 2.가위 3.보");
		System.out.println("숫자를 입력하세요 : ");
		int com =0;
		int user = sc.nextInt();
		com = r.nextInt(3)+1;
		//0~2 중 하나가 나오기 때문에 +1을 해서 1~3이 나오게 함
		
//		System.out.println("유저"+user);
//		System.out.println("컴퓨터"+com);
		
		if(user == 1) {
			if(com ==2 ) {
				System.out.println("승리");
			}
			else if (com ==3) {
				System.out.println("패배");
			}
			else {
				System.out.println("무승부");
			}
		}
		else if(user == 2) {
			if(com == 2) {
				System.out.println("무승부");
			}
			else if (com == 3) {
				System.out.println("승리");
			}
			else {
				System.out.println("패배");
			}
		}
		else if(user ==3){
			if(com ==2) {
				System.out.println("패배");
			}
			else if(com ==3) {
				System.out.println("무승부");
			}
			else {
				System.out.println("승리");
			}
		}
		else {
			System.out.println("다시 입력해주세요");
		}
		sc.close();
	}

}
