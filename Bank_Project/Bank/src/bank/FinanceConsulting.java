package bank;

import java.io.IOException;

public class FinanceConsulting implements CustomerInfoRequest {

	@Override
	public void start() throws IOException {
		System.out.println("��������� �����ϼ̽��ϴ�.");
		System.out.println("1. ���尳��   2. �ű԰���   3. ���� ");
		System.out.println("��ȣ�� �Է��ϼ���");
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
		System.out.println("�ݵ带 �����ϼ̽��ϴ�.");
	}
	public void exchage() {
		System.out.println("ȯ���� �����ϼ̽��ϴ�.");
	}
	


	//1. Customer Ŭ������ ��ü A�� �Է¹޴´�.
	//2. ��ü A�� credit(�ſ���)�� ���Ͽ��� �����ѵ��� ����Ѵ�.
	//#���������� -> Customer Ŭ������ ��ü A�� ��� �Է¹޴��� ���������� ��Ȯ���� �� �𸣰ڽ��ϴ�.
	public void loan() {				
		System.out.println("������ �����ϼ̽��ϴ�.");
		
		/*
		if (A.credit == 1) {
			System.out.println("1��� ���� �����մϴ�.");
		}
		else if(A.credit==2){
			System.out.println("5,000���� ���� �����մϴ�.");
		}
		else if(A.credit == 3){
			System.out.println("2000���� ���� �����մϴ�.");
		}
		else {
			System.out.println("���� �Ұ��մϴ�.");
		}
		*/
	}
}
