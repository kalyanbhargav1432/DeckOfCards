package deckofcards;

public class DeckOfCard {
	public static String[] name = new String[4];

	public static void main(String[] args) {
		String[] cardType = { "clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardNumber = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray = new String[52];
		int start = 0, end = 12, counter1ForNumbers = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardType[i] + " " + cardNumber[counter1ForNumbers];
				counter1ForNumbers++;
			}

			counter1ForNumbers = 0;
			start = end + 1;
			end += 13;
		}

		InputScanner.shuffleCardsDeck(cardsArray);
		System.out.println("-----------------------------------------");

		int counter2ForNumbers = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.println("enter player" + (i + 1) + "s name:");
			name[i] = InputScanner.inputString();
			for (int j = 0; j < 9; j++) {
				System.out.println(cardsArray[counter2ForNumbers] + " --");
				counter2ForNumbers++;
			}
			System.out.println();
		}
	}
}
