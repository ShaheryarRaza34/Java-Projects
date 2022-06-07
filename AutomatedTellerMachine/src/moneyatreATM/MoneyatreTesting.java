package moneyatreATM;

import java.util.ArrayList;

public class MoneyatreTesting {

	public static void main(String[] args) {
		ArrayList<Object> accountInfo = new ArrayList<Object>();
		accountInfo.add("Shaheryar Raza");
		accountInfo.add(2244);
		Moneyatre.addAccount("1047", accountInfo);
		Moneyatre.printAccounts();
		Moneyatre.verify("1048", 2244);
	}

}
