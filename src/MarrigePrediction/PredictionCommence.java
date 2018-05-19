package MarrigePrediction;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PredictionCommence extends Application {

	public static final double P = 10;
	public static final double WIDTH = 90;
	public static final double HEIGHT = 150;
	int k = 0;
	int y = 0;
	int u = 0;
	int w = 1;

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
		String Diamond = D.next();
		System.out.println("Click in window to play");
		Group root = new Group();

		Future deck = new Future();
		deck.shuffle();

		Kings royaldeck = new Kings();

		Scene scene = new Scene(root, WIDTH * 16, HEIGHT * 5, Color.SKYBLUE);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Marrige predictor");
		primaryStage.show();

		Group pc = new Group();
		root.getChildren().add(pc);

		for (int i = 0; i < 4; i++) {
			KingsCards royalcard = royaldeck.royaldraw();
			royalcard.setTranslateX(i * 2 * WIDTH + WIDTH);
			royalcard.setTranslateY(P);

			pc.getChildren().add(royalcard);

			primaryStage.setScene(scene);
			primaryStage.show();

		}

		scene.setOnMouseClicked(event -> {

			if (event.getButton() == MouseButton.PRIMARY) {

				if (w == 1) {

					int c = 1;
					int jh = 0;
					int ch = 0;
					int k = 0;

					for (int i = 0; i < 42; i = +i) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT + HEIGHT + P);

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

					for (int i1 = 0; i1 <= 42; i1 = +i1) {

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT - HEIGHT + P);

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
					k = 1;
					int jd = 0;
					int cd = 0;

					for (int i = 0; i < 42; i = +i) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT + HEIGHT + P);

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

					for (int i1 = 0; i1 <= 42; i1 = +i1) {

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT - HEIGHT + P);

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

						System.out.println("Diamond has a job and wants" + " " + cd + " " + "children");

					}

					else {

						System.out.println("Diamond don't have a job and wants" + " " + cd + " " + "children");

					}

					c = 1;
					k = 2;
					int js = 0;
					int cs = 0;

					for (int i = 0; i < 42; i = +0) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT + HEIGHT);

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

					for (int i1 = 0; i1 <= 42; i1++) {

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT - HEIGHT);

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
					k = 3;
					int jc = 0;
					int cc = 0;

					for (int i = 0; i < 42; i = +0) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT + HEIGHT);

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

					for (int i1 = 0; i1 <= 42; i1++) {

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(k * 2 * WIDTH + WIDTH);
						card.setTranslateY(c * HEIGHT - HEIGHT);

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

					w++;

					System.out.println("Click in window to choice your partner");

				}

				else if (w == 2) {

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

							System.out.println(Diamond);

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

					System.out.println("Click in window to clear the board");

					w++;

				}

				else if (w == 3) {

					pc.getChildren().clear();

					System.out.println("Click in window to move on to invíting guests");

					w++;
				}

				else if (w == 4) {

					if (u == 0) {

						System.out.println("After you enter a guest's name click in the window ");
						System.out.println("You invite first of three guests for you ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH + WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					} else if (u == 1) {

						System.out.println("You invite second of three guests for you ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH + WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					}

					else if (u == 2) {

						System.out.println("You invite third of three guests for you ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH + WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						y++;

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;
							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					}

					if (u == 3) {
						System.out.println("You invite first of three guests for them ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					}

					if (u == 4) {
						System.out.println("You invite second of three guests for them ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					}

					if (u == 5) {
						System.out.println("You invite third of three guests for them ");

						Scanner g = new Scanner(System.in);

						String G = g.next();

						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(y * 2 * WIDTH);
						card.setTranslateY(4 * HEIGHT);

						y++;

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println(G + " " + "is comming ");

						} else {

							u++;

							System.out.println(G + " " + "is not comming ");

						}

					}

					if (u == 6) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(2 * WIDTH);
						card.setTranslateY(3 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("Your mother is comming ");

						} else {

							u++;

							System.out.println("Your mother is not comming ");

						}

					}

					if (u == 7) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(4 * WIDTH);
						card.setTranslateY(3 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("Your father is comming ");

						} else {

							u++;

							System.out.println("Your father is not comming ");

						}

					}

					if (u == 8) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(11 * WIDTH);
						card.setTranslateY(3 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("Their mother is comming ");

						} else {

							u++;

							System.out.println("Their mother is not comming ");

						}

					}

					if (u == 9) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(13 * WIDTH);
						card.setTranslateY(3 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("Their father is comming ");

						} else {

							u++;

							System.out.println("Their father is not comming ");

						}

					}

					if (u == 10) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(3 * WIDTH);
						card.setTranslateY(2 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("You are comming ");

						} else {

							u++;

							System.out.println("You are not comming ");

						}

					}

					if (u == 11) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(12 * WIDTH);
						card.setTranslateY(2 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("They are comming ");

						} else {

							u++;

							System.out.println("They are not comming ");

						}

					}

					if (u == 12) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(WIDTH * 7.5);
						card.setTranslateY(1 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("The priest is comming ");

						} else {

							u++;

							System.out.println("The priest is not comming ");

						}

					}

					if (u == 13) {
						Card card = deck.draw();
						pc.getChildren().add(card);
						card.setTranslateX(WIDTH * 7.5);
						card.setTranslateY(0 * HEIGHT);

						primaryStage.setScene(scene);
						primaryStage.show();

						if (RedorBlack.RedOrBlack(card) == 1) {

							u++;

							System.out.println("You get married ");
							w++;

						} else {

							u++;

							System.out.println("You don't get married ");
							w++;
						}

					}

				}
			}

		});

	}
}