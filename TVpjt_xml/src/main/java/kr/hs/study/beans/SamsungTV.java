package kr.hs.study.beans;

public class SamsungTV implements TV{
	int price;
	SonySpeaker speaker;

	public SamsungTV(int price, SonySpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public SonySpeaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}


	public void powerOn() {
		System.out.println("삼성 티비를 켰습니다.");
	}

	public void powerDown() {
		System.out.println("삼성 티비를 껐습니다.");
	}
	
}
