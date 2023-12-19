package p681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		sub();
	}
	
	public static void sub() {
		subsub();
	}
	
	public static void subsub() {
		System.out.println("数字 > ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("n:" + n);
	}

}
