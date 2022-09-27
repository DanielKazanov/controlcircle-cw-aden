import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class CirclePane.
 */
public class CirclePane extends StackPane {
   private Circle circle = new Circle(50);
   private ControlCircle gui;
   
   /**
    * Instantiates a new circle pane.
    */
   public CirclePane() {
	   getChildren().add(circle);
	   circle.setStroke(Color.BLACK);
	   circle.setFill(Color.WHITE);
	   
   }
   
   /**
    * Enlarge the circle by 2 units
    */
   public void enlarge() {
	   // increase the radius, but think about what error checking you might need
	   // TODO #1a: Write this method
   }
   
   /**
    * Shrink the circle by 2 units.
    */
   public void shrink() {
	   // decrease the radius, but think about what error checking you might need
	   // TODO #1b: Write this method...
	   
   }
}
