// The package of the current Java compilation unit.
package stonedhesus.fractals.main.core;
// Imports from existing Java libraries, classes and interfaces.
import java.util.Hashtable;
import java.util.Optional;
// Imports from custom libraries, classes and interfaces.
import stonedhesus.fractals.main.state_machine.StateMachine;
import stonedhesus.fractals.main.states.landing_page.LandingPage;

/**
 * @author Andrei-Paul Ionescu
 */
public final class Fractals {
    //Static values of the class.

    // Fields/attributes of the class.
    private final StateMachine stateMachine;
    // Constructor(s) of the class.
    public Fractals() {
        this.stateMachine = new StateMachine(
                Optional.of(
                        new Hashtable<>() {{
                            put("landing-page", LandingPage::new);
                        }}
                )
        );

        this.stateMachine.change("landing-page", Optional.empty());
    }

    // Getters of the class.
    public StateMachine getStateMachine() {return this.stateMachine;}

    // Setters of the class.

    // Public instance-side methods of the class.

    // Public class-side methods of the class.

    // Private instance-side methods of the class.

    // Private class-side methods of the class.

    // Nested class(es)/ membered type(s).
}
