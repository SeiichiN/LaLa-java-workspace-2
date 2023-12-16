package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import p410.Account;

class AccountTest {

	@Test
	void instanceTest() {
		Account a = new Account("ミナト", 3000);
		assertEquals("ミナト", a.owner);
		// fail("まだ実装されていません");
	}

}
