package autotest.mcp.TestSteps;


import autotest.mcp.Constants;
import autotest.mcp.Pages.ConstantsCampaignPage;
import autotest.mcp.Pages.ConstantsKeywordPage;
import autotest.mcp.Utils;
import org.openqa.selenium.By;
import autotest.mcp.Pages.ConstatnsNewCampaignPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by b13u1_000 on 1/28/2016.
 */
public class NewCampaignTestsSteps {

    public static void enabledButtons(String state) {
        if (state.equals("Unsave")) {
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CREATE_ADGROUP_BUTTON_XPATH)));
            Utils.assertCondition(Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CREATE_ADGROUP_BUTTON_XPATH)).getAttribute("disabled").equals("true"), true, "Create adgroup button is not disabled");
            Utils.assertCondition(Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.COPY_KEYWORDS_BUTTON_XPATH)).getAttribute("disabled").equals("true"), true, "Create Keywords button is not disabled");
        } else {
            Utils.assertCondition(Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CREATE_ADGROUP_BUTTON_XPATH)).isEnabled(), true, "Create adgroup button is not enabled");
            Utils.assertCondition(Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.COPY_KEYWORDS_BUTTON_XPATH)).isEnabled(), true, "Create Keywords button is not enabled");

        }
    }

    public static void save() {
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SAVE_BUTTON_XPATH)).click();
    }

    public static void close() {
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CLOSE_BUTTON_XPATH)).click();
    }

    public static void validateFields(String element) {
        if (element.equals(ConstatnsNewCampaignPage.NAME_ELEMENT)) {
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_UNIQ_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_UNIQ_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_UNIQ_TEXT)) {
                Utils.fail("Uniq validation for Name field failed");
            }
            close();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).clear();
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_EMPTY_TEXT)) {
                Utils.fail("Name field minimum validation failed");
            }
            close();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.NAME_MORE_50_SYMBOLS);
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.NAME_MAXIMUM_TEXT)) {
                Utils.fail("Name field maximum validation failed");
            }
            close();

            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).clear();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.NAME_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN);
        } else if (element.equals(ConstatnsNewCampaignPage.BUDGET_ELEMENT)) {
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).clear();
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.BUDGET_MINIMUM_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_MINIMUM_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.BUDGET_MINIMUM_TEXT)) {
                Utils.fail("Budget field minimum validation failed");
            }
            close();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.BUDGET_MAX_VALUE);
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.BUDGET_MAXIMUM_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_MAXIMUM_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.BUDGET_MAXIMUM_TEXT)) {
                Utils.fail("Budget field maximum validation failed");
            }
            close();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).clear();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BUDGET_FIELD_XPATH)).sendKeys("30");
        } else if (element.equals(ConstatnsNewCampaignPage.CTN_ELEMENT)) {
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CTN_FIELD_XPATH)).sendKeys(ConstatnsNewCampaignPage.CTN_INVALID_TEXT);
            save();
            Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT_XPATH)));
            if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.CTN_INVALID_FORMAT_TEXT)) {
                Utils.fail("CTN field validation failed");
            }
            close();
            Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CTN_FIELD_XPATH)).clear();

        }
    }


    public static void relationsCheckBoxes() {
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.ENABLED_ON_XPATH)).click();
        save();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT)) {
            Utils.fail("Budget optimization validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SEPARATE_CONTENT_BID_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CONTENT_NETWORK_XPATH)).click();
        save();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH_2)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH_2)).getText().contains(ConstatnsNewCampaignPage.CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_2)) {
            Utils.fail("Budget optimization validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SEARCH_NETWORK_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.GOOGLE_SEARCH_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CONTENT_NETWORK_XPATH)).click();
        save();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.CANNOT_SET_NETWORK_TARGETING_TO_0_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CANNOT_SET_NETWORK_TARGETING_TO_0_XPATH)).getText().contains(ConstatnsNewCampaignPage.CANNOT_SET_NETWORK_TARGETING_TO_0_TEXT)) {
            Utils.fail("Budget optimization validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SEARCH_NETWORK_XPATH)).click();
        save();
        Utils.getTime();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_FIELD_XPATH)).sendKeys("0");
        save();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_MIN_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_MIN_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.BID_CEILING_MIN_TEXT)) {
            Utils.fail("Bid ceiling validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_FIELD_XPATH)).sendKeys("50");
        save();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_MAX_TEXT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_MAX_TEXT_XPATH)).getText().contains(ConstatnsNewCampaignPage.BID_CEILING_MAX_TEXT)) {
            Utils.fail("Bid ceiling validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.BID_CEILING_FIELD_XPATH)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.ENABLED_OFF_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SEPARATE_CONTENT_BID_XPATH)).click();
        save();
    }

    public static void validateTargetingTab() {
        Utils.drv.findElement(By.linkText(ConstatnsNewCampaignPage.CORRECT_NAME_CAMPAIGN)).click();
        //Utils.drv.findElement(By.linkText("National1")).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TARGETING_XPARH)).click();
        Select coutry = new Select(Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.COUNTRIES_XPATH)));
        coutry.selectByVisibleText("Canada");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TARGETING_LOCAL_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.LLOCAL_REGIONS_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.LLOCAL_CITIES_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.LLOCAL_PROXIMITY_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.LLOCAL_METROS_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TARGETING_NATIONAL_XPATH)).click();

    }

    public static void validateDetailsTab() {
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_XPARH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_LAST_MODIFIED_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_IN_FLIGHT_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_LAST_TANGO_RESPONSE_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ERROR_TYPE_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ERROR_TEXT_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_PUSH_TO_PARTNER_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DETAILS_ID_XPARH)).isDisplayed();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.FORCE_REPUSH_BUTTON_XPATH)).isDisplayed();
    }


    public static void validateSiteLinksTab() {
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINKS_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.CREATE_BUTTON_XPATH)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_TEXT_EMPTY_TEXT)) {
            Utils.fail("Site link text min validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_TEXT_INPUT)).sendKeys("Test text");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_URL_EMPTY_TEXT)) {
            Utils.fail("Site link url min validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_URL_INPUT)).sendKeys("text");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_URL_VALIDATION_TEXT)) {
            Utils.fail("Site link url  validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_URL_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_URL_INPUT)).sendKeys("http://text.com");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_TEXT_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_TEXT_INPUT)).sendKeys("Tesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.SITE_LINK_TEXT_VALIDATION_TEXT)) {
            Utils.fail("Site link text  validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_TEXT_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_TEXT_INPUT)).sendKeys("Test text");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_1_INPUT)).sendKeys("TesssssssssssssssssssssssssTesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_VALIDATION_TEXT)) {
            Utils.fail("Description validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_2_INPUT)).sendKeys("Tesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_1_LENGTH_VALIDATION_TEXT)) {
            Utils.fail("Description1 max validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_1_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_1_INPUT)).sendKeys("Description1");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_2_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_2_INPUT)).sendKeys("TesssssssssssssssssssssssssTesssssssssssssssssssssssss");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();
        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)));
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.SITE_LINK_ALERT_XPATH)).getText().contains(ConstatnsNewCampaignPage.DESCRIPTION_1_LENGTH_VALIDATION_TEXT)) {
            Utils.fail("Description2 max validation failed");
        }
        close();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_2_INPUT)).clear();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DESCRIPTION_2_INPUT)).sendKeys("Description2");
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DOTE_BUTTON_XPATH)).click();

        Utils.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstatnsNewCampaignPage.TURN_OFF)));
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TURN_OFF)).click();
        Utils.waitForAlert(ConstatnsNewCampaignPage.NOT_SELECTED_TEXT);
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TURN_OFF)).click();
        Utils.getTime();
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.INACTIVE_STATUS)) {
            Utils.fail("Site link is not turned off");
        }
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TURN_ON)).click();
        Utils.waitForAlert(ConstatnsNewCampaignPage.NOT_SELECTED_TEXT);
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.TURN_ON)).click();
        Utils.getTime();
        if (!Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.STATUS_XPATH)).getAttribute("src").substring(35, 44).equals(Constants.ACTIVE_STATUS)) {
            Utils.fail("Site link is not turned on");
        }
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.MARK_LINK)).click();
        Utils.drv.findElement(By.xpath(ConstatnsNewCampaignPage.DELETE_BUTTON)).click();
        Utils.waitForAlert(ConstantsKeywordPage.DELETE_KEYWORDS_ALERT_TEXT);
        Utils.getTime();
        if (Utils.isElementPresent(By.linkText("Test text"))){
            Utils.fail("Site link delete failed");
        }

    }


}


