package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//자바 코드로 obj1이라는 객체 생성해서 멤버 변수 값 출력하기
		
//		TestBean1 obj1=new TestBean1();
//		obj1.prData();
//		System.out.println("========================================");
//		TestBean1 obj2=ctx.getBean("t2",TestBean1.class);
//		obj2.prData();
//		
//		TestBean1 obj3=ctx.getBean("t3",TestBean1.class);
//		obj3.prData();
//		
//		TestBean2 obj6=ctx.getBean("t6",TestBean2.class);
//		obj6.prData();
//		
		//TestUser tu1=ctx.getBean("user1",)
		
//		System.out.println("==================");
//		TestBean3 obj7=ctx.getBean("t7",TestBean3.class);
//		System.out.println("obj7.data1: "+obj7.getData1());
		
		TestBean1 obj1=ctx.getBean("t2",TestBean1.class);
		obj1.prData();
		System.out.println("=================");
		TestBean1 obj2=ctx.getBean("t3",TestBean1.class);
		obj2.prData();
	
		System.out.println("=================");
		TestBean1 obj3=ctx.getBean("t5",TestBean1.class);
		obj3.prData();
		
		System.out.println("==================");
		TestBean2 obj4=ctx.getBean("t6",TestBean2.class);
		obj4.prData();
		ctx.close();
	}

}
