package caeser;
import java.util.Scanner;

public class CipherTest {
	public static void main(String[] args) {
		Cipher c1 = new Cipher();
		Scanner keyboard = new Scanner(System.in);
		int decision;
		String word;
		int shiftamount;
		
		System.out.println("Would you like to encode a message or decode?");
		System.out.print("Enter 1 for encode and 2 for decode: ");
		decision = keyboard.nextInt();
		
		System.out.print("Enter the word or phrase: ");
		keyboard.nextLine();
		word = keyboard.nextLine();
		
		System.out.print("Enter the shift amount (i.e. 1): ");
		shiftamount = keyboard.nextInt();
		
		if (decision == 1) {
			c1.setInput(word);
			c1.setShift(shiftamount);
			c1.encode();
		}
		else {
			c1.setInput(word);
			c1.setShift(shiftamount);
			c1.decode();
		}
	}
}
