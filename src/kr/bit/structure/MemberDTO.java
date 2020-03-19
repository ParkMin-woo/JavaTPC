package kr.bit.structure;

public class MemberDTO {
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	public MemberDTO() {}
	
	/**
	 * @param name
	 * @param age
	 * @param tel
	 * @param addr
	 */
	public MemberDTO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age < 1 || age > 130) {
			this.age = 0;
			System.out.println("나이가 1살 미만 또는 130살 이상입니다.\n나이를 다시 입력해 주세요.");
		}
		else {
			this.age = age;
		}
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
}
