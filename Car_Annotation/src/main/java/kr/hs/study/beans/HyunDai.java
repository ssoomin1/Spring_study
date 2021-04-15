package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HyunDai implements Car{
	String name;
	String color;
	
	@Autowired
	public HyunDai(@Value("avante") String name, @Value("blue")String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int money(int money) {	
		return money;
	}

	public void order() {
		System.out.println("현대차 - "+this.getName()+" 주문합니다.");
	}

}
