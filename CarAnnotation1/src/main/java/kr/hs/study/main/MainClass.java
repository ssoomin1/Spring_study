package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.HyunDai;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
//		HyunDai h1=ctx1.getBean(HyunDai.class);
//		System.out.println("가격: "+h1.money(1000));
//		h1.Order();
//		System.out.println("name: "+h1.getName());
//		System.out.println("color: "+h1.getColor());
//		ctx1.close();
//		
//		System.out.println("=============================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
//		Kia kia=ctx2.getBean(Kia.class);
//		System.out.println("가격: "+kia.money(1500));
//		kia.Order();
//		System.out.println("name: "+kia.getName());
//		System.out.println("color: "+kia.getColor());
		HyunDai h1=ctx2.getBean("h2",HyunDai.class);
		System.out.println("가격: "+h1.money(1000));
		h1.Order();
		ctx2.close();
	}

}
