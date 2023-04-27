
class Operation {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int sub(int a,int b) {
		return a+b;
	}
}

class Subt extends Operation{
	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
}

public class Main {
	public static void main(String[] args) {
		Operation operation = new Operation();
		System.out.println(operation.add(10, 2));
		System.out.println(operation.add(12, 120, 23));
	
		Operation operation2 = new Subt();
		System.out.println(operation2.sub(20, 15));
	}
}
