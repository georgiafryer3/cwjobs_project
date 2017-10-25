package Georgia_CWJobs.steps.candidate;

import Georgia_CWJobs.pages.Homepage;
import Georgia_CWJobs.utilities.CookieHelper;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps extends ScenarioSteps {

    private Homepage homepage;

    @Step
    public void openHomePage() {
        if(!homepage.isCurrentPage()) {
           homepage.getHomePage();
           CookieHelper.resetCookies();
           getDriver().navigate().refresh();
           getDriver().manage().window().maximize();
        }
    }




}
