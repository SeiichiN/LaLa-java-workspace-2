package p655;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println(num);
	}
	
	public static int inputNum() {
		System.out.println("数字を入力 > ");
		int num = new Scanner(System.in).nextInt();
		return num;
	}

}
