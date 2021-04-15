package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration 
//아 얘는 빈을 등록하라는 설정파일이구나라고 인식
public class JavaConfig {
//	<bean id="obj1" class="kr.hs.study.beans.TestBean1" />      
	
	//메서드 이름 = 빈의 아이디
	
	@Bean(name="new",initMethod="init",destroyMethod="destroy")
	@Lazy
	@Scope("prototype")
	public TestBean1 java1() {
		TestBean1 t1=new TestBean1();
		return t1; //객체주솟값 리턴
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2=new TestBean1();
		return t2;
	}
	
	@Bean
	public TestBean2 t1() {
		TestBean2 t3=new TestBean2(10,"spring1",new DataBean2());
		return t3;
	}
	
	@Bean
	public TestBean2 t2() {
		TestBean2 t4=new TestBean2();
		t4.setA(300);
		t4.setB("spring2");
		t4.setC(new DataBean2());
		return t4;
	}
}
