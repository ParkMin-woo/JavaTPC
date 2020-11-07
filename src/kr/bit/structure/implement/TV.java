package kr.bit.structure.implement;

public class TV implements RemotementControl {

	@Override
	public void chUp() {
		System.out.println("TV의 채널을 올립니다.");
	}

	@Override
	public void chDown() {
		System.out.println("TV의 채널을 내립니다.");
	}

	@Override
	public void internet() {
		System.out.println("TV는 인터넷이 지원됩니다.");
	}
	
	public void turnOn() {
		System.out.println("TV의 전원이 켜집니다.");
	}
	
	public void turnOff() {
		System.out.println("TV의 전원이 꺼집니다.");
	}
}
