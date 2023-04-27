
abstract class Goat{
	void show() {
		System.out.println("Goat Class");
	}
	
	abstract void showClass(); 
	
}

interface Football {
	void goat();
}

class Cristiano extends Goat implements Football{
	@Override
	void showClass() {
		System.out.println("SIUU");
	}
	
	@Override
	public void goat() {
		System.out.println("CR&");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Cristiano cristiano = new Cristiano();
		cristiano.showClass();
		cristiano.goat();
	}
}
