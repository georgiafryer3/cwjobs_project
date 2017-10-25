package Georgia_CWJobs.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApplicationPage extends PageObject {

    public WebElementFacade Hello() {
        return element (By.cssSelector(".bye"));
    }




}
