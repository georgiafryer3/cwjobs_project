package Georgia_CWJobs.definitions;

import Georgia_CWJobs.entities.Candidate;
import Georgia_CWJobs.steps.candidate.NavigationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

import static Georgia_CWJobs.entities.Candidate.putCandidate;

public class PrerequisiteDefinitions {

    @Steps
    private NavigationSteps navigationSteps;

    @Given("a candidate visits the site for the first time")
    public void candidateVisitsFirstTime() {
        putCandidate(new Candidate());
        navigationSteps.openHomePage();

    }
}
