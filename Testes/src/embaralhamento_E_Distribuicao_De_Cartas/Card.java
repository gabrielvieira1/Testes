package embaralhamento_E_Distribuicao_De_Cartas;

public class Card {
	
	private final String face; // face da carta ("Ace", "Deuce")
	private final String suit; // naipe da carta ("Heartes", "Diamonds", ...)
	
	// construtor de dois argumentos inicializa face e naipe da carta
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // inicializa face da carta
		this.suit = cardSuit; // inicializa naipe da carta
	}
	
	// retorna representação String de Card
	public String toString() {
		return face + " of " + suit;
	}
}

