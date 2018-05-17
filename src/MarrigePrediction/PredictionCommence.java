package MarrigePrediction;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PredictionCommence extends Application {

	public static final double WIDTH = 75;
	public static final double HEIGHT = 150;
	int k = 0;

	public static void main(String[] args) {

		launch();

	}

	@SuppressWarnings({ "unused", "resource" })
	@Override
	public void start(Stage primaryStage) throws Exception {

		System.out.println("Enter 4 names of the possible marraige canidents");

		Scanner S = new Scanner(System.in);

		String Spade = S.next();

		Scanner C = new Scanner(System.in);

		String Clover = C.next();

		Scanner H = new Scanner(System.in);

		String Hearts = H.next();

		Scanner D = new Scanner(System.in);

		String Dimonds = D.next();

		// debugging //
		System.out.println(Clover + " " + Hearts + " " + Dimonds + " " + Spade);

		System.out.println();

		Group root = new Group();

		Future deck = new Future();
		deck.shuffle();

		Kings royaldeck = new Kings();

		Scene scene = new Scene(root, WIDTH * 16, HEIGHT * 4.66, Color.SKYBLUE);

		for (int i = 0; i < 4; i++) {
			KingsCards royalcard = royaldeck.royaldraw();
			royalcard.setTranslateX(i * 150 + 75);

			root.getChildren().add(royalcard);

			primaryStage.setScene(scene);
			primaryStage.show();

		}

		scene.setOnMouseClicked(event -> {

			if (event.getButton() == MouseButton.PRIMARY) {

				int c = 1;
				int jh = 0;
				int ch = 0;
				int k = 1;

				for (int i = 0; i < 12; i = +i) {
					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 + 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						jh = 1;

						c++;

						break;

					} else {

						jh = 0;

						c++;

						break;

					}
				}

				for (int i1 = 0; i1 <= 99; i1 = +i1) {

					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 - 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						ch++;

						c++;

					}

					else {

						i1 = 100;

						break;

					}

				}
				if (jh == 1) {

					System.out.println("Hearts has a job and wants" + " " + ch + " " + "children");

				}

				else {

					System.out.println("Hearts don't have a job and wants" + " " + ch + " " + "children");

				}

				c = 1;
				k = 2;
				int jd = 0;
				int cd = 0;

				for (int i = 0; i < 12; i = +i) {
					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 + 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						jd = 1;

						c++;

						break;

					} else {

						jd = 0;

						c++;

						break;

					}
				}

				for (int i1 = 0; i1 <= 99; i1 = +i1) {

					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 - 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						cd++;

						c++;

					}

					else {

						i1 = 100;

						break;

					}

				}
				if (jd == 1) {

					System.out.println("Dimonds has a job and wants" + " " + cd + " " + "children");

				}

				else {

					System.out.println("Dimonds don't have a job and wants" + " " + cd + " " + "children");

				}

				c = 1;
				k = 3;
				int js = 0;
				int cs = 0;

				for (int i = 0; i < 12; i = +0) {
					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 + 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						js = 1;

						c++;

						break;

					} else {

						js = 0;

						c++;

						break;

					}
				}

				for (int i1 = 0; i1 <= 99; i1++) {

					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 - 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						cs++;

						c++;

					}

					else {

						i1 = 100;

						break;

					}

				}
				if (js == 1) {

					System.out.println("Spades has a job and wants" + " " + cs + " " + "children");

				}

				else {

					System.out.println("Spades don't have a job and wants" + " " + cs + " " + "children");

				}

				c = 1;
				k = 4;
				int jc = 0;
				int cc = 0;

				for (int i = 0; i < 12; i = +0) {
					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 + 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						jc = 1;

						c++;

						break;

					} else {

						jc = 0;

						c++;

						break;

					}
				}

				for (int i1 = 0; i1 <= 99; i1++) {

					Card card = deck.draw();
					root.getChildren().add(card);
					card.setTranslateX(k * 150 - 75);
					card.setTranslateY(c * 150 - 150);

					if (RedorBlack.RedOrBlack(card) == 1) {

						cc++;

						c++;

					}

					else {

						i1 = 100;

						break;

					}

				}
				if (jc == 1) {

					System.out.println("Clover has a job and wants" + " " + cc + " " + "children");
				}

				else {

					System.out.println("Clover don't have a job and wants" + " " + cc + " " + "children");
				}

				primaryStage.setScene(scene);
				primaryStage.show();

				for (int i = 0; i < 42; i = +i) {

					System.out.println(
							"Enter H pick to hearts, D to pick Dimonds, S to pick spades and C to pick clover ");

					Scanner P = new Scanner(System.in);

					String Pick = P.next();

					switch (Pick) {
					case "H":

						System.out.println(Hearts);

						i = 42;

						break;

					case "D":

						System.out.println(Dimonds);

						i = 42;

						break;

					case "S":

						System.out.println(Spade);

						i = 42;

						break;

					case "C":

						System.out.println(Clover);

						i = 42;

						break;

					default:

						i = 0;

						break;
					}
				}
			}
			;

		});

	}
}