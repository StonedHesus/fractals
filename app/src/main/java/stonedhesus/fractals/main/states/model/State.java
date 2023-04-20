// The package of the current Java compilation unit.
package stonedhesus.fractals.main.states.model;
// Imports from existing Java libraries, classes and interfaces.

// Imports from custom libraries, classes and interfaces.

import javafx.stage.Stage;
import stonedhesus.fractals.main.union.Union;

import java.util.HashMap;
import java.util.Optional;

/**
 * <p>
 *     This here compilation unit hosts the abstract class {@link State}; whose purpose is to serve as the parent for
 *     the State class hierarchy.
 * </p>
 *
 * <p>
 *     A state object within the context of this software application, is directly equivalent to a state within the
 *     underlying DFA which abstractly contours the application.
 * </p>
 *
 * <p>
 *     Several actions can be taken by a State object, these include:
 *     <ul>
 *         <li>Entering the state;</li>
 *         <li>Exiting the state;</li>
 *         <li>Updating the state;</li>
 *         <li>Rendering the state.</li>
 *     </ul>
 * </p>
 *
 * @see stonedhesus.fractals.main.states.landing_page.LandingPage
 * @see stonedhesus.fractals.main.states.empty.Empty
 * @author Andrei-Paul Ionescu
 */
public abstract class State {
    //Static values of the class.

    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public instance-side methods of the class.

    /**
     * <p>
     *     This here routine is called upon transitioning within a new state, its purpose is to initialize the state,
     *     in accordance to predefine behaviour, and to set up the state's environment, based on the provided parameters,
     *     if any.
     * </p>
     * @param parameters {@link Optional}<{@link HashMap}<{@link String}, {@link Union}<{@link String}, {@link Number}>>>} - A dictionary object containing a set of parameters.
     */
    public abstract void enter(Optional<HashMap<String, Union<String, Number>>> parameters);
    public abstract void exit();
    public abstract void update(float deltaTime);
    public abstract void render(Stage stage);
    // Public class-side methods of the class.

    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
