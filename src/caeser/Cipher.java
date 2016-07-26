package caeser;

public class Cipher {
	private char[] phrase;
	private int shift;

	public char[] getInput() {
		return phrase;
	}

	public void setInput(String input) {
		phrase = input.toCharArray();
		this.phrase = phrase;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public void encode() {
		for (char input : phrase) {
			int unicode = input;

			// if ( ! Character.isLetter(input) )
			// return input;

			unicode = unicode + shift;
			if (Character.isUpperCase(input) && unicode > 'Z' || Character.isLowerCase(input) && unicode > 'z') {
				unicode -= 26;
			}
			if (Character.isUpperCase(input) && unicode < 'A' || Character.isLowerCase(input) && unicode < 'a') {
				unicode += 26;
			}
			String actual_val = Character.toString((char) unicode);
			System.out.print(actual_val);
		}
	}

	public void decode() {
		shift = shift * -1;
		encode();
	}
}
