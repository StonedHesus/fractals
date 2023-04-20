// The package of the current Java compilation unit.
package stonedhesus.fractals.main.states.landing_page;
// Imports from existing Java libraries, classes and interfaces.
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Optional;
// Imports from custom libraries, classes and interfaces.
import stonedhesus.fractals.main.states.model.State;
import stonedhesus.fractals.main.union.Union;

/**
 * @author Andrei-Paul Ionescu
 */
public final class LandingPage extends State {
   //Static values of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public instance-side methods of the class.
    @Override
    public void enter(Optional<HashMap<String, Union<String, Number>>> parameters){

    }

    @Override
    public void exit() {

    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(Stage stage) {
        var pane = new Pane();
        pane.getChildren().add(new Circle(100, 100, 50, Color.RED));
        var scene = new Scene(pane, 720, 512);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
    }

    // Public class-side methods of the class.

    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
