package kr.hs.study.beans;

public class LGTV implements TV{
	public LGTV() {
		System.out.println("LG티비를 꺼냈습니다.");
	}
	
	public void volumeUP() {
		System.out.println("LG티비 - 볼륨을 높였습니다.");
	}

	public void volumeDown() {
		System.out.println("LG티비 - 볼륨을 낮췄습니다.");
	}

	public void powerOn() {
		System.out.println("LG티비가 켜졌습니다.");
	}

	public void powerOff() {
		System.out.println("LG티비가 꺼졌습니다.");
	}

}
