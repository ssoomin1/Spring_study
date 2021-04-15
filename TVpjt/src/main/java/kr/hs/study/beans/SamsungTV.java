package kr.hs.study.beans;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("삼성티비를 꺼내셨습니다.");
	}

	public void volumeUP() {
		System.out.println("삼성티비 - 볼륨을 높였습니다.");
	}

	public void volumeDown() {
		System.out.println("삼성티비 - 볼륨을 낮췄습니다.");
	}

	public void powerOn() {
		System.out.println("삼성티비가 켜졌습니다.");
	}

	public void powerOff() {
		System.out.println("삼성티비가 꺼졌습니다.");
	}
	
	

}
