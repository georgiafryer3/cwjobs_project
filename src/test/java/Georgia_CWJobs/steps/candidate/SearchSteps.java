package Georgia_CWJobs.steps.candidate;

import Georgia_CWJobs.pages.Homepage;
import Georgia_CWJobs.pages.SearchResultsPage;
import Georgia_CWJobs.pages.VacancyPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

    Homepage homepage;
    SearchResultsPage searchResultsPage;
    VacancyPage vacancyPage;

   @Step
    public void searchJob(){
        //homepage.searchJob().sendKeys("cw250210");
        homepage.searchButton().click();
        searchResultsPage.allJobTitles().get(3).click();
        vacancyPage.applyButton().click();
    }
}
