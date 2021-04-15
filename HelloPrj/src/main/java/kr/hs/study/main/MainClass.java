package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Hello he1 = ctx.getBean("h1",HelloWorldEn.class);
		Hello he2= ctx.getBean("h2",HelloWorldKo.class);
		he1.sayHello();
		he2.sayHello();
		ctx.close();
	}

}
