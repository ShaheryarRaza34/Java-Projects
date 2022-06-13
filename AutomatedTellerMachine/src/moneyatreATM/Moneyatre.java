package moneyatreATM;

import java.util.HashMap;


import javax.swing.JOptionPane;


import java.util.*;

public class Moneyatre {
 static Map<String,Accounts> AccountsList = new HashMap<String,Accounts>();

public static void addAccount(String accountNumber,Accounts newAccount) {
	try {
	AccountsList.put(accountNumber,newAccount);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void printAccounts()
{
	System.out.println(AccountsList.toString());
}
public static void verify(String accountNumber,int Pincode) {
	if(AccountsList.containsKey(accountNumber)) {
		if(AccountsList.get(accountNumber).password==Pincode)
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

public static void withdraw(String accountNumber, double amount)
{
	
	if(AccountsList.get(accountNumber).getBalance()>=amount)
	{
		JOptionPane.showOptionDialog(null, 
		        "Is Amount Correct?", 
		        "Confirmation", 
		        JOptionPane.OK_OPTION, 
		        JOptionPane.INFORMATION_MESSAGE, 
		        null, 
		        new String[]{"Confirm", "Go Back"}, // this is the array
		        "default");
		AccountsList.get(accountNumber).setBalance(AccountsList.get(accountNumber).getBalance()-amount);
	}
	else {
		JOptionPane.showMessageDialog(null, "Insufficient Balance");
		
	}
}

public static boolean validateAccount(String accountNumber)
{
	return((AccountsList.containsKey(accountNumber))? true:false);
	
}
public static void transfer(String depositor,String payee, double amount)
{	if(validateAccount(depositor)==false||validateAccount(payee)==false)
		JOptionPane.showMessageDialog(null, "Invalid Account");
	else {
		if(AccountsList.get(depositor).getBalance()>=amount)
		{
			AccountsList.get(depositor).setBalance((AccountsList.get(depositor).getBalance()-amount));
			AccountsList.get(payee).setBalance((Double)AccountsList.get(payee).getBalance()+amount);
			JOptionPane.showMessageDialog(null,"Transfer Successfull");
		}
		else {
			JOptionPane.showMessageDialog(null, "Insufficient Balance");
		}
	}
}
public static String getAccountBalance(String accountNumber) {
	return String.format("%.2f",AccountsList.get(accountNumber).getBalance());
}
public static String getAccountTitle(String accountNumber) {
	return AccountsList.get(accountNumber).getName();
}
}
