package moneyatreATM;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.*;

public class Moneyatre {
 static Map<String,ArrayList<Object>> Accounts = new HashMap<String,ArrayList<Object>>();

public static void addAccount(String accountNumber,ArrayList<Object> accountInfo) {
	try {
	Accounts.put(accountNumber,accountInfo);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void printAccounts()
{
	System.out.println(Accounts.toString());
}
public static void verify(String accountNumber,Integer Pincode) {
	if(Accounts.containsKey(accountNumber)) {
		if(Accounts.get(accountNumber).get(1).equals(Pincode))
		{
			System.out.println("Verified");
		}
		else {
			JOptionPane.showMessageDialog(null, "INVALID PINCODE");
		}
		
		
	}
	else {
		JOptionPane.showMessageDialog(null,"INVALID ACCOUNT");
	}
	
	
	
}
}
