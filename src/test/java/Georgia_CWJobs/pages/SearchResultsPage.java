package Georgia_CWJobs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    public List<WebElementFacade> allJobTitles(){
        return findAll(By.cssSelector(".job-title>a>h2"));
    }

}
