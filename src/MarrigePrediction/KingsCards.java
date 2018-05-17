package MarrigePrediction;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class KingsCards extends Group {

	String color;

	int value;

	public static final double WIDTH = 90;

	public static final double HEIGHT = 150;

	public KingsCards(int a, int b) {

		switch (a) {

		case 1:
			color = "Hearts";
			break;

		case 2:
			color = "Spade";
			break;

		case 3:
			color = "Clover";
			break;

		case 4:
			color = "Diamond";
			break;
		}

		if (b >= 1 && b <= 4) {

			value = b;

		}

		Text TheCardColor = new Text();
		TheCardColor.setText(color);

		Text TheCardValue = new Text();
		switch (value) {

		default:
			TheCardValue.setText("" + "King");
			break;

		}

		Rectangle background = new Rectangle(WIDTH, HEIGHT);
		background.setFill(Color.LIME);
		background.setStroke(Color.BLACK);
		background.setStrokeWidth(3);

		TheCardColor.setTranslateX(WIDTH / 2 - (WIDTH / 4));
		TheCardColor.setTranslateY(HEIGHT / 4);

		TheCardValue.setTranslateX(WIDTH / 2 - (WIDTH / 4));
		TheCardValue.setTranslateY(HEIGHT / 2);

		this.getChildren().addAll(background, TheCardColor, TheCardValue);
	}
}