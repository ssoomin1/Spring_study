package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.HynDai;
import kr.hs.study.beans.Kia;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		HynDai h1=ctx2.getBean("HynDai",HynDai.class);
		System.out.println("=======================");
		Kia k1=ctx2.getBean("Kia",Kia.class);
		ctx2.close();
	}

}
