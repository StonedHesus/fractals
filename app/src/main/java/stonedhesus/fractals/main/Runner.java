// The package of the current Java compilation unit.
package stonedhesus.fractals.main;
// Imports from existing Java libraries, classes and interfaces.

// Imports from custom libraries, classes and interfaces.
import javafx.application.Application;
import javafx.stage.Stage;
import stonedhesus.fractals.main.core.Fractals;

/**
 * @author Andrei-Paul Ionescu
 */
public final class Runner extends Application {
    //Static values of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public instance-side methods of the class.
    @Override
    public void start(Stage primaryStage) {
        var core = new Fractals();
        core.getStateMachine().render(primaryStage);

        primaryStage.setTitle("Fractals");
        primaryStage.setWidth(300);
        primaryStage.setWidth(400);
        primaryStage.show();
    }

    // Public class-side methods of the class.
    public static void main(String[] args) {launch(args);}
    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
