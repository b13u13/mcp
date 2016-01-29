package autotest.mcp.TestCases;

import autotest.mcp.Constants;
import autotest.mcp.Pages.ConstantsKeywordPage;
import autotest.mcp.Pages.ConstatnsNewCampaignPage;
import autotest.mcp.TestSteps.*;
import autotest.mcp.Utils;
import org.openqa.selenium.*;
import org.testng.annotations.*;

@Listeners(Utils.class)
public class GoogleCampaignTestCases {
    WebDriver drv;

    @BeforeClass(enabled = true, groups = {Constants.ACCEPTANCE_GROUP})
    public void init() {
        drv = Utils.getDriver();
    }
    @BeforeMethod(groups = {Constants.ACCEPTANCE_GROUP})
    public void login() {
        Utils.login();
        Utils.goToMCP();
    }

    @AfterMethod(enabled = true, groups = {Constants.ACCEPTANCE_GROUP})
    public void after() {
        drv.close();
        for (String handle : drv.getWindowHandles()) {
            drv.switchTo().window(handle);
        }
        Utils.logout();

    }

    @AfterClass(enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void afterClass(){
        drv.close();
        for (String handle : drv.getWindowHandles()) {
            drv.switchTo().window(handle);
        }
        Utils.logout();
    }

    @Test(enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void validateCampaignPage() {
        CampaignPageTestsSteps.checkCampaignName(Constants.GOOGLE_CAMPIAGNS);
        CampaignPageTestsSteps.enabledButtonOnCampaignPage();
        CampaignPageTestsSteps.turnOFFORON("Turn off");
        CampaignPageTestsSteps.turnOFFORON("Turn on");

    }

    @Test(priority = 0, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void createCampaign(){
        CampaignPageTestsSteps.selectCampaignType("National");
        NewCampaignTestsSteps.enabledButtons("Unsave");
        NewCampaignTestsSteps.validateFields(ConstatnsNewCampaignPage.NAME_ELEMENT);
        NewCampaignTestsSteps.validateFields(ConstatnsNewCampaignPage.BUDGET_ELEMENT);
        NewCampaignTestsSteps.validateFields(ConstatnsNewCampaignPage.CTN_ELEMENT);
        NewCampaignTestsSteps.relationsCheckBoxes();
        NewCampaignTestsSteps.enabledButtons("After save");
        CampaignPageTestsSteps.filteredCampaign();
    }



    @Test(priority = 1, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void validateCampaignTabs(){
        NewCampaignTestsSteps.validateTargetingTab();
        NewCampaignTestsSteps.validateDetailsTab();

    }


    @Test(priority = 2, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void createAdgroup() {
        AdgroupTestCases.createNewAdgroup();
    }


    @Test(priority = 3, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void validateAdgroupTabs() {
        AdgroupTestCases.validateSiteLinksTab();
        AdgroupTestCases.validateDetailsTab();
        AdgroupTestCases.filterAdgroup();
    }


    @Test(priority = 4, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void keywordSummary() {
        KeywordTestCases.addKeywords(ConstantsKeywordPage.KEYWORDS);
        KeywordTestCases.enabledDisabledKeywords("Turn off");
        KeywordTestCases.enabledDisabledKeywords("Turn on");
        KeywordTestCases.filteredKeywords();
        KeywordTestCases.deleteKeywords(ConstantsKeywordPage.KEYWORDS);
        KeywordTestCases.validateKeywords();
        KeywordTestCases.enabledButtonOnKeywordsPage();
        KeywordTestCases.addNegativeKeywords(ConstantsKeywordPage.KEYWORDS);
    }


    @Test(priority = 5, enabled = false, groups = {Constants.ACCEPTANCE_GROUP})
    public void copyKeywords() {
        AdgroupTestCases.copyKeywords();
    }


    @Test(priority = 6, enabled = true, groups = {Constants.ACCEPTANCE_GROUP})
    public void creativeSummary() {
        CreativeTestCases.creativesValidateFileds();
        /*
        Utils.validateCreativesDetailsTab();
        drv.findElement(By.xpath(Constants.TEST_CREATIVE_XPATH)).click();
        Utils.enabledButtonOnCreativesPage();
        Utils.validateTurnofAndTurnonCreatives("Turn off");
        Utils.validateTurnofAndTurnonCreatives("Turn on");
        Utils.deleteCreatives("Test creatives");
        Utils.copyExistingCreatives();
        Utils.deleteCreatives("Creatives");
        */
    }

/*
    @Test(priority = 7, enabled = true, groups = {Constants.ACCEPTANCE_GROUP})
    public void deleteCampaign() {
        Utils.deleteCampaign("Test Name");
    }

    @Test(priority = 8, enabled = true, groups = {Constants.ACCEPTANCE_GROUP})
    public void copyExistingCampaign() {
        Utils.copyCampaign();
    }
*/

}