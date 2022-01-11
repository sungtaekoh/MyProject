package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
 public static void main(String[] args) {
	//가위바위보 게임
	 Scanner input = new Scanner(System.in);
	 Random random = new Random();
	 int n = 0;
	 int i =0 ;
	 System.out.println("1. 게임 시작");
	 System.out.println("2. 게임 종료");
	 n = input.nextInt();
	 if( n == 1) {//게임 시작
		 while(true) {
		 System.out.println("1. 가위 2. 바위 3.보");
		 int player1 = input.nextInt();
		 i = random.nextInt(3);
		 if(player1 == 1){//가위
			 System.out.println("가위를 내셨습니다");
			 if(i == 0) {
				 System.out.println("상대방이 보를 냈습니다");
				 System.out.println("당신의 승리!!");
			 }else if(i == 1) {
				 System.out.println("상대방이 가위를 냈습니다");
				 System.out.println("비겼습니다!");
			 }else if(i ==2 ) {
				 System.out.println("상대방이 바위를 냈습니다");
				 System.out.println("당신의 패배!!");
			 }
		 }else if(player1 == 2) {//바위
			 System.out.println("바위를 내셨습니다");
			 if(i == 0) {
				 System.out.println("상대방이 보를 냈습니다");
				 System.out.println("당신의 패배!!");
			 }else if(i == 1) {
				 System.out.println("상대방이 가위를 냈습니다");
				 System.out.println("당신의 승리!!");
			 }else if(i ==2 ) {
				 System.out.println("상대방이 바위를 냈습니다");
				 System.out.println("비겼습니다!!");
			 }
		 }else if(player1 ==3 ) {//보
			 System.out.println("보를 내셨습니다");
			 if(i == 0) {
				 System.out.println("상대방이 보를 냈습니다");
				 System.out.println("비겼습니다!!");
			 }else if(i == 1) {
				 System.out.println("상대방이 가위를 냈습니다");
				 System.out.println("당신의 패배!!");
			 }else if(i ==2 ) {
				 System.out.println("상대방이 바위를 냈습니다");
				 System.out.println("당신의 승리!!");
			 }
		 }else {
			 System.out.println("잘 못 누르셨습니다 다시 눌러주세요");
		 }
		 }
	 }else if(n == 2){//게임 종료
		 System.out.println("게임이 종료 됩니다");
	 }else {//오류
		 System.out.println("잘 못 누르셨습니다");
	 }
	 
}
}
