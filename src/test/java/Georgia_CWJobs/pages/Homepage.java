package Georgia_CWJobs.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Georgia_CWJobs.entities.AutomationConfiguration.DEFAULT_URL;

public class Homepage extends PageObject {

    public boolean isCurrentPage() {
        return getDriver().getCurrentUrl().equals("https://www.cwjobs.tjgpat.io/");
    }

    private void getHomePageURL() {
        getDriver().get(DEFAULT_URL);
    }

    public void getHomePage(){
        getHomePageURL();
        isCurrentPage();
    }

    public WebElement searchJob() {
        return element(By.id("keywords"));
    }

    public WebElement searchLocation() {
        return element(By.id("location"));
    }

    public WebElement searchButton() {
        return element(By.id("search-button"));
    }


}
