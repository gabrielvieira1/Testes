package geracaodeNumerosAleatorios;

import java.security.SecureRandom;
public class CrapsJogodeAzar {
	
	/*REGRAS: 
	Você lança dois dados. Cada dado tem seis faces que contêm um, dois, três, quatro, cinco e seis pontos,
	respectivamente. Depois que os dados param de rolar, a soma dos pontos nas faces viradas para cima é calculada.
	Se a soma for 7 ou 11 no primeiro lance, você ganha. Se a soma for 2, 3 ou 12 no primeiro lance (chamado
	“craps”), você perde (isto é, a “casa” ganha). Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lance, essa soma torna-
	-se sua “pontuação”. Para ganhar, você deve continuar a rolar os dados até “fazer sua pontuação” (isto é, obter
	um valor igual à sua pontuação). Você perde se obtiver um 7 antes de fazer sua pontuação.
	*/
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOST };
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}
		
		if(gameStatus == Status.WON)
		System.out.println("Player wins");
		else
		System.out.println("Player loses");
	}
	
	public static int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}

}
