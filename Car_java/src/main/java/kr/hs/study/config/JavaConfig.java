package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.hs.study.beans.HynDai;
import kr.hs.study.beans.Kia;

@Configuration 
public class JavaConfig {
	@Bean
	@Lazy
	public HynDai HynDai() {
		HynDai h1=new HynDai("avante","blue");
		System.out.println("가격: "+h1.money(1000));
		h1.order();
		System.out.println(h1.getName());
		System.out.println(h1.getColor());
		return h1;
	}
	
	@Bean
	@Lazy
	public Kia Kia() {
		Kia k1=new Kia("k3","gray");
		System.out.println("가격: "+k1.money(1300));
		k1.order();
		System.out.println(k1.getName());
		System.out.println(k1.getColor());
		return k1;
	}
	
	
	
}
