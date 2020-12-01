package bank;

import java.io.IOException;

// 고객의 정보를 받아서 1.일반상담 클래스와  2.금융상담 클래스를 나누어서 각각의 기능을 구현
//일반상담 클래스와 금융상담 클래스의 동일한 동작은 "고객의 정보를 받는다"
public interface CustomerInfoRequest {
	//public void infoRequest() throws IOException ;  // "고객의 정보를 받는다" 
	public void start() throws IOException ;
}
