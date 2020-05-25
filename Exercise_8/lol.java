package Exercise_8;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Random;

    public class lol extends Application {

        private int performedRolls = 0;
        private int rollAmount = 3;
        private DiceImages diceImg = new DiceImages();

        private boolean checkRolls() {
            if (performedRolls < 4) {
                return true;
            } else {
                return false;
            }
        }

        private boolean rollsIsLeft() {
            if (rollAmount < 0) {
                return false;
            } else {
                return true;
            }
        }

        private int diceThrow() {
            Random roll = new Random();
            return roll.nextInt(6) + 1;
        }

        private String checkScore(ArrayList<Dice> dice) {
            String score = "";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                                score += "Three Of A Kind";
                            }
                        }
                    } else if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                                if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[j])) {
                                    score += "Four Of A Kind";
                                }
                            }
                        }
                    } else if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                                if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                                    if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                                        score += "Yahtzee";
                                    }
                                }
                            }
                        }
                    } else if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[0])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[1])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[2])) {
                                if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[3])) {
                                    score += "Small Straight";
                                }
                            }
                        }
                    } else if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[1])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[2])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[3])) {
                                if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                                    score += "Small Straight";
                                }
                            }
                        }
                    } else if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[0])) {
                        if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[1])) {
                            if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[2])) {
                                if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[3])) {
                                    if (dice.get(i).getDiceSide().equals(diceImg.getAllSides()[4])) {
                                        score += "Large Straight";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return score;
        }

        @Override
        public void start(Stage stage) throws Exception {

            Label heading = new Label("Yahtzee");
            heading.setFont(new Font("Comfortaa", 50));
            heading.setPadding(new Insets(10));


            Dice[] dice = new Dice[5];
            for (int i = 0; i < 5; i++) {
                dice[i] = new Dice(diceImg.getAllSides());
            }
            HBox diceBox = new HBox();
            diceBox.setPadding(new Insets(0,0,0,40));
            diceBox.setSpacing(20);
            for (int i = 0; i < 5; i++) {
                diceBox.getChildren().addAll(dice[i].getDiceSide());
            }

            CheckBox[] check = new CheckBox[5];
            for (int i = 0; i < 5; i++) {
                check[i] = new CheckBox();
            }
            HBox checkBoxes = new HBox();
            checkBoxes.setPadding(new Insets(3,0,0,67));
            checkBoxes.setSpacing(76);
            for (int i = 0; i < 5; i++) {
                checkBoxes.getChildren().addAll(check[i]);
            }
            for (int i = 0; i <5 ; i++) {
                check[i].setDisable(true);
            }

            Button button = new Button();
            button.setText("Roll the dice!");
            HBox buttonBox = new HBox();
            buttonBox.getChildren().addAll(button);
            buttonBox.setPadding(new Insets(10,0,0,10));

            for (int i = 0; i < 5; i++) {
                dice[i].setDiceSide(diceThrow());
            }

            ArrayList<Dice> resultCalc = new ArrayList<>();
            final Label finalScore = new Label();

            final Label rollsLeft = new Label();
            VBox rollText = new VBox();
            rollText.setPadding(new Insets(5,0,0,0));
            rollText.getChildren().addAll(rollsLeft);

            button.setOnAction(e -> {
                performedRolls++;
                //rollAmount--;
                //rollsLeft.setText("You have " + rollAmount + "left!");

                if(checkRolls()) {
                    check[0].setDisable(false);
                    check[1].setDisable(false);
                    check[2].setDisable(false);
                    check[3].setDisable(false);
                    check[4].setDisable(false);

                    for (int i = 0; i < 5; i++) {
                        if(!check[i].isSelected()){
                            dice[i].setDiceSide(diceThrow());
                        }
                        if(check[i].isSelected()){
                            resultCalc.add(dice[i]);
                        }
                    }
                    finalScore.setText(checkScore(resultCalc));
                }
                else {
                    if(check[0].isSelected() && check[1].isSelected() && check[2].isSelected() && check[3].isSelected() &&check[4].isSelected()) {
                        for (int i = 0; i < 5; i++) {
                            resultCalc.add(dice[i]);
                        }
                        finalScore.setText(checkScore(resultCalc));
                    }
                    button.setDisable(true);
                    finalScore.setText(checkScore(resultCalc));

                }
            });


            VBox layout = new VBox();
            layout.getChildren().addAll(heading,diceBox,checkBoxes,buttonBox,finalScore,rollText);

            VBox scoreText = new VBox();
            scoreText.setPadding(new Insets(5,0,0,60));
            scoreText.getChildren().addAll(finalScore);

            Scene scene = new Scene(layout,500,250);
            stage.setTitle("Yahtzee");
            stage.setScene(scene);
            stage.show();
        }

        class DiceImages {
            private Image diceS1 = new Image("images/1.png");
            private Image diceS2 = new Image("images/2.png");
            private Image diceS3 = new Image("images/3.png");
            private Image diceS4 = new Image("images/4.png");
            private Image diceS5 = new Image("images/5.png");
            private Image diceS6 = new Image("images/6.png");
            private Image[] allSides = new Image[6];

            public DiceImages(){
                allSides[0] = diceS1;
                allSides[1] = diceS2;
                allSides[2] = diceS3;
                allSides[3] = diceS4;
                allSides[4] = diceS5;
                allSides[5] = diceS6;
            }

            public Image[] getAllSides() {
                return allSides;
            }
        }

        class Dice {
            private ImageView diceSide;
            private Image[] allSides;
            private int sideValue;


            public Dice(Image[] allSides){
                this.allSides = allSides;
                diceSide = new ImageView(this.allSides[0]);
            }

            public Dice(Image[] allSides, int sideValue){
                this.allSides = allSides;
                diceSide = new ImageView(this.allSides[sideValue-1]);
            }

            public ImageView getDiceSide() {
                return diceSide;
            }

            public void setDiceSide(int sideValue) {
                diceSide.setImage(this.allSides[sideValue-1]);
            }
        }
    }
