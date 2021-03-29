package kr.hs.study.beans;

public class AppleSpeaker implements speaker{
	public AppleSpeaker() {
		System.out.println("애플스피커 기본 생성자");
	}
	
	public void VolumeUp() {
		System.out.println("애플 스피커 볼륨을 키웁니다");
	}

	public void VolumeDown() {
		System.out.println("애플 스피커 볼륨을 낮춥니다.");
	}

}
