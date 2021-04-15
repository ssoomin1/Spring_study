package kr.hs.study.beans;

public class TestBean2 {
	private int a;
	private double b;
	private String c;
	private DataBean1 d1;
	
	public TestBean2(int a, double b, String c, DataBean1 d1) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d1 = d1;
	}

	public TestBean2() {
		System.out.println("기본생성자");
	}
	
	//이런걸 POJO 클래스라고한다. 데이터만 집어넣는 . 아무런 일도 하지 않는 메서드를 의미한다.
	public TestBean2(int a,double b, String c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	public DataBean1 getD1() {
		return d1;
	}

	public void setD1(DataBean1 d1) {
		this.d1 = d1;
	}

	
	
}
