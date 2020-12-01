package bank;

import java.io.IOException;

public class FinanceConsulting implements CustomerInfoRequest {

	@Override
	public void start() throws IOException {
		System.out.println("금융상담을 선택하셨습니다.");
		System.out.println("1. 통장개설   2. 신규가입   3. 해지 ");
		System.out.println("번호를 입력하세요");
		int option = System.in.read();
		if(option == 1) {
			fund();
		}
		else if(option == 2) {
			exchage();
		}
		else {
			loan();
		}
	}
	
	public void fund() {
		System.out.println("펀드를 선택하셨습니다.");
	}
	public void exchage() {
		System.out.println("환전을 선택하셨습니다.");
	}
	


	//1. Customer 클래스의 객체 A를 입력받는다.
	//2. 객체 A의 credit(신용등급)을 비교하여서 대출한도를 출력한다.
	//#문법적문제 -> Customer 클래스의 객체 A를 어떻게 입력받는지 문법적으로 정확한지 잘 모르겠습니다.
	public void loan() {				
		System.out.println("대출을 선택하셨습니다.");
		
		/*
		if (A.credit == 1) {
			System.out.println("1억원 대출 가능합니다.");
		}
		else if(A.credit==2){
			System.out.println("5,000만원 대출 가능합니다.");
		}
		else if(A.credit == 3){
			System.out.println("2000만원 대출 가능합니다.");
		}
		else {
			System.out.println("대출 불가합니다.");
		}
		*/
	}
}
