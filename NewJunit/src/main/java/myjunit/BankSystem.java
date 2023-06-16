package myjunit;

public class BankSystem {

	private final int accuntNumber = 123456789;
	final String holderName = "saurabh";

	public boolean verifyAccount(int num, String name) {
		return (num == accuntNumber && name == holderName);

	}

}
