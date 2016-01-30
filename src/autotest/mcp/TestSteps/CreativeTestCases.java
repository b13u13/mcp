package autotest.mcp.TestSteps;

import autotest.mcp.Constants;
import autotest.mcp.Pages.*;
import autotest.mcp.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by OOVSIYCHUK on 1/29/2016.
 */
public class CreativeTestCases {

    public static void creativesValidateFileds(){
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("Test name70570")).click();
        Utils.drv.findElement(By.xpath(ConstantsAdgroupPage.ADGROUP_XPATH)).click();
        Utils.drv.findElement(By.linkText(ConstantsAdgroupPage.ADGROUP_NAME)).click();
        //Utils.drv.findElement(By.linkText("Test adgroup75993")).click();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.VIEW_CREATIVES_XPATH)).click();
        Utils.drv.findElement(By.xpath(Constants.REPUSH_BUTTON_XPATH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATE_CREATIVES_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.CREATIVE_NAME_FIELD)));
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_NAME_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_TITLE_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_TITLE);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_1_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_DESCRIPTION_1);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_2_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_DESCRIPTION_2);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)){
            Utils.fail("Name field minimum validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_NAME_FIELD)).sendKeys(ConstantsCreativePage.LONGER_NAME);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.LONGER_NAME_ALERT_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.LONGER_NAME_ALERT_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT)){
            Utils.fail("Name field maximum validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_NAME_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_NAME_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_NAME);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_TITLE_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.TITLE_EMTY_TEXT_XPAT)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.TITLE_EMTY_TEXT_XPAT)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)){
            Utils.fail("Title field min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_TITLE_FIELD)).sendKeys(ConstantsCreativePage.LONGER_NAME);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.LONGER_TITLE_ALERT_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.LONGER_TITLE_ALERT_TEXT_XPATH)).getText().contains(ConstantsCreativePage.LONGER_TITLE_TEXT)){
            Utils.fail("Title field min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_TITLE_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_TITLE_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_TITLE);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_2_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.EMPTY_DESCRITPION_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.EMPTY_DESCRITPION_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)){
            Utils.fail("Description 2 field min validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_2_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_DESCRIPTION_2);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_1_FIELD)).sendKeys(ConstantsCreativePage.LONGER_NAME);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.LONGER_DESCRIPTION_ALERT_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.LONGER_DESCRIPTION_ALERT_TEXT_XPATH)).getText().contains(ConstantsCreativePage.LONGER_DESCRIPTION_TEXT)){
            Utils.fail("Description  field max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_2_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DESCRIPTION_2_FIELD)).sendKeys(ConstantsCreativePage.CORRECT_DESCRIPTION_2);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DISPLAY_URL_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.EMTY_URL_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.EMTY_URL_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)){
            Utils.fail("URL field mix validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DISPLAY_URL_FIELD)).sendKeys(ConstantsCreativePage.LONGER_NAME);
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.LONGER_URL_ALERT_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.LONGER_URL_ALERT_TEXT_XPATH)).getText().contains(ConstantsCreativePage.LONGER_DESCRIPTION_TEXT)){
            Utils.fail("URL field max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DISPLAY_URL_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_DISPLAY_URL_FIELD)).sendKeys(ConstantsCreativePage.VALID_URL_TEXT);
        for (int i = 0; i < 6; i++){
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_EXEMPTION_REQUEST_FIELD)).sendKeys(ConstantsCreativePage.LONGER_NAME);
        }
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.LONGER_EXEMPTION_REQUeST_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.LONGER_EXEMPTION_REQUeST_XPATH)).getText().contains(ConstantsCreativePage.LONGER_EXEMPTION_REQUEST_TEXT)){
            Utils.fail("Exemption field max validation failed");
        }
        NewCampaignTestsSteps.close();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_EXEMPTION_REQUEST_FIELD)).clear();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_SAVE_BUTTON)).click();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CANSEL_BUTTON_XPATH)).click();
    }

    public static void validateTurnofAndTurnonCreatives(String action){
        if (action.equals("Turn off")){
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.TURN_OFF_CREATIVES_BUTTON)).click();
            Utils.waitForAlert(ConstantsCreativePage.UNSELECTED_CREATIVES_ALERT);
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.MARK_CREATIVES_XPATH)).click();
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.TURN_OFF_CREATIVES_BUTTON)).click();
            Utils.waitForAlert(ConstantsCreativePage.TURNED_OFF_ONE_CREATIVES);
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_STATUS)).getAttribute("src").substring(35, 44).equals(Constants.INACTIVE_STATUS)){
                Utils.fail("Creative is not turned off");
            }
        } else {
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.TURN_ON_CREATIVES_BUTTON)).click();
            Utils.waitForAlert(ConstantsCreativePage.UNSELECTED_CREATIVES_ALERT);
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.MARK_CREATIVES_XPATH)).click();
            Utils.drv.findElement(By.xpath(ConstantsCreativePage.TURN_ON_CREATIVES_BUTTON)).click();
            Utils.getTime();
            if (!Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_STATUS)).getAttribute("src").substring(35, 44).equals(Constants.ACTIVE_STATUS)){
                Utils.fail("Creative is not turned off");
            }
        }
    }

    public static void deleteCreatives(String creatives){
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.MARK_CREATIVES_XPATH)));
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.MARK_CREATIVES_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.DELETE_CREATIVES_BUTTON)).click();
        Utils.waitForAlert(ConstantsKeywordPage.DELETE_KEYWORDS_ALERT_TEXT);
        Utils.getTime();
        if (Utils.isElementPresent(By.linkText(creatives))){
            Utils.fail("Creatives delete failed");
        }
    }

    public static void copyExistingCreatives(){
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATE_CREATIVES_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.COPY_EXISTING_CREATIVES_BUTTON)));
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.COPY_EXISTING_CREATIVES_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCreativePage.CREATIVE_FOR_COPY)));
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CREATIVE_FOR_COPY)).click();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.COPY_BUTTON_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.SAVE_CREATIVES_BUTTON_2)).click();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstantsCreativePage.CANSEL_BUTTON_XPATH_2)).click();
        if (!Utils.isElementPresent(By.xpath(ConstantsCreativePage.NEW_CREATIVE))){
            Utils.fail("Creatives copy failed");
        }
    }

    public static void filteredCreatives(){
        String creativesName = new String(Utils.drv.findElement(By.xpath(ConstantsCreativePage.NEW_CREATIVE)).getText());
        Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_KEYWORDS_BUTTON)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantsCampaignPage.FILTER_BY)));
        Select filterBy = new Select(Utils.drv.findElement(By.xpath(ConstantsKeywordPage.FILTER_BY)));
        filterBy.selectByVisibleText("Name");
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_CRITERIA_TEXT_FIELD)).sendKeys(creativesName);
        Utils.drv.findElement(By.xpath(ConstantsCampaignPage.FILTER_DATA_BUTTON)).click();
        if (!Utils.isElementPresent(By.linkText(creativesName))){
            Utils.fail("Filter creatives by name failed");
        }

    }

}
