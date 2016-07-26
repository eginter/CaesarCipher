package caeser;

public class Cipher {
	private char[] phrase;
	private int shift;

	public char[] getInput() {
		return phrase;
	}

	public void setInput(String input) {
		this.phrase = input.toCharArray();

	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public void encode() {
		String actual_val;
		for (char input : phrase) {
			int unicode = input;
			unicode = unicode + shift;
			if (!Character.isLetter(input)) {
				System.out.print(input);
			} else {
				if (Character.isUpperCase(input) && unicode > 'Z' || Character.isLowerCase(input) && unicode > 'z') {
					unicode -= 26;
				}
				if (Character.isUpperCase(input) && unicode < 'A' || Character.isLowerCase(input) && unicode < 'a') {
					unicode += 26;
				}
				if (input == 32) { // if input equals unicode 32 ['\u0020']
									// which is whitespace,
					unicode = 32; // unicode == 32, or whitespace
				}
				// if (Character.isUpperCase(input) && unicode < 'A' ||
				// Character.isLowerCase(input) && unicode > 'Z' && unicode <
				// 'a' ||
				// Character.isLowerCase(input) && unicode > 'z' ) {
				// System.out.println("Sorry! Only letters are allowed to be
				// entered
				// into the Cipher! ");
				// break;
				// } // this didn't work :( Tried to handle punctuation
				actual_val = Character.toString((char) unicode);
				System.out.print(actual_val);
			}
		}
	}

	public void decode() {
		shift = shift * -1;
		encode();
	}
}
