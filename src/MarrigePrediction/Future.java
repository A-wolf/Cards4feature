package MarrigePrediction;

import java.util.ArrayList;
import java.util.Collections;

public class Future {

	private ArrayList<Card> Future = new ArrayList<Card>();

	public Future() {

		for (int j = 1; j < 5; j++) {

			for (int i = 1; i < 14; i++) {

				Card c = new Card(j, i);
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
