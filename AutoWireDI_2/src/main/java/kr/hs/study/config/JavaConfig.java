package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean;

@Configuration
public class JavaConfig {
	
	@Bean
	public TestBean tb2() {
//		System.out.println(t1.getData1());
//		System.out.println(t1.getData2());
//		System.out.println(t1.getData3());
//		System.out.println(t1.getData4());
		return new TestBean(d3(),d4()); //함수 메서드 호출 형식으로
	}
	
	@Bean
	public DataBean3 d3() {
		return new DataBean3(); //함수 메서드 호출 형식으로
	}
	
	@Bean
	public DataBean4 d4(){
		return new DataBean4();
	}
	
	
}
