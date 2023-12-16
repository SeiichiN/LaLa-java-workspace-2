package chocolate_boiler;

public class ___ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ___ChocolateBoiler instance;
	
	private ___ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ___ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (___ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ___ChocolateBoiler();
				}
			}
		}
		return instance;
	}
	
	public void fill() {
		if (isEmpty()) {
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
}
