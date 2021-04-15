package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Kia implements Car{
	String name;
	String color;
	
	public Kia() {
		
	}
	public 

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

	public void Order() {
		System.out.println("기아차 - "+this.getName()+" 주문하였습니다.");
	}

}
