package MarrigePrediction;

public class RedorBlack {

	public static int RedOrBlack() {

		if (Card.color.equals("Spade") == true) {

			System.out.println("1");
			return 0;

		}

		else if (Card.color.equals("Clover") == true) {

			System.out.println("2");
			return 0;

		}

		else if (Card.color.equals("Hearts") == true) {

			System.out.println("3");
			return 1;

		}

		else if (Card.color.equals("Dimonds") == true) {

			System.out.println("4");
			return 1;

		}

		else {

			return 42;
		}

	}

}
