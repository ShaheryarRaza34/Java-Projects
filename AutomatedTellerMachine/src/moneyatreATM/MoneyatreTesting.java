package moneyatreATM;

import java.util.ArrayList;
import java.util.Arrays;

public class MoneyatreTesting {

	public static void main(String[] args) {
		Moneyatre.addAccount("1047", new ArrayList<Object>(Arrays.asList("Shaheryar Raza", 2244, 200.8)));
		Moneyatre.addAccount("1048", new ArrayList<Object>(Arrays.asList("Ahmed", 2198, 260.8)));
		Moneyatre.printAccounts();
		Moneyatre.verify("1047", 2244);
		Moneyatre.withdraw("1047", (double)180.0);
		Moneyatre.printAccounts();
		Moneyatre.transfer("1047", "1048",(double) 150.0);
		
		Moneyatre.printAccounts();
		
		Moneyatre.transfer("1048", "1047",(double) 400.0);
		Moneyatre.printAccounts();
		
		
	}

}
