package pt.trainings.maven.scratch;

/**
 * This class provides a method to generate greeting messages.
 */
public class Greetings {
    private static final String GREETING = "Hello ";

    /**
     * Provides a greeting message.

     * @param string the name of the person to greet
     * @return the greeting message
     */
    public String sayHello(String string) {
        return GREETING + (string != null ? string : "John Doe");
    }
}
