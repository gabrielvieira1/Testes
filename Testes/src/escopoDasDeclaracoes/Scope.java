package escopoDasDeclaracoes;

public class Scope {
	private static int x = 1;

	public static void main(String[] args) {
		int x = 5;
		
		System.out.printf("locl x in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal x in main is %d%n", x);
	}
	
	public static void useLocalVariable() {
		int x = 25;
	
		System.out.printf("%nlocal x on enering method useLocalVariable is %d%n", x);
		++x;
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}
	
	public static void useField() {
		System.out.printf("%nfield x o entering method useField is %d%n", x);
		x *= 10;
		System.out.printf("field x before exiting method useField is %d%n", x);
	}
	

}
