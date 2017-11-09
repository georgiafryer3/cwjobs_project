package Georgia_CWJobs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VacancyPage extends PageObject {

    public WebElement jobTitle() {
        return element(By.cssSelector(".row.title>h1"));
    }

    public WebElement applyButton(){
        return element(By.id("JobToolsTop_AOLOptions_lnkApplyOnline"));
    }

    public List<WebElementFacade> jobDescriptionList() {
        return findAll(By.cssSelector(".job-description>ul>li"));
    }

    public WebElement jobDescription() {
        return element(By.cssSelector(".job-description>ul>li"));
    }
}
