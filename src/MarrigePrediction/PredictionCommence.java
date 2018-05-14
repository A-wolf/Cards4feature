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

	public static void main(String[] args) {

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

		launch();

		// stopping leaking keep at bottom //
		S.close();
		C.close();
		H.close();
		D.close();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		// Future deck = new Future();
		// deck.shuffle();

		Kings deck = new Kings();
		deck.royalshuffle();

		Scene scene = new Scene(root, WIDTH * 16, HEIGHT * 4.66, Color.SKYBLUE);

		scene.setOnMouseClicked(event -> {

			if (event.getButton() == MouseButton.PRIMARY) {

				root.getChildren().add(deck.royaldraw());

				// root.getChildren().add(deck.draw());
			}

		});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}