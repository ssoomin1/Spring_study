package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		ctx2.close();

	}

}
