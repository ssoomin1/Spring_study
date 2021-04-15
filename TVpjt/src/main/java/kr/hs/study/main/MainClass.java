package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.apple;
import kr.hs.study.beans.soni;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		SamsungTV st1=ctx.getBean("samsung",SamsungTV.class);
		st1.powerOn();
		st1.volumeUP();
		st1.powerOff();
		
		LGTV lt1=ctx.getBean("lg",LGTV.class);
		soni s1=ctx.getBean("soni",soni.class);
		apple a1=ctx.getBean("apple",apple.class);
		
		
		ctx.close();
	}

}
