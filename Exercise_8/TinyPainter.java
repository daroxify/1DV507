package Exercise_8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;


public class TinyPainter extends Application {
    public void start(Stage primaryStage) {
        HBox layout = new HBox();
        layout.setPadding(new Insets(10, 10, 10, 10));

        ComboBox<String> line = new ComboBox();
        ComboBox<Integer> size = new ComboBox();
        ComboBox color = new ComboBox();
        Canvas canvas = new Canvas(780, 780);

        line.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
        size.getItems().addAll(1, 5, 10, 15, 20, 30, 40);
        ColorPicker colPick = new ColorPicker();
        color.getItems().add(colPick);
        line.setPromptText("Shapes");
        size.setPromptText("Size");
        color.setPromptText("Color");
        size.setPrefWidth(200);
        line.setPrefWidth(200);
        color.setPrefWidth(200);
        GraphicsContext GC = canvas.getGraphicsContext2D();
        GC.setLineWidth(1);
        layout.getChildren().addAll(line, size, color, canvas);
        GridPane pane = new GridPane();
        pane.add(color, 0, 0 );
        pane.add(line, 1, 0);
        pane.add(size, 2, 0);
        pane.add(canvas, 0, 1, 3, 3 );
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setTitle("TinyPainter");
        primaryStage.setScene(scene);
        primaryStage.show();

        Line line1 = new Line();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        size.setValue(5); // we set the size before so we don't get wierd lines that start from upper left corner
        try {
            canvas.setOnMousePressed(e -> {
                if (line.getValue().equals("Line")) { // line works
                    //Color c = (Color) color.getValue();
                    GC.setStroke(colPick.getValue());// colorPick works
                    GC.setLineWidth(size.getValue());
                    line1.setStartX(e.getX());
                    line1.setStartY(e.getY());
                    //GC.beginPath();
                    //layout.getChildren().add(line1);
                } else if (line.getValue().equals("Dot")) { // dot works
                    GC.setStroke(colPick.getValue()); // colorPick works
                    GC.setLineWidth(size.getValue());
                    GC.beginPath();
                } else if (line.getValue().equals("Circle")) {
                    GC.setStroke(colPick.getValue()); // colorPick works, URL http://java-buddy.blogspot.com/2013/04/free-draw-on-canvas-with-colorpicker.html
                    GC.setFill(colPick.getValue()); // can change color - fixed
                    circle.setCenterX(e.getX());
                    circle.setCenterY(e.getY());
                    circle.setRadius(0);
                    layout.getChildren().add(circle);
                } else if (line.getValue().equals("Rectangle")) {
                    GC.setFill(colPick.getValue()); // colorPicker works
                    rectangle.setX(e.getX());
                    rectangle.setY(e.getY());
                }
            });
        } catch (NullPointerException e) {
            System.out.println("pick sum");
        }
        try{
            canvas.setOnMouseDragged(e -> {
                if (line.getValue().equals("Circle")) { // circle works
                    circle.setRadius(Math.sqrt(Math.pow(e.getX() - circle.getCenterX(), 2) + (Math.pow(e.getY() - circle.getCenterY(), 2))));
                    //GC.fillOval(circle.getCenterX(), circle.getCenterY(), circle.getRadius(), circle.getRadius()); // is this right??
                    //GC.fillOval(e.getX()-circle.getRadius(),e.getY()-circle.getRadius(),circle.getRadius()*2,circle.getRadius()*2);
                    //GC.strokeOval(e.getX()-circle.getRadius(),e.getY()-circle.getRadius(),circle.getRadius(),circle.getRadius());
                } else if (line.getValue().equals("Rectangle")) { // rectangle works
                    rectangle.setWidth(Math.sqrt(Math.pow(e.getX() - rectangle.getX(), 2)));
                    rectangle.setHeight(Math.sqrt(Math.pow(e.getY() - rectangle.getY(), 2)));
                    GC.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
                } else if (line.getValue().equals("Line")) { // line works
                    GC.stroke();
                }
                });
        } catch (NullPointerException e){
            System.out.println("pick something");
        }
        try {
            canvas.setOnMouseReleased(e -> {
                if (line.getValue().equals("Dot")) { // dot works
                    GC.lineTo(e.getX(), e.getY());
                    GC.stroke();
                } else if(line.getValue().equals("Circle")){
                    GC.fillOval(circle.getCenterX() - circle.getRadius(), circle.getCenterY()-circle.getRadius(), circle.getRadius()*2,circle.getRadius()*2);
                } else if (line.getValue().equals("Line")){
                    line1.setEndX(e.getX());
                    line1.setEndY(e.getY());
                    GC.strokeLine(line1.getStartX(),line1.getStartY(),line1.getEndX(),line1.getEndY());
                    //GC.closePath();
                }
            });
        } catch (NullPointerException e){ // how to catch exception???
            System.out.println("pick sum");
        }
    }
        public static void main(String[] args) {
            launch(args);
        }
    }
