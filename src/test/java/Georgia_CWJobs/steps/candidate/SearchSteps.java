package Georgia_CWJobs.steps.candidate;

import Georgia_CWJobs.pages.Homepage;
import Georgia_CWJobs.pages.SearchResultsPage;
import Georgia_CWJobs.pages.VacancyPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class SearchSteps extends ScenarioSteps {

    Homepage homepage;
    SearchResultsPage searchResultsPage;
    VacancyPage vacancyPage;

   @Step
    public void searchJob(){
       homepage.searchJob().sendKeys("cw250210");
       homepage.searchButton().click();

//       int numberOfJobs = searchResultsPage.allJobTitles().size();
//       assertThat(numberOfJobs, is(1));

       String jobTitle = searchResultsPage.jobTitleName().getText();
       assertThat(jobTitle, containsString("Network Engineer"));

        searchResultsPage.allJobTitles().get(0).click();

        String jobDescription = vacancyPage.jobDescription().getText();
        assertThat(jobDescription, containsString("Project management"));
        vacancyPage.applyButton().click();
    }
}
