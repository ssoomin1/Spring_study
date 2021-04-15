package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//TestBean객체 가지고와서 멤버 변수 값들 출력
		TestBean tb1= ctx.getBean("d1",TestBean.class);
		System.out.println(tb1.getData1());
		System.out.println(tb1.getData2());
		System.out.println(tb1.getData3());
		System.out.println(tb1.getData4());
		ctx.close();
		
		System.out.println("====================");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		ctx2.close();
	}

}
