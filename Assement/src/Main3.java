
class A {
	String name;
	int id;
	static String deptName="Football";

	public A(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	void showInfo() {
		System.out.println(name);
		System.out.println(id);
	}

	static void showDept() {
		System.out.println(deptName);
	}

}

public class Main3 {
	public static void main(String[] args) {
		A a = new A("Dhoni", 20);
		a.showInfo();
		A.showDept();
	}
}
