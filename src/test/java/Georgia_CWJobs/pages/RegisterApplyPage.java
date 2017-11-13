package Georgia_CWJobs.pages;

import Georgia_CWJobs.entities.Candidate;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterApplyPage extends PageObject {

    public WebElementFacade emailAddressInput() {
        return element(By.id("txtEmail"));
    }

    public WebElement nextButton() {
        return element(By.id("btnVerifyEmail"));
    }

    public WebElement passwordInput() {
        return element(By.id("txtPassword"));
    }

    public WebElement confirmPasswordInput() {
        return element(By.id("txtConfirmPassword"));
    }

    public WebElement continueButton() {
        return element(By.id("btnRegister"));
    }

    public WebElementFacade cvContainer() {
        return element(By.cssSelector(".cv-container"));
    }

    public WebElementFacade uploadCV() {
        return element(By.id("btnCVUpload"));
    }

    public WebElementFacade uploadCV2() {
        return element(By.id("localCV"));
    }

    public WebElementFacade uploadFromDevice() {
        return element(By.cssSelector(".file-upload"));
    }

    public WebElementFacade uploadCVSuccess() {
        return element(By.cssSelector(".alert.alert-success.success-icon"));
    }

    public WebElementFacade cvDropdownMenu() {
        return element(By.cssSelector(".dropdown-menu"));
    }

    public WebElementFacade firstNameInput() {
        return element(By.id("txtFirstname"));
    }

    public WebElement surnameInput() {
        return element(By.id("txtSurname"));
    }

    public WebElement UKeligibilityYes() {
        return  element(By.cssSelector("label[for=ukEligibilityYes]"));
    }

    public WebElement EUeligibilityYes() {
        return element(By.cssSelector("label[for=euEligibilityYes]"));
    }

    public WebElementFacade levelOfEducationDropdown() {
        return element(By.id("ddlEducation"));
    }

    public WebElement currentJobTitleInput() {
        return element(By.id("txtCurrentJobTitle"));
    }

    public WebElementFacade salaryDropdown() {
        return element(By.id("ddlSalaryRange"));
    }

    public WebElement submitApplicationButton() {
        return element(By.id("btnSubmit"));
    }

    public WebElement employersFindMeCheckbox() {
        return element(By.id("cvdbOptIn"));
    }

    public WebElement allowOneClickApplyCheckbox() {
        return element(By.id("ocaOptIn"));
    }

    public WebElement thirdPartyCheckbox() {
        return element(By.id("thirdPartyMarketingOptIn"));
    }

    public WebElement submitButton() {
        return element(By.id("btnSubmit"));
    }

    public WebElementFacade confirmationMessage() {
        return element(By.cssSelector(".brand-casing.brand-font"));
    }

    public WebElementFacade enterYourEmailAddress(){
        return element(By.cssSelector(".section-heading"));
    }

    public void applyForm(Candidate candidate) throws InterruptedException {

        assertThat(enterYourEmailAddress().getText(), is("1.Enter your email address"));

        emailAddressInput().typeAndEnter(candidate.getEmailAddress());
        passwordInput().sendKeys("jobsite1");
        confirmPasswordInput().sendKeys("jobsite1");
        continueButton().click();

        Thread.sleep(3000);

        uploadCV2().sendKeys("C:\\Users\\fryerg01\\Documents\\Dummy CVs\\PA_spa.docx");

        firstNameInput().waitUntilEnabled();

        assertThat(uploadCVSuccess().isVisible());

        firstNameInput().sendKeys("Georgia");
        surnameInput().sendKeys("Fryer");
        UKeligibilityYes().click();
        EUeligibilityYes().click();
        levelOfEducationDropdown().selectByValue("534"); //Universtiy degree
        currentJobTitleInput().sendKeys("Test Analyst");
        salaryDropdown().selectByValue("9"); //£24,000-£25,999
        employersFindMeCheckbox().click();
        submitButton().click();
    }
}
