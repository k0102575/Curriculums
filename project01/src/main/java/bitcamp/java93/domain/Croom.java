// 역활: memb 테이블의 값을 보관할 떄 사용할 클래스

package bitcamp.java93.domain;

public class Croom {
	int no;
	String name;
	
	@Override
	public String toString() {
		return "Croom [no=" + no + ", name=" + name + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	




}
