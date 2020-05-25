package Exercise_7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Group;



public class CompoundInterest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        primaryStage.setTitle("Compound Interest");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(45);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("Start Amount:"), 0, 1);
        final TextField startAmount = new TextField();
        pane.add(startAmount,1,1);
        pane.add(new Label("Interest:"),0, 2 );
        final TextField interest = new TextField();
        pane.add(interest,1,2);
        pane.add(new Label("Num of years:"),0,3);
        final TextField years = new TextField();
        pane.add(years,1,3);
        final Label result = new Label();
        pane.add(result, 1, 4);

        //final Text theText = new Text(10, 70, "Compound Interest");
        Label theText = new Label("Compound Interest");

        pane.add(theText, 0,0,3,1);
        Button calc = new Button("Calculate");
        pane.add(calc, 0,5);
        GridPane.setHalignment(calc, HPos.RIGHT);

        calc.setOnAction(e -> {
                    int startMoney = Integer.parseInt(startAmount.getText());
                    float rate = Integer.parseInt(interest.getText()); // we get a rate (%)
                    int totalYears = Integer.parseInt(years.getText());
                    int sum = (int) (startMoney * Math.pow(1+(rate/100), totalYears));
                    result.setText("In total that will be " + sum);
                });

        primaryStage.setScene(new Scene(pane, 450, 300));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
