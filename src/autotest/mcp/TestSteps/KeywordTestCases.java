package autotest.mcp.TestSteps;

import autotest.mcp.Constants;
import autotest.mcp.Pages.ConstantsAdgroupPage;
import autotest.mcp.Pages.ConstantsCampaignPage;
import autotest.mcp.Pages.ConstantsKeywordPage;
import autotest.mcp.Pages.ConstatnsNewCampaignPage;
import autotest.mcp.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by OOVSIYCHUK on 1/29/2016.
 */
public class KeywordTestCases {

    public static void addKeywords(String keyword){

        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("Test name70570")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.linkText(ConstantsAdgroupPage.ADGROUP_NAME)).click();
        //Utils.drv.findElement(By.linkText("Test adgroup76412")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.VIEW_KEYWORDS_LINK)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_BUTTON_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)).sendKeys(keyword);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH_2)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(keyword)));
        if (!Utils.isElementPresent(By.linkText(keyword))){
            Utils.fail("Keywords createrd failed");
        }
    }

    public static void enabledDisabledKeywords(String action){
        if (action.equals("Turn off")){
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.TUTN_OFF_KEYWORDS_BUTTON)).click();
            Utils.waitForAlert(ConstantsKeywordPage.NOT_SELECTED_KEYWORDS_ALERT_TEST);
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.MARK_KEYWORDS)).click();
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.TUTN_OFF_KEYWORDS_BUTTON)).click();
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_STATUS)).getAttribute("src").substring(35, 44).equals(Constants.INACTIVE_STATUS)){
                Utils.fail("Keywords is not turned off");
            }
        } else {
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.TURN_ON_KEYWORDS_BUTTON)).click();
            Utils.waitForAlert(ConstantsKeywordPage.NOT_SELECTED_KEYWORDS_ALERT_TEST);
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.MARK_KEYWORDS)).click();
            Utils.drv.findElement(By.xpath(ConstantsKeywordPage.TURN_ON_KEYWORDS_BUTTON)).click();
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_STATUS)).getAttribute("src").substring(35, 44).equals(Constants.ACTIVE_STATUS)){
                Utils.fail("Keywords is not turned off");
            }
        }
    }

    public static void filteredKeywords(){
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_KEYWORDS_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        Select filterBy = new Select(Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_BY)));
        filterBy.selectByVisibleText("Keyword");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_CRITERIA_TEXT_FIELD)).sendKeys(ConstantsKeywordPage.KEYWORDS);
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_DATA_BUTTON)).click();
        if (!Utils.isElementPresent(By.linkText(ConstantsKeywordPage.KEYWORDS))){
            Utils.fail("Filter keywords by name failed");
        }
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_KEYWORDS_BUTTON_KEYWORDS)).click();
        Select filterBy_2 = new Select(Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_BY_2)));
        filterBy_2.selectByVisibleText("None");
    }

    public static void deleteKeywords(String keywords){
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsKeywordPage.MARK_KEYWORDS)));
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.MARK_KEYWORDS)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.DELETE_KEYWORDS_BUTTON)).click();
        Utils.waitForAlert(ConstantsKeywordPage.DELETE_KEYWORDS_ALERT_TEXT);
        Utils.getTime();
        if (Utils.isElementPresent(By.linkText(keywords))){
            Utils.fail("Keywords delete failed");
        }
    }

    public static void validateKeywords(){
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)).sendKeys(ConstantsKeywordPage.KEYWORDS_VALIDATE_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH)).click();
        Utils.waitForAlert(ConstantsKeywordPage.KEYWORDS_VALIDATE_ALERT_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)).sendKeys(ConstantsKeywordPage.KEYWORDS);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_BID_FIELD_XPATH)).sendKeys("text");
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH_2)).click();
        Utils.waitForAlert(ConstantsKeywordPage.KEYWORDS_BID_FIELD_ALERT_TEXT);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_BID_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH_2)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_SAVE_BUTTON)).click();
        deleteKeywords(ConstantsKeywordPage.KEYWORDS);
    }


    public static void enabledButtonOnKeywordsPage(){
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_EDIT_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(Constants.REPUSH_BUTTON_XPATH)).isDisplayed();

    }

    public static void addNegativeKeywords(String keyword){
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_NEGATIVE_KEYWORDS_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.KEYWORDS_FIELD_XPATH)).sendKeys(keyword);
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_NEXT_XPATH_2)).click();
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.CREATE_KEYWORDS_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("(-) "+keyword)));
        if (!Utils.isElementPresent(By.linkText("(-) "+keyword))){
            Utils.fail("Keywords createrd failed");
        }
        deleteKeywords("(-) "+ConstantsKeywordPage.KEYWORDS);
    }

}
