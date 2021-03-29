package kr.hs.study.beans;

public class SonySpeaker implements speaker{
	public SonySpeaker() {
		System.out.println("소니 스피커의 기본 생성자");
	}
	public void VolumeUp() {
		System.out.println("소니 스피커 볼륨을 키웁니다.");
	}

	public void VolumeDown() {
		System.out.println("소니 스피커 볼륨을 낮춥니다.");
	}

}
