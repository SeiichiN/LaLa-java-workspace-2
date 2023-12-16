package p410.test;

import p410.Account;

public class AccountTest {
	public static void main(String[] args) {
		testInstantiate();
	}
	
	public static void testInstantiate() {
		System.out.println("new Test");
		Account a = new Account("アサカ", 30000);
		if (!"ミナト".equals(a.owner)) {
			System.out.println("名義人がおかしい");
		}
		if (30000 != a.balance) {
			System.out.println("残高がおかしい");
		}
		System.out.println("テスト終了");
	}
}
