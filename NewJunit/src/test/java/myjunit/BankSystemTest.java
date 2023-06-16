package myjunit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankSystemTest {
	BankSystem bs = new BankSystem();

	@Test
	public void accountTest() {
		assertTrue(bs.verifyAccount(123456789, "saurabh"));

	}

}
