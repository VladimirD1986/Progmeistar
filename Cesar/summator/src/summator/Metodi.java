package summator;

public class Metodi {
	public static String Cesar(String a, int b){
		String shifr;
		shifr = "";
		
		for (int i = 0; i < a.length(); i++){
			shifr = shifr + Shifting(a.charAt(i), b);
		}
		return shifr;
	}
	
	public static char Shifting(char a, int b){
		int number;
		char character;

		number = (int) a;
		character = a;

		for (int i = 1; i <= Math.abs(b); i++){
			if (b > 0) {
				if (number == 90) {
					number = 97;
				}
				else if (number == 122) {
					number = 65;
				}
				else {
					number++; 
				}
			}
			else {
				if (number == 97) {
					number = 90;
				}
				else if (number == 65) {
					number = 122;
				}
				else {
					number--; 
				}
			}
		}
		character = (char) number;	
		return character;
	}
}
