package kr.bit.structure.implement.remocon;

public interface RemotementControl {
	public final static int MAX_CHANNEL = 100;
	public int MIN_CHANNEL = 1;
	
	public void chUp();
	public void chDown();
	public void internet();
}
