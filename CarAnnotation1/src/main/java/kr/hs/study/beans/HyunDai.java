package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HyunDai implements Car{
	String name;
	String color;
	
	
	public HyunDai(String name) {
		this.name = name;
	}

	@Autowired
	public HyunDai(@Value("avante") String name,@Value("blue") String color) {
		this.name=name;
		this.color=color;
	}
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int money(int money) {
		return money;
	}

	public void Order() {
		System.out.println("현대차의 "+this.getName()+"를 주문합니다.");
	}

}
