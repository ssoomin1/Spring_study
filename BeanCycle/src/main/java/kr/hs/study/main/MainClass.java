package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj1=ctx.getBean("t1",TestBean.class);
		System.out.println("obj1: "+obj1);
		ctx.close();
		
		/*
		 * ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		 * TestBean obj1=ctx.getBean("t1",TestBean.class");
		 * ㄴconfig.xml에서 init-method와 destroy-method를 지정해주었기때문에 
		 * 1. 생성호출되었을 때 한번, 
		 * 2. 소멸되기 직전에 한번 출력된다
		 * System.out.println("obj1: "+obj1);
		 * ctx.close();
		 */
		
		//출력순서 : 생성자=> init 메소드 => sysout => destory메소드
	}

}
