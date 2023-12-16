package chocolate_boiler;

public class __ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static __ChocolateBoiler instance;
	
	private __ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static synchronized __ChocolateBoiler getInstance() {
		if (instance == null) {
			instance = new __ChocolateBoiler();
		}
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
			boiled = false;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("中身を沸騰させる");
			empty = false;
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
