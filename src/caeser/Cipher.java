package caeser;

public class Cipher {
	char input;
	int shift;
	
	public void encode() {
		int unicode = input;

//		if ( ! Character.isLetter(input) )
//			return input;

		unicode = unicode + shift;
		if ( Character.isUpperCase(input)   && unicode > 'Z' 
			|| Character.isLowerCase(input) && unicode > 'z' ) {
			unicode -= 26;
		}
		if ( Character.isUpperCase(input)  && unicode < 'A' 
			|| Character.isLowerCase(input) && unicode < 'a' ) {
			unicode += 26;
		}
	}

	public void decode() {
		
	}
}
