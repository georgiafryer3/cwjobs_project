package Georgia_CWJobs.definitions;

import Georgia_CWJobs.steps.candidate.ApplicationSteps;
import Georgia_CWJobs.steps.candidate.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;


import static Georgia_CWJobs.entities.Candidate.getCandidate;

public class ActionDefinitions {

    @Steps
    SearchSteps searchSteps;

    @Steps
    ApplicationSteps applicationSteps;

    @When("a candidate applies for a job")
    public void searchJob() throws InterruptedException {
        searchSteps.searchJob();
        applicationSteps.applyAndRegister(getCandidate());
    }
}
