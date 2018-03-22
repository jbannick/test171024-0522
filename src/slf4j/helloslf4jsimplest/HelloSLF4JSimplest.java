import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSLF4JSimplest {
    private static Logger logger = LoggerFactory.getLogger(HelloSLF4JSimplest.class);

    public static void main(String... args) {
        System.out.println("Hello SLF4J Simplest!");
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}
