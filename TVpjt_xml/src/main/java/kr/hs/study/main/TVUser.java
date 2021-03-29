package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;

public class TVUser {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		SamsungTV st = ctx.getBean("st1",SamsungTV.class);
		LGTV lg=ctx.getBean("lg1",LGTV.class);
		System.out.println("삼성티비 가격: "+st.getPrice());
		System.out.println("삼성티비 스피커: "+st.getSpeaker());
		st.powerOn();
		st.powerDown();
		
		System.out.println("===============");
		System.out.println("엘지티비 가격: "+lg.getPrice());
		System.out.println("엘지티비 스피커: "+lg.getAspeaker());
		lg.powerOn();
		lg.powerDown();
		
		
		
		ctx.close();
	}

}
