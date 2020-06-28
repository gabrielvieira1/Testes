package generateRandomMovies;

public class Test {
	
	public static void main(String[] args) {
		RandomCollection<String> rc = new RandomCollection<>();
//		rc.add(90, "dog").add(5, "cat").add(5, "horse");

		for (int i = 0; i < 10; i++) {	
			System.out.println(rc.next());
		}
	}
}
