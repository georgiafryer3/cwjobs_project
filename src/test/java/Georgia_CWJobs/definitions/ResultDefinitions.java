package Georgia_CWJobs.definitions;

import Georgia_CWJobs.pages.RegisterApplyPage;
import org.jbehave.core.annotations.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ResultDefinitions {

    RegisterApplyPage registerApplyPage;

    @Then("the candidate should be registered with a complete application")
    public void applicationComplete() {
        String applicationMessage = registerApplyPage.confirmationMessage().getText();
        assertThat(applicationMessage, containsString("APPLICATION COMPLETE!"));
    }
}
