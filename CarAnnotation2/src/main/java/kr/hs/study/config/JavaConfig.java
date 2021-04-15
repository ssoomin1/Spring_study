package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Kia;
@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")

public class JavaConfig {
	@Bean
	Kia k1() {
		Kia k=new Kia();
		k.setName("k3");
		k.setColor("gray");
		return k;
	}
}
