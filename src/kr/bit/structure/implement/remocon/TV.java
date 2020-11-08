package kr.bit.structure.implement.remocon;

public class TV implements RemotementControl {
	public int currentChannel = 80;

	@Override
	public void chUp() {
		if(currentChannel < RemotementControl.MAX_CHANNEL) {
			currentChannel++;
			System.out.println("TV의 채널을 올립니다.");
			System.out.println("현재 채널 : " + currentChannel);
		} else {
			// currentChannel = 1;
			currentChannel = RemotementControl.MIN_CHANNEL;
			System.out.println("TV의 채널이 " + currentChannel + "로 초기화 되었습니다.");
			System.out.println("현재 채널 : " + currentChannel);
		}
	}

	@Override
	public void chDown() {
		if(currentChannel > RemotementControl.MIN_CHANNEL) {
			currentChannel--;
			System.out.println("TV의 채널을 내립니다.");
			System.out.println("현재 채널 : " + currentChannel);
		} else {
			// currentChannel = 100;
			currentChannel = RemotementControl.MAX_CHANNEL;
			System.out.println("TV의 채널이 " + currentChannel + "으로 초기화 되었습니다.");
			System.out.println("현재 채널 : " + currentChannel);
		}
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
