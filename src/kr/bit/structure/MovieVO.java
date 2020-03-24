package kr.bit.structure;

public class MovieVO {
	private String title;
	private int price;
	private String director;
	private int level;
	private float time;
	
	public MovieVO() {}

	/**
	 * @param title
	 * @param price
	 * @param director
	 * @param level
	 * @param time
	 */
	public MovieVO(String title, int price, String director, int level, float time) {
		super();
		this.title = title;
		this.price = price;
		this.director = director;
		this.level = level;
		this.time = time;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the time
	 */
	public float getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(float time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", director=" + director + ", level=" + level
				+ ", time=" + time + "]";
	}
	
}
