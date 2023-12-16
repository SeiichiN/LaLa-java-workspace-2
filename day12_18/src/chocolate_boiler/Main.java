package chocolate_boiler;

public class Main {

	public static void main(String[] args) {
		ChocoThread t1 = new ChocoThread();
		t1.start();
		ChocoThread t2 = new ChocoThread();
		t2.start();

	}

}
