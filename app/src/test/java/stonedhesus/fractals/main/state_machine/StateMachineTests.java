// The package of the current Java compilation unit.
package stonedhesus.fractals.main.state_machine;
// Imports from existing Java libraries, classes and interfaces.
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Imports from custom libraries, classes and interfaces.
import stonedhesus.fractals.main.states.landing_page.LandingPage;

/**
 * <p>
 *     This here compilation unit hosts a class whose purpose is to store a test suite for the StateMachine class.
 * </p>
 *
 * @see StateMachine
 * @author Andrei-Paul Ionescu
 */
public final class StateMachineTests {

    // Fields/attributes of the class.
    private final StateMachine stateMachine;

    // Instance-side initialisation block.
    {
        this.stateMachine = new StateMachine(
            Optional.of
                    (
                            new Hashtable<>() {{
                                put("landing-page", LandingPage::new);
                            }}
                    )
        );
    }

    /**
     * <p>
     *     This here test unit's purpose is to ensure that the transition betwixt two states of the of the finite state
     *     machine is properly executed.
     * </p>
     *
     * @see StateMachine
     * @see stonedhesus.fractals.main.states.model.State
     * @see LandingPage
     */
    @DisplayName("Testing to see whether transitioning from two previously defined states is feasible or not.s")
    @Test
    public void testTransitioningFromAStateToAnother() {
        this.stateMachine.change("landing-page", Optional.empty());
        assertEquals(this.stateMachine.getCurrentClass().getName(), Objects.requireNonNull(this.stateMachine.getStateElseNull("landing-page")).getClass().getName());
    }

    /**
     * <p>
     *     This here test unit's purpose is to ascertain whether the state machine object handles requests for unregistered states properly or not.
     * </p>
     *
     * <p>
     *     It is important to note that by handling requests for unregistered states properly, we mean that the state machine object throws an invalid
     *     argument exception, for state names which are not registered within its internal record of states.
     * </p>
     */
    @DisplayName("Testing to see whether the state machine behaves properly when a non-existent state is requested.")
    @Test
    public void testTransitioningToANonExistentState() { assertThrows(IllegalArgumentException.class, () -> this.stateMachine.change("non-existent-state", Optional.empty()));}
}
