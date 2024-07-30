package if_;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException { //자동차 보험 드는거 사고날거 대비하는거
		System.out.print("문자 입력 : ");
		int a = System.in.read(); //실행 아직 안 함. 컴파일할 때 나는 리셉션 예방, 보험처리
		                          // 1개 문자 입력
		System.in.read();
		System.in.read(); //이 두 개가 엔터 읽어주는 역할 / 읽고 끝냄 저장x / 엔터 처리
		//버퍼 지우는 flush
		
		System.out.print("문자 입력 : ");
		int b = System.in.read(); 
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
