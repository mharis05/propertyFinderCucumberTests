package propertyFinder.propertyFinderAssignment;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import propertyFinder.PropertyFinderWaits;
import propertyFinder.Utils;
import propertyFinder.steps.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchAgents extends BaseTest{

    private HomePage homepage = new HomePage();
    private AgentsPage agentsPage = new AgentsPage();
    private AgentSearchResultsPage agentSearchResultsPage = new AgentSearchResultsPage();
    private AgentDetailsPage agentDetailsPage = new AgentDetailsPage();
    private SoftAssertions softly = new SoftAssertions();

    //Will be used to assert counts of Results
    private int countBeforeResults = 0;
    private int countAfterFilter = 0;

    //Will be used to collect and export agent details
    Map<String,String> agentDetails = new HashMap<String,String>();

    @When("^User navigates to Find Agents page$")
    public void userNavigatesToFindAgentsPage() {

        homepage.clickFindAgentsTab(driver);
        PropertyFinderWaits.waitForSeconds(driver, 15);
    }

    @And("^User filters agents who speak \"([^\"]*)\", \"([^\"]*)\" or \"([^\"]*)\"$")
    public void userFiltersAgentsWhoSpeakSpecificLanguage(String language1, String language2, String language3) {

        agentsPage.clickLanguagesDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.selectLanguageFromDropDown(driver, language1);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.clickLanguagesDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.selectLanguageFromDropDown(driver, language2);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.clickLanguagesDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.selectLanguageFromDropDown(driver, language3);
        PropertyFinderWaits.waitForSeconds(driver, 5);

        agentsPage.clickFindAgentsButton(driver);
        PropertyFinderWaits.waitForSeconds(driver, 5);

    }

    @Then("^Retrieve the number of results for language$")
    public void retrieveTheNumberOfResultsForLanguage() {
        countBeforeResults = agentsPage.retrieveNumberOfResults(driver);
    }

    @And("^Retrieve the number of results for nationality$")
    public void retrieveTheNumberOfResultsForNationality() {
        countAfterFilter = agentsPage.retrieveNumberOfResults(driver);
    }

    @And("^Filter Agents based in \"([^\"]*)\"$")
    public void filterAgentsBasedIn(String nationality) {

        agentSearchResultsPage.clickNationalityTabDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver,10);
        agentSearchResultsPage.selectNationalityFromDropDown(driver,nationality);
        PropertyFinderWaits.waitForSeconds(driver,10);

        // I had to use Thread.sleep here since the JS takes some time to refresh content and
        // WebElement stays the same hence we cannot use explicit/implicit or even fluent wait
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^Assert that count of results has reduced$")
    public void assertThatCountOfResultsHasReduced() {
        softly.assertThat(countBeforeResults).isGreaterThan(countAfterFilter);
        softly.assertAll();
    }

    @Then("^Capture First agent's details in a file named \"([^\"]*)\"$")
    public void captureAgentDetailsInAFile(String filename) {

        agentDetails.put("Agent Name: ",agentDetailsPage.getAgentName(driver));
        agentDetails.put("Agent Nationality: ", agentDetailsPage.getAgentNationality(driver));
        agentDetails.put("Agent License Number: ", agentDetailsPage.getAgentLicenseNum(driver));
        agentDetails.put("Agent About Me: ", agentDetailsPage.getAgentAboutMe(driver));
        agentDetails.put("Agent Phone: ", agentDetailsPage.getAgentPhoneNum(driver));
        agentDetails.put("Agent Company: ", agentDetailsPage.getAgentCompanyName(driver));
        agentDetails.put("Agent Experience: ", agentDetailsPage.getAgentExperience(driver));
        agentDetails.put("Agent Active Listings: ", agentDetailsPage.getAgentActiveListings(driver));
        agentDetails.put("Agent LinkedIn URL: ", agentDetailsPage.getAgentLinkedInUrl(driver));

        //System.out.println(agentDetails);
        try {
            Utils.writeToTxt(agentDetails, filename);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @And("^User selects the first Agent on the page$")
    public void userSelectsTheFirstAgentOnThePage() {
        agentsPage.selectFirstAgent(driver);
        PropertyFinderWaits.waitForSeconds(driver,15);
    }

    @And("^Capture a screenshot$")
    public void captureAScreenshot() {
        Utils.captureScreenshot(driver);
    }

    @And("^Change page language to Arabic$")
    public void changePageLanguageToArabic() {
        agentDetailsPage.clickArabicLanguageSwitch(driver);
        PropertyFinderWaits.waitForSeconds(driver,10);
    }
}
