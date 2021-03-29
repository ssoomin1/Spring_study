package kr.hs.study.beans;

public class LGTV implements TV{
	int price;
	AppleSpeaker aspeaker;
	
	public LGTV(int price, AppleSpeaker aspeaker) {
		this.price = price;
		this.aspeaker = aspeaker;
	}
	
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public AppleSpeaker getAspeaker() {
		return aspeaker;
	}


	public void setAspeaker(AppleSpeaker aspeaker) {
		this.aspeaker = aspeaker;
	}


	public LGTV() {
		System.out.println("LGTV 기본 생성자");
	}
	public void powerOn() {
		System.out.println("LG 티비를 켰습니다.");
	}

	public void powerDown() {
		System.out.println("LG 티비를 껐습니다.");
	}

}
