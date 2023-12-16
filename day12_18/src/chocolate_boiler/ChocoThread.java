package chocolate_boiler;

public class ChocoThread extends Thread {
	public void run() {
		___ChocolateBoiler boiler = ___ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
	}
}
