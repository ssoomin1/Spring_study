package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
	
	public void init() {
		System.out.println("new Bean의 init메서드. 객체 생성후 호출됨");
	}
	
	public void destroy() {
		System.out.println("new Bean의 destroy메서드. ctx close 전에 호출됨");
	}
	
}
