import Configuration.BrowserEnvironment;
import Configuration.EnvironmentProperty;
import org.junit.jupiter.api.AfterAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;


public class TestBase {
    private static Logger logger = LoggerFactory.getLogger("TestBase.class");
    protected static WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    private static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void BeforeAll() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        logger.info("<<<<<<<<<<<<<<<<<<Driver closed properly");
    }
}