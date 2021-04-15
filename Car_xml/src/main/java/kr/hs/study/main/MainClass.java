package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HynDai;
import kr.hs.study.beans.Kia;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HynDai h1=ctx.getBean("HynDai",HynDai.class);
		System.out.println("가격 : " +h1.money(1000));
		h1.order();
		System.out.println("name: "+h1.getName());
		System.out.println("color: "+h1.getColor());
		
		System.out.println("=========================");
		Kia k1=ctx.getBean("Kia",Kia.class);
		System.out.println("가격: "+k1.money(1300));
		k1.order();
		System.out.println("name: "+k1.getName());
		System.out.println("color: "+k1.getColor());
		ctx.close();
	}

}
