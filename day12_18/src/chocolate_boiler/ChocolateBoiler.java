package chocolate_boiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler instance = new ChocolateBoiler();
	
	private ChocolateBoiler() {
		slowdown();
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		return instance;
	}
	
	public void fill() {
		if (isEmpty() && !isBoiled()) {
			empty = false;
			boiled = false;
			System.out.println("牛乳とチョコレートの混合液でボイラを満たす");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("沸騰した牛乳とチョコレートの混合液を空にする");
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("中身を沸騰させる");
			boiled = true;
		}
	}
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
	
	private void slowdown() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
