package kr.hs.study.beans;

public class Kia implements car {
	private String name;
	private String color;
	
	public Kia() {
		System.out.println("기아차 구매를 시작합니다.");
	}
	
	public Kia(String name, String color) {
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
		System.out.println("기아차 - "+this.getName()+"주문합니다.");
	}
	
}
