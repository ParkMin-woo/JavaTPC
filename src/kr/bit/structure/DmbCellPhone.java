package kr.bit.structure;

public class DmbCellPhone extends CellPhone {
	private String owner;
	private int dmbChannelNum;

	/**
	 * @param dmbChannelNum
	 */
	public DmbCellPhone(String model, String color , String owner, int dmbChannelNum) {
		/*
		super();
		this.model = model;
		this.color = color;
		*/
		super(model, color);
		this.owner = owner;
		this.dmbChannelNum = dmbChannelNum;
	}
	
	public void dmbTurnOn() {
		System.out.println(model + "의 dmb를 켭니다.");
	}
	
	public void changeDmbChannel(int dmbChannelNum) {
		this.dmbChannelNum = dmbChannelNum;
		System.out.println(dmbChannelNum + "번으로 채널이 변경되었습니다.");
	}
	
	public void dmbTurnOff() {
		System.out.println(model + "의 dmb가 꺼집니다.");
	}

	/**
	 * @return the dmbChannelNum
	 */
	public int getDmbChannelNum() {
		return dmbChannelNum;
	}

	/**
	 * @param dmbChannelNum the dmbChannelNum to set
	 */
	public void setDmbChannelNum(int dmbChannelNum) {
		this.dmbChannelNum = dmbChannelNum;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "DmbCellPhone [dmbChannelNum=" + dmbChannelNum + ", model=" + model + ", color=" + color +  ", owner=" + owner + "]";
	}
}
