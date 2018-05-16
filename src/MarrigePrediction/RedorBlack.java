package MarrigePrediction;

public class RedorBlack {

	public static int RedOrBlack(Card c) {

		if (c.color.equals("Spade")) {

			System.out.println("1");
			return 0;

		}

		else if (c.color.equals("Clover")) {

			System.out.println("2");
			return 0;

		}

		else if (c.color.equals("Hearts")) {

			System.out.println("3");
			return 1;

		}

		else if (c.color.equals("Dimonds")) {

			System.out.println("4");
			return 1;

		}

		else {

			return 42;
		}

	}

}
