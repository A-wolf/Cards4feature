package MarrigePrediction;

public class RedorBlack {

	public static int RedOrBlack(Card c) {

		if (c.color.equals("Spade")) {
			return 0;

		}

		else if (c.color.equals("Clover")) {
			return 0;

		}

		else if (c.color.equals("Hearts")) {
			return 1;

		}

		else if (c.color.equals("Dimonds")) {
			return 1;

		}

		else {

			return 42;
		}

	}

}
