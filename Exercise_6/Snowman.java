package Exercise_6;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Circle bigCircle = new Circle(400, 600, 100, Color.WHITE);
        Circle middleCircle = new Circle(400, 450, 75, Color.WHITE);
        Circle littleCircle = new Circle(400, 350, 50, Color.WHITE);
        Circle leftEye = new Circle(385, 340, 7, Color.BLACK);
        Circle rightEye = new Circle(415, 340, 7, Color.BLACK);
        Circle button1 = new Circle(400, 450, 10, Color.BLACK);
        Circle button2 = new Circle(400, 500, 10, Color.BLACK);
        Circle button3 = new Circle(400, 550, 10, Color.BLACK);
        Circle sun = new Circle(600, 150, 75, Color.YELLOW);
        Rectangle snow = new Rectangle(0, 680, 800, 150);
        CubicCurve mouth = new CubicCurve(385.0, 370.0,
                400.0, 385, 410, 372.0,
                415, 370); // i wanted to do a smiley mouth
        snow.setFill(Color.WHITE);
        root.getChildren().addAll(bigCircle, middleCircle, littleCircle, snow, leftEye, rightEye,
                mouth, button1, button2, button3, sun);
        Scene scene = new Scene(root, 800, 800, Color.DEEPSKYBLUE);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
