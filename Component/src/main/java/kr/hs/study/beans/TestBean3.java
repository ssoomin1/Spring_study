package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
		//보통 타입으로 갖고와지는데 괄호안에 이름 입력하면 이름으로 받아진다.
		//같은 타입의 클래스 여러개 사용할 때 : id
		//하나의 패키지 안에 같은 이름의 클래스가 존재하지 않는게 (똑같은 아이디가 들어갈 이유가 없으니까 )이름 지정안해준다.
	}
}
