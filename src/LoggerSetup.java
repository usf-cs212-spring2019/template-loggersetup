import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Generates several log messages to test Log4j2 setup.
 */
public class LoggerSetup {

	/**
	 * The logger to use.
	 */
	public static final Logger log = LogManager.getLogger(LoggerSetup.class);

	/**
	 * Generates several log messages.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		log.trace("tucan");
		log.debug("dodo");
		log.info("ibis");
		log.warn("wren");
		log.error("egret", new Exception("urk"));
		log.fatal("finch", new Exception("ack"));
	}

}
