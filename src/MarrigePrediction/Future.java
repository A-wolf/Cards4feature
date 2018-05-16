package MarrigePrediction;

import java.util.ArrayList;
import java.util.Collections;

public class Future {

	private ArrayList<Card> Future = new ArrayList<Card>();

	public Future() {

		for (int a = 1; a < 5; a++) {

			for (int b = 1; b < 14; b++) {

				Card c = new Card(a, b);
				Future.add(c);

			}

		}

	}

	public void shuffle() {

		Collections.shuffle(Future);

	}

	public Card draw() {

		Card card = Future.get(0);

		Future.remove(0);

		return card;

	}

}
