package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Autowired, Queali..는 기본 제공 Inject,Named나 밑에 같은건 라이브러리 설치 필요 =>JSR250
//메이븐과 브래들을 많이 사용함 => 빌더로 하는 일:자바를 실행하여 컴파일시키고 에러잡고 배포하는 과정을 해준다.
public class TestBean {
	public TestBean() {
		System.out.println("TestBean 기본생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean의 init 메서드");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean의 destroy 메서드");
	}
}
