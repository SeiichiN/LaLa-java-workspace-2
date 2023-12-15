package zero_error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("数字を入力>");
				int n = new Scanner(System.in).nextInt();
				int ans = (int) (10 / n);
				System.out.println(ans);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("数字ではないs");
			}
			
		}
		
	}

}
