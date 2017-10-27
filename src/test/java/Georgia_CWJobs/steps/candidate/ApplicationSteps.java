package Georgia_CWJobs.steps.candidate;

import Georgia_CWJobs.entities.Candidate;
import Georgia_CWJobs.pages.RegisterApplyPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.IOException;

public class ApplicationSteps extends ScenarioSteps {

    RegisterApplyPage registerApplyPage;

    @Step
    public void applyAndRegister(Candidate candidate) throws InterruptedException {
        registerApplyPage.applyForm(candidate);
    }
}
