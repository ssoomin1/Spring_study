package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
//		TestBean t1=ctx.getBean("obj1",TestBean.class);
//		System.out.println("t1의 주소: "+t1);
//		
//		TestBean t2=ctx.getBean("obj1",TestBean.class);
//		System.out.println("t2의 주소: "+t2);
		
		TestBean t1=ctx.getBean("obj1",TestBean.class);
		System.out.println("t1: "+t1);
		
		TestBean t2=ctx.getBean("obj1",TestBean.class);
		System.out.println("t2: "+t2);
		
		ctx.close(); //container를 더이상 사용하지않겠다.
	}
}
