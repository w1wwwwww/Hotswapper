package log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class Logger {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger("Logger");
    private static final ConsoleHandler handler = new ConsoleHandler();

    public static void log(Level level, String message) {
        handler.setLevel(level);
        logger.addHandler(handler);
        logger.setLevel(level);
        logger.fine(message);
    }
}
