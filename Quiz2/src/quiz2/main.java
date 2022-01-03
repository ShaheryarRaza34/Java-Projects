package quiz2;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Cipher first = new Cipher();
		Scanner abc = new Scanner(System.in);
		System.out.print("Enter message to Encrypt: ");
		String message= abc.next();
		System.out.println();
		System.out.print("Enter KEY: ");
		int key = abc.nextInt();
		first.setKey(key);
		System.out.println("Encrypted: "+ first.encrypt(message, key));
	}

}
