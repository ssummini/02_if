package homework;

import java.io.IOException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws IOException{
		int money = 1000;
		int com, user;
		Scanner scan = new Scanner(System.in);

		com = (int)(Math.random()* 3 + 1);
		
		System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
		user = System.in.read() - '0'; 
		//int a = System.in.read();
		//int user = a - 48;
		
		System.out.print("배팅 금액 : ");
		int bat = scan.nextInt();
		System.out.println();

		System.out.println("결과를 보시려면 Enter를 치세요");
		System.in.read();
		
		//String com1 = null;
		//String user1 = null;
		
		if(com == 1) { //컴퓨터가 가위라면
			if(user == 1) {
				System.out.println("컴퓨터 : 가위, 나 : 가위");
				System.out.println("비겼다");
			}else if(user == 2) {
				System.out.println("컴퓨터 : 가위, 나 : 바위");
				System.out.println("이겼다");
				
				money = money + bat;
			}else if(user == 3) {
				System.out.println("컴퓨터 : 가위, 나 : 보자기");
				System.out.println("졌다");
				
				money = money - bat;
			}
		}else if(com == 2) { //컴이 바위라면
			if(user == 1) {
				System.out.println("컴퓨터 : 바위, 나 : 가위");
				System.out.println("졌다");
				
				money = money - bat;
			}else if(user == 2) {
				System.out.println("컴퓨터 : 바위, 나 : 바위");
				System.out.println("비겼다");
			}else if(user == 3) {
				System.out.println("컴퓨터 : 바위, 나 : 보자기");
				System.out.println("이겼다");
				
				money = money + bat;
			}
		}else if(com == 3) {//컴이 보자기라면
			if(user == 1) {
				System.out.println("컴퓨터 : 보자기, 나 : 가위");
				System.out.println("이겼다");
				
				money = money + bat;
			}else if(user == 2) {
				System.out.println("컴퓨터 : 보자기, 나 : 바위");
				System.out.println("졌다");
				
				money = money - bat;
			}else if(user == 3) {
				System.out.println("컴퓨터 : 보자기, 나 : 보자기");
				System.out.println("비겼다");
			}
		}
		
		System.out.println("현재 금액은 " +money + "원");
	}
}

			
			
//		switch(com) {
//		case 1:
//			com1 = "가위";
//			break;
//		case 2:
//			com1 = "바위";
//			break;
//		case 3:
//			com1 = "보자기";
//			break;	
//		}
//		
//		switch(user) {
//		case 1:
//			user1 = "가위";
//			break;
//		case 2:
//			user1 = "바위";
//			break;
//		case 3:
//			user1 = "보자기";
//			break;	
//		}
//		
//		System.out.println("컴퓨터는 " + com1 + ", 나는 " + user1);
//		
//        if (user == com) {
//            System.out.println("비겼다");
//            System.out.println("현재금액은 " + money);
//        } else if ((user == 1 && com == 3) ||
//                   (user == 2 && com == 1) ||
//                   (user == 3 && com == 2)) {
//            System.out.println("이겼다");
//            money += bat;
//            System.out.println("현재금액은 " + money);
//        } else {
//            System.out.println("졌다");
//            money -= bat;
//            System.out.println("현재금액은 " + money);
//        }
//	}
//}        



/*
[문제] 가위 바위 보 게임
- 가위(1), 바위(2), 보자기(3)으로 설정한다.
- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
- 기본 금액은 1000원을 기본으로 설정한다.
- System.in.read() 사용하여 입력 받는다.

[실행결과]
가위(1), 바위(2), 보자기(3) 입력 : 1 <- System.in.read() 사용
배팅 금액 : 600

결과를 보시려면 Enter를 치세요

컴퓨터 바위, 나는 가위
ㅠㅠ..졌다
현재 금액은 400윈
 */