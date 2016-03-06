package summator;

public class Main {

	public static void main(String[] args) {

		String testing;
		testing = Metodi.Cesar(args[0], Integer.parseInt(args[1]));
		System.out.println("'" + args[0] + "'" + " shifting to " + args[1] + " positions =");
		System.out.println(testing);
		
		//for (int i = 65; i < 123; i++) {
		//	System.out.println(((char) i) + " = " + i);
		//}
		
	}

}
