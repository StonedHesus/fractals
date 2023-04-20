// The package of the current Java compilation unit.
package stonedhesus.fractals.main.states.empty;
// Imports from existing Java libraries, classes and interfaces.

// Imports from custom libraries, classes and interfaces.
import javafx.stage.Stage;
import stonedhesus.fractals.main.states.model.State;
import stonedhesus.fractals.main.union.Union;

import java.util.HashMap;
import java.util.Optional;

/**
 * <p>
 *     This here compilation unit hosts the Empty {@link State} specialisation whose purpose it to define a generic
 *     state which has no apparent functionality, apart from serving as a placeholder for the current state in which
 *     the state machine finds itself in after instantiation.
 * </p>
 *
 * <p>
 *     In order to reduce unwanted instantiation of multiple Empty objects, the sole reference to such an object is
 *     maintained strictly within the bounds, and confines of this particular compilation unit. Hence, the Empty class
 *     is a direct implementation of the Singleton design pattern.
 * </p>
 *
 * @see State
 * @author Andrei-Paul Ionescu
 */
public final class Empty extends State {
    //Static values of the class.
    public static final Empty empty = new Empty();

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public instance-side methods of the class.
    @Override
    public void enter(Optional<HashMap<String, Union<String, Number>>> parameters) {}
    @Override
    public void exit() {}
    @Override
    public void update(float deltaTime) {}
    @Override
    public void render(Stage stage) {}

    // Public class-side methods of the class.

    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
