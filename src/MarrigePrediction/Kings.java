package MarrigePrediction;

import java.util.ArrayList;
import java.util.Collections;

public class Kings {

	private ArrayList<KingsCards> Kings = new ArrayList<KingsCards>();

	public Kings() {

		for (int j = 1; j < 5; j++) {

			KingsCards c = new KingsCards(j, 13);
			Kings.add(c);

		}

	}

	public void royalshuffle() {

		Collections.shuffle(Kings);

	}

	public KingsCards royaldraw() {

		KingsCards card = Kings.get(0);

		Kings.remove(0);

		return card;

	}

}
