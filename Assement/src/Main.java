
class Operation {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

}

public class Main {
	public static void main(String[] args) {
		Operation operation = new Operation();
		System.out.println(operation.add(10, 2));
		System.out.println(operation.add(12, 120, 23));
	}
}
