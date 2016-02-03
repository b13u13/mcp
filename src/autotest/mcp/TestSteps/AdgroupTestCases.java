package autotest.mcp.TestSteps;

import autotest.mcp.Constants;
import autotest.mcp.Pages.ConstantsAdgroupPage;
import autotest.mcp.Pages.ConstantsCampaignPage;
import autotest.mcp.Pages.ConstantsKeywordPage;
import autotest.mcp.Pages.ConstatnsNewCampaignPage;
import autotest.mcp.Utils;
import bsh.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by b13u1_000 on 1/28/2016.
 */
public class AdgroupTestCases {

    public static void createNewAdgroup(){
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CREATE_ADGROUP_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_URL_SELECT_XPATH)));
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.waitForAlert(ConstantsAdgroupPage.ADGROUP_ALERT_TEXT);
        Select selectURL = new Select(Utils.drv.findElement((By.xpath(ConstantsAdgroupPage.ADGROUP_URL_SELECT_XPATH))));
        selectURL.selectByVisibleText("http://www.TheDoorManReno.com");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)){
            Utils.fail("Name field minimum validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.NAME_MORE_50_SYMBOLS);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT)){
            Utils.fail("Name field maximum validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).sendKeys(ConstantsAdgroupPage.ADGROUP_NAME);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CTN_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.CTN_INVALID_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT)){
            Utils.fail("CTN field validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CTN_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADRGOUP_BID_MIN_TEXT_XPARH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADRGOUP_BID_MIN_TEXT_XPARH)).getText().contains(ConstantsAdgroupPage.ADGROUP_BID_MIN_TEXT)){
            Utils.fail("Bid min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_FIELD_XPATH)).sendKeys("500");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_MAX_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_MAX_TEXT_XPATH)).getText().contains(ConstantsAdgroupPage.ADGROUP_BID_MAX_TEXT)){
            Utils.fail("Bid max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_BID_FIELD_XPATH)).sendKeys("1.43");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).sendKeys("0");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MIN_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MIN_TEXT_XPATH)).getText().contains(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MIN_TEXT)){
            Utils.fail("Content bid min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).sendKeys("10000");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MAX_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MAX_TEXT_XPATH)).getText().contains(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_MAX_TEXT)){
            Utils.fail("Content bid max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_CONTENT_BID_FIELD_XPATH)).sendKeys("0.90");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_MOBILE_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_MOBILE_BID_REQIRED_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_MOBILE_BID_REQIRED_TEXT_XPATH)).getText().contains(ConstantsAdgroupPage.ADGROUP_MOBILE_BID_REQIRED_TEXT)){
            Utils.fail("Content bid max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_MOBILE_BID_FIELD_XPATH)).sendKeys("1.43");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
    }

    public static void validateSiteLinksTab(){
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("National1")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.linkText(ConstantsAdgroupPage.ADGROUP_NAME)).click();
        //Utils.drv.findElement(By.linkText("Test")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINKS_XPARH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.CREATE_SITE_LINK_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.CREATE_SITE_LINK_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.TURN_ON_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.TURN_OFF_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.DELETE_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.CREATE_SITE_LINK_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_TEXT_EMPTY_TEXT)) {
            Utils.fail("Site link text min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_TEXT_INPUT)).sendKeys("Test text");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_URL_EMPTY_TEXT)) {
            Utils.fail("Site link url min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_URL_INPUT)).sendKeys("text");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_URL_VALIDATION_TEXT)) {
            Utils.fail("Site link url  validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_URL_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_URL_INPUT)).sendKeys("http://text.com");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_TEXT_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_TEXT_INPUT)).sendKeys("Tesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_TEXT_VALIDATION_TEXT)) {
            Utils.fail("Site link text  validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_TEXT_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SITE_LINK_TEXT_INPUT)).sendKeys("Test text");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_1_INPUT)).sendKeys("TesssssssssssssssssssssssssTesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_VALIDATION_TEXT)) {
            Utils.fail("Description validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_2_INPUT)).sendKeys("Tesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_1_LENGTH_VALIDATION_TEXT)) {
            Utils.fail("Description1 max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_1_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_1_INPUT)).sendKeys("Description1");
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_2_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_2_INPUT)).sendKeys("TesssssssssssssssssssssssssTesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_1_LENGTH_VALIDATION_TEXT)) {
            Utils.fail("Description2 max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_2_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DESCRIPTION_2_INPUT)).sendKeys("Description2");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();


        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.TURN_OFF_BUTTON_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.TURN_OFF_BUTTON_XPATH)).click();
        Utils.waitForAlert(ConstatnsNewCampaignPage.NOT_SELECTED_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.TURN_OFF_BUTTON_XPATH)).click();
        Utils.getTime();
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.INACTIVE_STATUS)) {
            Utils.fail("Site link is not turned off");
        }
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.TURN_ON_BUTTON_XPATH)).click();
        Utils.waitForAlert(ConstatnsNewCampaignPage.NOT_SELECTED_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.TURN_ON_BUTTON_XPATH)).click();
        Utils.getTime();
        if (!Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.ACTIVE_STATUS)) {
            Utils.fail("Site link is not turned on");
        }
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DELETE_BUTTON)).click();
        Utils.waitForAlert(ConstantsKeywordPage.DELETE_KEYWORDS_ALERT_TEXT);
        Utils.getTime();
        if (Utils.isElementPresent(By.linkText("Test text"))){
            Utils.fail("Site link delete failed");
        }

    }

    public static void validateDetailsTab(){
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.DETAILS_XPARH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_LAST_MODIFIED_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_IN_FLIGHT_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_LAST_TANGO_RESPONSE_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ERROR_TYPE_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ERROR_TEXT_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_PUSH_TO_PARTNER_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ID_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.FORCE_REPUSH_BUTTON_XPATH)).isDisplayed();
    }

    public static void filterAdgroup(){
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.MAIN_CAMPAIGN_PAGE)).click();
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("Test name15850")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_FILTER_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        Select filterBy = new Select(Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        filterBy.selectByVisibleText("URL");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_CRITERIA_TEXT_FIELD)).sendKeys("http://www.TheDoorManReno.com");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_DATA_BUTTON)).click();
        //if (!Utils.isElementPresent(By.linkText("Test adgroup14818"))){
        if (!Utils.isElementPresent(By.linkText(ConstantsAdgroupPage.ADGROUP_NAME))){
            Utils.fail("Filter by URL failed");
        }
    }

    public static void copyKeywords(){
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("Test name25930")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.linkText(ConstantsAdgroupPage.ADGROUP_NAME)).click();
        //Utils.drv.findElement(By.linkText("Test")).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)));
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH)).sendKeys(ConstantsAdgroupPage.NEW_ADGROUP_NAME);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.CANCEL_BUTTON_ADGROUP)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.COPY_KEYWORDS_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsAdgroupPage.SELECT_CAMPAIGN_FOR_COPY)));
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SELECT_CAMPAIGN_FOR_COPY)).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.COPY_CAMPAIGN_BUTTON_XPATH)).click();
        Utils.getTime();
        Utils.waitForAlert(ConstantsAdgroupPage.COMPLETE_COPY_ALERT);
        Utils.getTime();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.linkText(ConstantsAdgroupPage.NEW_ADGROUP_NAME)).click();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH_2)).clear();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_NAME_FIELD_XPATH_2)).sendKeys(ConstantsAdgroupPage.ADGROUP_NAME);
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.SAVE_BUTTON_ON_ADGROUP_XPATH_2)).click();
    }

}
