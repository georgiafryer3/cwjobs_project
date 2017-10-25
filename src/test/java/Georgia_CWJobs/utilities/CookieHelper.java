package Georgia_CWJobs.utilities;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CookieHelper {

    public static void resetCookies(){
        getDriver().manage().deleteAllCookies();
    }
}
