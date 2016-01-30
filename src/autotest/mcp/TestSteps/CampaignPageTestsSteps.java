package autotest.mcp.TestSteps;

import autotest.mcp.Constants;
import autotest.mcp.Pages.ConstantsCampaignPage;
import autotest.mcp.Pages.ConstantsCreativePage;
import autotest.mcp.Pages.ConstantsKeywordPage;
import autotest.mcp.Pages.ConstatnsNewCampaignPage;
import autotest.mcp.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by b13u1_000 on 1/28/2016.
 */

public class CampaignPageTestsSteps {

    public static LinkedList<String> selectCampaignSummary() {

        Select campaignSumary = new Select(Utils.drv.findElement(By.xpath(Constants.CAMPAIGN_SELECT_XPATH)));

        List<WebElement> campaignName = campaignSumary.getOptions();
        LinkedList<String> campaign = new LinkedList<String>();
        for (int i = 1; i < campaignName.size(); i++ ){
            campaign.add(campaignName.get(i).getText());
        }
        return campaign;
    }

    public static void selectCampaignType(String companyType){
        Select campaignType = new Select(Utils.drv.findElement(By.xpath(Constants.CAMPAIGN_SELECT_XPATH)));
        campaignType.selectByVisibleText(companyType);


    }

    public static void checkCampaignName(String[] campaignName){
        for (int i = 0; i < campaignName.length; i++ ){
            if (!selectCampaignSummary().get(i).equals(campaignName[i])){
                Utils.fail("Campaign Name is invalid");
            }
        }
    }

    public static void enabledButtonOnCampaignPage(){
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.CREATE_CAMPAIGN_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.COPY_EXISTING_CAMPAIGN_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.TURN_ON_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.TURN_OFF_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.DELETE_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.REPUSH_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.FILTER_BUTTON_XPATH)).isDisplayed();
    }


    public static void turnOFFORON(String action){
        if (action.equals("Turn off")){
            Utils.drv.findElement(By.xpath(Constants.TURN_OFF_BUTTON_XPATH)).click();
            Utils.waitForAlert(ConstantsCampaignPage.UNSELECTED_TURN_OFF_TEXT);
            Utils.drv.findElement(By.xpath(ConstantsCampaignPage.CHECK_BOX_FOR_BUSINNES_NAME)).click();
            Utils.drv.findElement(By.xpath(Constants.TURN_OFF_BUTTON_XPATH)).click();
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsCampaignPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.INACTIVE_STATUS)){
                Utils.fail("Company is not turned off");
            }
        } else {
            Utils.drv.findElement(By.xpath(Constants.TURN_ON_BUTTON_XPATH)).click();
            Utils.waitForAlert(ConstantsCampaignPage.UNSELECTED_TURN_OFF_TEXT);
            Utils.drv.findElement(By.xpath(ConstantsCampaignPage.CHECK_BOX_FOR_BUSINNES_NAME)).click();
            Utils.drv.findElement(By.xpath(Constants.TURN_ON_BUTTON_XPATH)).click();
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsCampaignPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.ACTIVE_STATUS)){
                Utils.fail("Company is not turned on");
            }
        }
    }

    public static void filteredCampaign(){
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.MAIN_CAMPAIGN_PAGE)).click();
        Utils.drv.findElement(By.xpath(Constants.FILTER_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        Select filterBy = new Select(Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        filterBy.selectByVisibleText("Name");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_CRITERIA_TEXT_FIELD)).sendKeys(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN);
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_DATA_BUTTON)).click();
        if (!Utils.isElementPresent(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN))){
            Utils.fail("Filter by name failed");
        }
    }


    public static void deleteCampaign(String campaign){
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.MARK_CAMPAIGN_FOR_DELETE)).click();
        Utils.drv.findElement(By.xpath(Constants.DELETE_BUTTON_XPATH)).click();
        Utils.waitForAlert(ConstantsKeywordPage.DELETE_KEYWORDS_ALERT_TEXT);
        Utils.getTime();
        if (Utils.isElementPresent(By.linkText(campaign))){
            Utils.fail("Campaign delete failed");
        }
    }

    public static void copyCampaign(){
        selectCampaignType("National");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.COPY_EXISTING_CAMPAIGN_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCampaignPage.SELECT_CAMPAIGN_FOR_COPY_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.SELECT_CAMPAIGN_FOR_COPY_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.NEXT_BUTTON)).click();
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.COPY_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)));
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN);
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).sendKeys("30");
        NewCampaignTestsSteps.save();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.MAIN_CAMPAIGN_PAGE)).click();
        if (!Utils.isElementPresent(By.xpath(ConstantsCampaignPage.CAMPAIGN_NAME))){
            Utils.fail("Campaign copy failed");
        }
        deleteCampaign(Utils.drv.findElement(By.xpath(ConstantsCampaignPage.CAMPAIGN_NAME)).getText());
    }


}
