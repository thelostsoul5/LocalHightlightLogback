import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

/**
 * 日志级别高亮
 */
public class LevelHighlightingCompositeConverter extends ForegroundCompositeConverterBase<ILoggingEvent> {

    /**
     * (non-Javadoc)
     *
     * @see ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase#
     * getForegroundColorCode(java.lang.Object)
     */
    protected String getForegroundColorCode(ILoggingEvent event) {
        switch (event.getLevel().toInt()) {
            case Level.ERROR_INT:
                return ANSIConstants.BOLD+ANSIConstants.RED_FG;
            case Level.INFO_INT:
                return ANSIConstants.BOLD+ANSIConstants.YELLOW_FG;
            case Level.DEBUG_INT:
                return ANSIConstants.BOLD+ANSIConstants.GREEN_FG;
            default:
                return ANSIConstants.DEFAULT_FG;
        }
    }
}