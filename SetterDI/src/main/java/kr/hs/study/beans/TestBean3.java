package kr.hs.study.beans;

public class TestBean3 {
	private int data1;
	private double data2;
	DataBean3 data3;
	DataBean3 data4;
	DataBean3 data5;
	
	public TestBean3() {
		System.out.println("기본생성자");
	}
	
	
public TestBean3(int data1, double data2) {
		this.data1 = data1;
		this.data2 = data2;
	}


	public TestBean3(DataBean3 data3, DataBean3 data4, DataBean3 data5) {
		this.data3 = data3;
		this.data4 = data4;
		this.data5 = data5;
	}
	
	
	public TestBean3(int data1, double data2, DataBean3 data3, DataBean3 data4, DataBean3 data5) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
		this.data5 = data5;
	}


	public DataBean3 getData3() {
		return data3;
	}
	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}
	public DataBean3 getData4() {
		return data4;
	}
	public void setData4(DataBean3 data4) {
		this.data4 = data4;
	}
	public DataBean3 getData5() {
		return data5;
	}
	public void setData5(DataBean3 data5) {
		this.data5 = data5;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public double getData2() {
		return data2;
	}

	public void setData2(double data2) {
		this.data2 = data2;
	}
	
	
}
