package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		//xml설정
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1=ctx.getBean("obj1",TestBean1.class);
		System.out.println("t1: "+t1);
		ctx.close();
		System.out.println("=======================================");
		
		//자바 설정
		AnnotationConfigApplicationContext ctx2= new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean1 t2=ctx2.getBean("new",TestBean1.class);
		System.out.println("t2: "+t2);
		
//		TestBean1 t4=ctx2.getBean("new",TestBean1.class);
//		System.out.println("t4: "+t4);
		
//		System.out.println("=======================================");
//		TestBean1 t3=ctx2.getBean("java2",TestBean1.class);
//		System.out.println("t3: "+t3);
		
		TestBean1 t3=ctx2.getBean("new",TestBean1.class);
		System.out.println("t3: "+t3);
		
		TestBean1 t4=ctx2.getBean("new",TestBean1.class);
		System.out.println("t4: "+t4);
		
		TestBean2 t5=ctx2.getBean("t1",TestBean2.class);
		System.out.println("t5: "+t5);
		System.out.println(t5.getA()+"         "+t5.getB()+"        "+t5.getC());
		
		System.out.println("=================================");
		TestBean2 t6=ctx2.getBean("t2",TestBean2.class);
		System.out.println("t6: "+t6);
		System.out.println(t6.getA()+"     "+t6.getB()+"     "+t6.getC());
		ctx2.close();
	}

}
