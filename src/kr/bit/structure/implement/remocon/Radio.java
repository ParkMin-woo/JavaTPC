package kr.bit.structure.implement.remocon;

public class Radio implements RemotementControl {

	@Override
	public void chUp() {
		System.out.println("라디오의 채널이 올라갑니다.");
	}

	@Override
	public void chDown() {
		System.out.println("라디오의 채널이 내려갑니다.");
	}

	@Override
	public void internet() {
		System.out.println("라디오는 인터넷이 지원이 안됩니다.");
	}
	
	public void turnOn() {
		System.out.println("라디오의 전원이 켜집니다.");
	}
	
	public void turnOff() {
		System.out.println("라디오의 전원이 꺼집니다.");
	}
}
