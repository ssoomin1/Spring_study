package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaConfig {
	@Bean
	TestBean tb2() {
		TestBean test2=new TestBean();
		return test2;
	}
	
	@Bean
	public TestBean3 tb3() {
		//return new TestBean3(50,55.55,new DataBean3(),new DataBean4());
		TestBean3 tt3=new TestBean3();
		tt3.setData1(55);
		tt3.setData2(55.55);
		tt3.setData3(new DataBean3());
		tt3.setData4(new DataBean4());
		
		return tt3;
	}
}
