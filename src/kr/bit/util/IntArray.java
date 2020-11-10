package kr.bit.util;

public class IntArray {
	// [IntArray를 만들면서 들었던 생각...]
	// 개발자가 솔루션 회사나 IT계열사의 기술팀에 근무하지 않는 한 API를 만들 일은 없을 것이다.
	// 거의 만들어진 API를 쓰는 경우가 다수이기 때문에
	// 아마 만들 상황이 오면은 따로 어떻게 만들어야 되는지는 해당 솔루션 회사나 IT기술팀에서 알려주지 않은까???
	// 그리고 강의에 대해서 약간 아쉬운게 결국은 IntArray도 배열을 알아야지 만들 수 있는 클래스이다.
	// 그래서 배열을 모르면은 절대 만들 수 없는 클래스이다.
	// 강의에서는 아마 배열에서의 선언이나 데이터를 넣을 때 불편함을 느끼는 사람이 있으니깐 쉽게 만들어서 사용할 수 있다는 목적으로 한 것 같은데,
	// 현재 프로젝트에서 개발하는 개발자 입장에서는 배열이나 ArrayList, HashMap의 사용법을 많이 알아두는게 속편하다.
	// 이러한 객체들을 가지고 DB의 데이터를 처리하는데 많이 쓰이기 때문이다.
	// 차라리 이 파트 강의 컨셉을 처음에 ArrayList라는 객체가 있는데, "배열보다 사용하기 편하다. 모든 객체를 담을 수 있다." 등등을 먼저 알려 준 다음에
	// IntArray를 만들었으면 어땠을까 하는 아쉬움이 든다.
	// 아마 강사님도 이 점은 알고 있을 것이라고 생각한다. 나보다 짬밥이 배 이상 차이가 나기 때문에...
	
	private int count;
	private int[] arr;
	
	/**
	 * Constructor without fields
	 */
	public IntArray() {
		// super();
		this(10);
	}
	
	public IntArray(int init) {
		arr = new int[init];
	}
	
	public void add(int data) {
		arr[count++] = data;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}
