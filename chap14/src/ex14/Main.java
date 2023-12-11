package ex14;

public class Main {

	public static void main(String[] args) {
		// ①
		Account a = new Account("4649", 1592);
		System.out.println(a);
		
		// ②
		Account a2 = new Account(" 4649", 1000);
		if (a.equals(a2)) {
			System.out.println("同じ口座");
		} else {
			System.out.println("違う口座");
		}
				

	}

}
