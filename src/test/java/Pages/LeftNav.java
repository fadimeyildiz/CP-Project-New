package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GenWebDrv.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResource_1;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup_1;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategory_1;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations_1;

    @FindBy(css = "div[class='children ng-tns-c252-18 ng-trigger ng-trigger-slideInOut ng-star-inserted'] > :nth-child(1) > a")
    private WebElement positions;

    @FindBy(css = "span[class='nav-link-title ng-tns-c252-7 ng-star-inserted']")
    private WebElement setupLeftNav;

    @FindBy(css = "span[class='nav-link-title ng-tns-c252-9 ng-star-inserted']")
    private WebElement schoolSetup;

    @FindBy(css = "div[class='children ng-tns-c252-9 ng-trigger ng-trigger-slideInOut ng-star-inserted'] > :nth-child(4) >a > span")
    private WebElement schoolLocations;
    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;




    @FindBy (xpath = "//span[text()='School Setup']")
    private WebElement school_setup_f;

    @FindBy (xpath = "//span[text()='Departments']")
    private WebElement departments_f;

    @FindBy (xpath = "//span[text()='Locations']")
    private WebElement locations_f;





    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "humanResource_1":
                myElement = humanResource_1;
                break;
            case "setup_1":
                myElement = setup_1;
                break;
            case "positionCategory_1":
                myElement = positionCategory_1;
                break;
            case "attestations_1":
                myElement = attestations_1;
                break;
            case "positions":
                myElement = positions;
                break;
            case "setupLeftNav":
                myElement = setupLeftNav;
                break;
            case "schoolSetup":
                myElement = schoolSetup;
                break;
            case "schoolLocations":
                myElement = schoolLocations;
                break;

            case "departments_f": myElement=departments_f; break;
            case "school_setup_f": myElement=school_setup_f; break;
            case "locations_f": myElement=locations_f; break;
            case "setup": myElement=setup;break;

        }
        clickFunction(myElement);
    }
}
