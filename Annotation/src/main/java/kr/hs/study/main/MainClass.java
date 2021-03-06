package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1=ctx1.getBean("tb1",TestBean.class);
		System.out.println("t1: "+t1);
		TestBean2 t3=ctx1.getBean(TestBean2.class);
		System.out.println("t3.a: "+t3.getA());
		System.out.println("t3.b: "+t3.getB());
		System.out.println("t3.c: "+t3.getC());
		System.out.println("t3.d: "+t3.getD());
		
		TestBean3 t4=ctx1.getBean(TestBean3.class);
		System.out.println("t3: "+t3.getA());
		System.out.println("t3.b: "+t3.getB());
		System.out.println("t3.c: "+t3.getC());
		System.out.println("t3.d: "+t3.getD());
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean t2=ctx2.getBean(TestBean.class);
		System.out.println("t2: "+t2);
		
		System.out.println("=====================");
		TestBean3 tb3=ctx2.getBean("tb3",TestBean3.class);
		System.out.println(tb3.getData1());
		System.out.println(tb3.getData2());
		System.out.println(tb3.getData3());
		System.out.println(tb3.getData4());
		ctx2.close();
	}
}
