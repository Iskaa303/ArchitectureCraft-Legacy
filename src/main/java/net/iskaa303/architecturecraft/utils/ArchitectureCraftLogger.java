package net.iskaa303.architecturecraft.utils;

import org.slf4j.Logger;

public class ArchitectureCraftLogger {
    private final Logger logger;
    private final String prefix;

    public ArchitectureCraftLogger(Logger logger, String prefix) {
        this.logger = logger;
        this.prefix = "[" + prefix + "] ";
    }

    public void info(String message) {
        logger.info(prefix + message);
    }

    public void warn(String message) {
        logger.warn(prefix + message);
    }

    public void error(String message) {
        logger.error(prefix + message);
    }

    public void debug(String message) {
        logger.debug(prefix + message);
    }
}
