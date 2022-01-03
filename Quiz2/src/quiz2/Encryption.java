package quiz2;

public abstract class Encryption {
private int key;
public Encryption()
{}
public void setKey(int n)
{
	this.key=n;
}
public int getKey() {
	return key;
}
public String encrypt(String message, int key)
{ 
	String encrypted_message="";
	for(int i = 0; i< message.length();i++)
	{
		encrypted_message=encrypted_message+Character.toString(message.charAt(i)+key);
	}
	return encrypted_message;
	
}
public String decrypt(String message, int key)
{ 
	String decrypted_message="";
	for(int i = 0; i< message.length();i++)
	{
		decrypted_message=decrypted_message+Character.toString(message.charAt(i)-key);
	}
	return decrypted_message;
	
}
}

