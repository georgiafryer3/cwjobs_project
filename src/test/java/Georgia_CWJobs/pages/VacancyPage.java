package Georgia_CWJobs.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VacancyPage extends PageObject {

    public WebElement jobTitle() {
        return element(By.cssSelector(".row.title>h1"));
    }

    public WebElement applyButton(){
        return element(By.id("JobToolsTop_AOLOptions_lnkApplyOnline"));
    }
}
