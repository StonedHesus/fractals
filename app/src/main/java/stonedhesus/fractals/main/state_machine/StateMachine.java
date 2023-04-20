// The package of the current Java compilation unit.
package stonedhesus.fractals.main.state_machine;
// Imports from existing Java libraries, classes and interfaces.
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;
// Imports from custom libraries, classes and interfaces.
import javafx.stage.Stage;
import stonedhesus.fractals.main.states.empty.Empty;
import stonedhesus.fractals.main.states.model.State;
import stonedhesus.fractals.main.union.Union;

/**
 * <p>
 *     This here compilation unit hosts the StateMachine class, whose role in the application is to aid in managing
 *     the states in which the application is currently in.
 * </p>
 *
 * <p>
 *     The state machine is in essence but a simple DFA, whose transitions are but user-defined interactions, within
 *     the software.
 * </p>
 *
 * @see State
 * @author Andrei-Paul Ionescu
 */
public final class StateMachine {
    //Static values of the class.

    // Fields/attributes of the class.
    //private final Dictionary<String, Function<String |Number, State>> states;
    private final Dictionary<String, Supplier<? extends State>> states;
    private State current;
    // Constructor(s) of the class.
    //Optional<Dictionary<String, Function>> states
    public StateMachine(Optional<Dictionary<String, Supplier<? extends State>>> states) {
        this.states = states.orElse(null);
        this.current = Empty.empty;
    }
    // Getters of the class.

    /**
     * <p>
     *     This here getter routine is a very atypical one, for it returns the type, in this case the class, of the
     *     current state.
     * </p>
     *
     * <p>
     *     This is mainly desired for the purpose of testings, as it allows us to check whether the state machine
     *     did in fac transition properly from one state to the other, or not.
     * </p>
     *
     * @return {Class<? extends State>} The class of the current state.
     */
    public Class<? extends State> getCurrentClass() {return this.current.getClass();}

    public State getStateElseNull(String stateName) {return (this.states.get(stateName) == null) ? null : this.states.get(stateName).get();}
    // Setters of the class.

    // Public instance-side methods of the class.

    /**
     * <p>
     *     This here routine is responsible for delegating the responsibility of updating the state of the currently active state of the state machine to
     *     the current state.
     * </p>
     * @param deltaTime {float} - The time elapsed since the last frame, expressed in seconds.
     */
    public void update(float deltaTime) {this.current.update(deltaTime);}

    /**
     * <p>
     *     This here routine is responsible for delegating the responsibility of rendering the state of the currently active state of the state machine to
     *     the current state.
     * </p>
     * @param stage {@link Stage} - A JavaFX Stage object, which is utilised so as to render the current state upon.
     */
    public void render(Stage stage) {this.current.render(stage);}

    /**
     * <p>
     *     This here routine is responsible for performing a transition from the current state, i.e. the one stored
     *     in the instance-field current, to the state provided as an argument.
     * </p>
     *
     * @throws IllegalArgumentException - If the state name provided does not exist in the states' dictionary.
     * @param stateName {String} - A string representing the name of the state to transition to. The name ought to exist with the states' dictionary.
     */
    public void change(String stateName, Optional<HashMap<String, Union<String, Number>>> parameters) {
        if(this.states.get(stateName) == null) {
            throw new IllegalArgumentException("The state name provided does not exist in the states' dictionary.");
        }
        this.current.exit();
        this.current = this.states.get(stateName).get();
        this.current.enter(parameters);
    }
    // Public class-side methods of the class.

    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
