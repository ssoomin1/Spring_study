package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
	private int a;
	private String b;
	@Autowired
	//component scan시 autowired가 있으면 자동주입을 시킨다. 
	//DataBean3 bean이 등록되어 있으면 주소값을 c에 대입. 없다면 에러 발생
	//DataBean3의 객체를 찾아서 자동으로 값을 주입시켜주는 역할. 그렇기때문에 setter가 필요없다.
	private DataBean3 c;
	
	@Autowired
	private DataBean4 d;
	
	
	public int getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	public DataBean3 getC() {
		return c;
	}
	public DataBean4 getD() {
		return d;
	}
	
	
}
