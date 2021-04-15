package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Kia;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		Kia k11=ctx.getBean(Kia.class);
		System.out.println("가격: "+ k11.money(1500));
		k11.Order();
		System.out.println("name: "+k11.getName());
		System.out.println("color: "+k11.getColor());
		ctx.close();
	}

}
