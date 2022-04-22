package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class Main extends Application {
	
	@Override
	public void start (Stage s) {
		//main
		Deck d =new Deck();
		House h=new House();
		//Card c=new Card();
//		
		//background color
		BackgroundFill background_fill = new BackgroundFill(Color.DARKOLIVEGREEN, CornerRadii.EMPTY, Insets.EMPTY);
		Background background = new Background(background_fill);
		//
		
		//fonts
		Font font = Font.font("Courier New", FontWeight.BOLD, 36);
		Font buttonf = Font.font("Courier New", FontWeight.BOLD, 20);
		//
		
		//The play scene
		
		Pane secondp = new Pane();
		secondp.setBackground(background);
		
		
		
		Image backofcard = new Image("backofcard.png");
		ImageView backcard= new ImageView(backofcard);
		ImageView backcard2= new ImageView(backofcard);
		backcard.setFitHeight(150); 
		backcard.setFitWidth(150);
		backcard2.setFitHeight(150); 
		backcard2.setFitWidth(150);
		
		Text playercount =new Text(220,30,"Player total:");
		playercount.setFont(Font.font ("Times New Roman ", 15));
		playercount.setFill(Color.RED);
		playercount.setLayoutX(0);
		secondp.getChildren().add(playercount);
		
		Text Housecount =new Text(220,250,"House total:");
		Housecount.setFont(Font.font ("Times New Roman ", 15));
		Housecount.setFill(Color.RED);
		secondp.getChildren().add(Housecount);
		
		Button playerscard=new Button("player", backcard);
		playerscard.setLayoutX(0);
		playerscard.setLayoutY(200);
		secondp.getChildren().add(playerscard);

		Button Housescard=new Button("House", backcard2);
		playerscard.setLayoutX(0);
		playerscard.setLayoutY(200);
		secondp.getChildren().add(Housescard);
		
		Button stand= new Button("I'll Stand!");
		stand.setFont(buttonf);
		stand.setLayoutX(120);
		stand.setLayoutY(400);
		secondp.getChildren().add(stand);

		Button hit= new Button("Hit Me!");
		hit.setFont(buttonf);
		hit.setLayoutX(140);
		hit.setLayoutY(470);
		secondp.getChildren().add(hit);
		hit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				d.deal(h);
		      

			
			}
			});

		Scene seconds = new Scene(secondp, 400, 600);
		//
		
		//main scene
				Pane root = new Pane();
				root.setBackground(background);

				Image PLAYINGC = new Image("playing cards.png");
				ImageView PLAYINGCC = new ImageView(PLAYINGC);
				PLAYINGCC.setFitHeight(400); 
				PLAYINGCC.setFitWidth(400);
				PLAYINGCC.setLayoutX(30);
				PLAYINGCC.setLayoutY(50);
				root.getChildren().add(PLAYINGCC);
				
				Image image = new Image("playbutton.png");
				ImageView imageView = new ImageView(image);
				imageView.setFitHeight(50); 
				imageView.setFitWidth(50);
				
				Button btn = new Button("Play",imageView);
				btn.setFont(font);
				btn.setLayoutX(100);
				btn.setLayoutY(400);
				root.getChildren().add(btn);
				btn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
					s.setScene(seconds);
					}
					});
				
				
				Text t = new Text (100, 200, "Black Jack");
				t.setFont(Font.font ("Times New Roman ", 40));
				t.setFill(Color.RED);
				root.getChildren().add(t);
				
				Scene scene = new Scene(root, 400, 600);
				//
		
		//loser scene
		Pane loserp = new Pane();
		loserp.setBackground(background);

		
		Button playagain = new Button("Play Agian!");
		loserp.getChildren().add(playagain);
		playagain.setFont(buttonf);
		playagain.setLayoutX(120);
		playagain.setLayoutY(300);
		playagain.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			s.setScene(scene);
			}
			});

		
		loserp.setBackground(background);

		Text lost = new Text (70, 200, "Sorry, you lost");
		lost.setFont(Font.font ("Times New Roman ", 40));
		lost.setFill(Color.RED);
		
		loserp.getChildren().add(lost);
		Scene loser = new Scene(loserp, 400, 600);
		//
		
		
		
		
		//winner
		Pane winnerp = new Pane();
		winnerp.setBackground(background);
		
		Button playagainw = new Button("Play Agian!");
		playagainw.setFont(buttonf);
		playagainw.setLayoutX(120);
		playagainw.setLayoutY(300);
		winnerp.getChildren().add(playagainw);
		playagainw.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
		s.setScene(scene);
		}
		});
		
		Text win = new Text (100, 200, "You Win");
		win.setFont(Font.font ("Times New Roman ", 40));
		win.setFill(Color.RED);
		winnerp.getChildren().add(win);
		
		Scene winner = new Scene(winnerp, 400, 600);
		//

		
		
		s.setScene(scene);
		s.show();
	}
	public static void main(String[] args ) {
	launch(args);
	}
	}
