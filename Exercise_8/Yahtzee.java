package Exercise_8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class Yahtzee extends Application {
    private int count = 3;

    public void start(Stage primaryStage) throws FileNotFoundException {
        Image[] images = new Image[5];
        FileInputStream dice1 = new FileInputStream("C:\\Users\\Enida A\\Pictures\\YahtzeeDice1.PNG");
        FileInputStream dice2 = new FileInputStream("C:\\Users\\Enida A\\Pictures\\YahtzeeDice2.PNG");
        FileInputStream dice3 = new FileInputStream("C:\\Users\\Enida A\\Pictures\\YahtzeeDice3.PNG");
        FileInputStream dice4 = new FileInputStream("C:\\Users\\Enida A\\Pictures\\YahtzeeDice4.PNG");
        FileInputStream dice5 = new FileInputStream("C:\\Users\\Enida A\\Pictures\\YahtzeeDice5.PNG");
        images[0] = new Image(dice1);
        images[1] = new Image(dice2);
        images[2] = new Image(dice3);
        images[3] = new Image(dice4);
        images[4] = new Image(dice5);

        HBox pane1 = new HBox(10);
        for (int i = 0; i <5 ; i++) {
            pane1.getChildren().add(i, new ImageView(images[i]));
        }

        primaryStage.setTitle("Yahtzee");
        GridPane pane = new GridPane();

        Button rollDice = new Button("Roll the dice!");

        HBox pane2 = new HBox(10);
        pane2.setPadding(new Insets(10));
        CheckBox ch1 = new CheckBox();
        CheckBox ch2 = new CheckBox();
        CheckBox ch3 = new CheckBox();
        CheckBox ch4 = new CheckBox();
        CheckBox ch5 = new CheckBox();
        pane2.getChildren().addAll(ch1, ch2, ch3, ch4
                , ch5);
        pane2.setSpacing(100);
        pane2.setDisable(true);

        HBox pane3 = new HBox();
        pane3.getChildren().add(rollDice);
        Text YahText = new Text();
        YahText.setFont(Font.font(40));
        YahText.setText("Yahtzee");
        pane.add(YahText, 0, 0);
        pane.add(pane1, 1, 1);
        pane.add(pane2, 1, 2);
        pane.add(pane3, 1, 3);
        Text rollsText = new Text();
        pane3.getChildren().add(rollsText);
        rollsText.setText("     You have 3 rolls left.");
        Group group = new Group();
        group.getChildren().add(pane);
        Scene scene = new Scene(group);
        primaryStage.setWidth(830);
        primaryStage.setHeight(300);
        primaryStage.setScene(scene);
        primaryStage.show();
        int[] arr = new int[5]; // create array to store value of dices
        Random rand = new Random();
        rollDice.setOnAction(e -> {
            pane2.setDisable(false);
            if (count > 0) {
                if (!ch1.isSelected()) {
                    int randNum = rand.nextInt(5);
                    pane1.getChildren().remove(0);
                    pane1.getChildren().add(0, new ImageView(images[randNum]));
                    arr[0] = randNum + 1; // we store the value right away, because randNum changes
                }// everytime we press the button
                if (!ch2.isSelected()) {
                    int randNum = rand.nextInt(5);
                    pane1.getChildren().remove(1);
                    pane1.getChildren().add(1, new ImageView(images[randNum]));
                    arr[1] = randNum + 1; // we have to have randNum +1 because the value
                } // of the dice is one greater than the position in the imageArray
                if (!ch3.isSelected()) {
                    int randNum = rand.nextInt(5);
                    pane1.getChildren().remove(2);
                    pane1.getChildren().add(2, new ImageView(images[randNum]));
                    arr[2] = randNum + 1;
                }
                if (!ch4.isSelected()) {
                    int randNum = rand.nextInt(5);
                    pane1.getChildren().remove(3);
                    pane1.getChildren().add(3, new ImageView(images[randNum]));
                    arr[3] = randNum + 1;
                }
                if (!ch5.isSelected()) {
                    int randNum = rand.nextInt(5);
                    pane1.getChildren().remove(4);
                    pane1.getChildren().add(4, new ImageView(images[randNum]));
                    arr[4] = randNum + 1;
                }
                rollsText.setText("You have " + --count + " rolls left");

                if (count == 0) { // when we have zero throws left, we calc and show the result
                        rollsText.setText(calcOther(arr));
                }
            }
        });
    }

        public String calcOther(int[] resultDices){
        int ones = 0,twos = 0,threes = 0,fours = 0,fives = 0;
            for (int i = 0; i < resultDices.length ; i++) {
                if(resultDices[i] == 1){
                    ones++;
                } else if (resultDices[i] == 2){
                    twos++;
                } else if (resultDices[i] == 3){
                    threes++;
                } else if (resultDices[i] == 4){
                    fours++;
                } else if (resultDices[i] == 5){
                    fives++;
                }
            }
            boolean threeOfAKind = (ones==3||twos==3||threes==3||fours==3||fives==3);
            boolean twoOfAKind = (ones==2||twos==2||threes==2||fours==2||fives==2);
            // i did booleans of these so i didn't have to write so much
            if(resultDices[0] == resultDices[1] &&
                    resultDices[1] == resultDices[2] &&
                    resultDices[2] == resultDices[3] &&
                    resultDices[3] == resultDices[4] &&
                    resultDices[4] == resultDices[5]){
                return "You got Yahtzee!!";
            } else if(ones == 4 || twos == 4 || threes == 4 || fours==4||fives==4){
                return "You got four of a kind!";
            } else if ((threeOfAKind) && (twoOfAKind)){
                return "You got a full house!";
            } else if(threeOfAKind) {
                return "You got three of a kind";
            } else if(twos==1&&threes==1&&fours==1&&fives==1){
                return "You got a large straight!";
            } else if(ones==1 && twos==1 && threes== 1 && fours== 1 && fives== 1){
                return "You got a small straight!";
            } else if(twoOfAKind){
                return "You got pairs!";
            } else return "You got nothing, try again!";
        }

    public static void main(String[] args) {
        launch(args);
    }
}
