package moneyatreATM;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.text.DecimalFormat;
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

public static void withdraw(String accountNumber, Double amount)
{
	
	if((Double)Accounts.get(accountNumber).get(2)>=amount)
	{
		JOptionPane.showOptionDialog(null, 
		        "Is Amount Correct?", 
		        "Confirmation", 
		        JOptionPane.OK_OPTION, 
		        JOptionPane.INFORMATION_MESSAGE, 
		        null, 
		        new String[]{"Confirm", "Go Back"}, // this is the array
		        "default");
		Accounts.get(accountNumber).set(2,((Double)Accounts.get(accountNumber).get(2)-amount));
	}
	else {
		JOptionPane.showMessageDialog(null, "Insufficient Balance");
		
	}
}

public static boolean validateAccount(String accountNumber)
{
	return((Accounts.containsKey(accountNumber))? true:false);
	
}
public static void transfer(String depositor,String payee, double amount)
{	if(validateAccount(depositor)==false||validateAccount(payee)==false)
		JOptionPane.showMessageDialog(null, "Invalid Account");
	else {
		if((Double)Accounts.get(depositor).get(2)>=amount)
		{
			Accounts.get(depositor).set(2,((Double)Accounts.get(depositor).get(2)-amount));
			Accounts.get(payee).set(2,(Double)Accounts.get(payee).get(2)+amount);
			JOptionPane.showMessageDialog(null,"Transfer Successfull");
		}
		else {
			JOptionPane.showMessageDialog(null, "Insufficient Balance");
		}
	}
}

}
