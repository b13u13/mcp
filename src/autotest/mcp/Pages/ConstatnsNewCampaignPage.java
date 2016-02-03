package autotest.mcp.Pages;

import java.util.Random;

/**
 * Created by b13u1_000 on 1/28/2016.
 */
public class ConstatnsNewCampaignPage {
    public static final String CREATE_ADGROUP_BUTTON_XPATH = "//td/button[text()='Create Adgroup']";
    public static final String COPY_KEYWORDS_BUTTON_XPATH = "//td/button[text()='Copy Keywords']";
    public static final String NAME_ELEMENT = "Name";
    public static final String SAVE_BUTTON_XPATH = "//td/button[text()='Save']";
    public static final String CLOSE_BUTTON_XPATH = "//td/button[text()='Close']";
    public static final String NAME_UNIQ_TEXT_XPATH = "//td/div[text()='Cannot set name to National - Duplicate campaign name found for National; Campaign Name must be unique.']";
    public static final String NAME_UNIQ_TEXT = "Campaign Name must be unique.";
    public static final String NAME_FIELD_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/input";
    public static final String NAME_EMPTY_TEXT_XPATH = "//td/div[text()='Cannot set name to  - Shorter than minimum length of 1 characters']";
    public static final String NAME_EMPTY_TEXT = "Shorter than minimum length of 1 characters";
    public static final String NAME_MORE_50_SYMBOLS = "TestTestTestTestTestTestTestTestTestTestTestTestTestTestTest";
    public static final String NAME_MAXIMUM_TEXT_XPATH = "//td/div[text()='Cannot set name to TestTestTestTestTestTestTestTestTestTestTestTestTestTestTest - Longer than maximum length of 50 characters']";
    public static final String NAME_MAXIMUM_TEXT = "Longer than maximum length of 50 characters";
    public static final String CORRECT_NAME_CAMPAIGN = "Test name" +(new Random().nextInt(100000));
    public static final String BUDGET_ELEMENT = "Budget";
    public static final String BUDGET_FIELD_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/input";
    public static final String BUDGET_MINIMUM_TEXT_XPATH = "//td/div[text()='Cannot set budget to 0.00 - Smaller than minimum value of 1']";
    public static final String BUDGET_MINIMUM_TEXT = "Smaller than minimum value of 1";
    public static final String BUDGET_MAX_VALUE = "100000";
    public static final String BUDGET_MAXIMUM_TEXT_XPATH = "//td/div[text()='Cannot set budget to 100000.00 - Larger than maximum value of 20000']";
    public static final String BUDGET_MAXIMUM_TEXT = "Larger than maximum value of 20000";
    public static final String CTN_ELEMENT = "CTN";
    public static final String CTN_FIELD_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[7]/td[2]/input";
    public static final String CTN_INVALID_TEXT = "1234567890";
    public static final String CTN_INVALID_FORMAT_TEXT_XPATH = "//td/div[text()='Cannot set Call Tracking Number to 1234567890 - Call Tracking Number Invalid! ']";
    public static final String CTN_INVALID_FORMAT_TEXT = "Call Tracking Number Invalid!";
    public static final String ENABLED_ON_XPATH = "//td/span/label[text()='On']";
    public static final String ENABLED_OFF_XPATH = "//td/span/label[text()='Off']";
    public static final String CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH = "//td/div[text()='Cannot set Budget Optimizer to true - Cannot turn on Budget Optimizer if Separate Content Bid is enabled']";
    public static final String CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT = "Cannot turn on Budget Optimizer if Separate Content Bid is enabled";
    public static final String SEPARATE_CONTENT_BID_XPATH = "//td/span/label[text()='Separate Content Bid']";
    public static final String CONTENT_NETWORK_XPATH = "//td/span/label[text()='Content Network']";
    public static final String CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_XPATH_2 = "//td/div[text()='Cannot set Budget Optimizer to true - Cannot turn on Budget Optimizer if ContentNetwork is enabled']";
    public static final String CANNOOT_SET_BUDGET_OPTIMIZATION_TEXT_2 = "Cannot turn on Budget Optimizer if ContentNetwork is enabled";
    public static final String SEARCH_NETWORK_XPATH = "//td/span/label[text()='Search Network']";
    public static final String GOOGLE_SEARCH_XPATH = "//td/span/label[text()='Google Search']";
    public static final String CANNOT_SET_NETWORK_TARGETING_TO_0_XPATH = "//td/div[text()='Cannot set Network Targeting to 0 - Must have a minimum number of 1 NetworkTarget selected']";
    public static final String CANNOT_SET_NETWORK_TARGETING_TO_0_TEXT = "Must have a minimum number of 1 NetworkTarget selected";
    public static final String BID_CEILING_MIN_TEXT_XPATH = "//td/div[text()='Cannot set bid ceiling to 0.00 - Smaller than minimum value of 0.01']";
    public static final String BID_CEILING_MIN_TEXT = "Smaller than minimum value of 0.01";
    public static final String BID_CEILING_MAX_TEXT_XPATH = "//td/div[text()='Cannot set bid ceiling to 50.00 - Larger than maximum value of 30.00']";
    public static final String BID_CEILING_MAX_TEXT = "Larger than maximum value of 30.00";
    public static final String BID_CEILING_FIELD_XPATH = "/html/body/div[1]/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input";

    //Targeting tab
    public static final String TARGETING_XPARH = "//td//div/div[text()='Targeting']";
    public static final String COUNTRIES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[2]/div/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/select";
    public static final String TARGETING_LOCAL_XPATH = "//td/span/label[text()='Local']";
    public static final String TARGETING_NATIONAL_XPATH = "//td/span/label[text()='National']";
    public static final String LLOCAL_METROS_XPATH = "//td//div/div[text()='Metros']";
    public static final String LLOCAL_REGIONS_XPATH = "//td//div/div[text()='Regions']";
    public static final String LLOCAL_CITIES_XPATH = "//td//div/div[text()='Cities']";
    public static final String LLOCAL_PROXIMITY_XPATH = "//td//div/div[text()='Proximity']";

    //Details tab
    public static final String DETAILS_XPARH = "//td//div/div[text()='Details']";
    public static final String DETAILS_LAST_MODIFIED_XPARH = "//td/div[text()='Last Modified']";
    public static final String DETAILS_IN_FLIGHT_XPARH = "//td/div[text()='In Flight']";
    public static final String DETAILS_LAST_TANGO_RESPONSE_XPARH = "//td/div[text()='Last Tango Response']";
    public static final String DETAILS_ERROR_TYPE_XPARH = "//td/div[text()='Error Type']";
    public static final String DETAILS_ERROR_TEXT_XPARH = "//td/div[text()='Error Text']";
    public static final String DETAILS_PUSH_TO_PARTNER_XPARH = "//td/div[text()='Pushed To Partner']";
    public static final String DETAILS_ID_XPARH = "//td/div[text()='ID #']";
    public static final String FORCE_REPUSH_BUTTON_XPATH = "//td/button[text()='Force Repush']";

    //Site Links
    public static final String SITE_LINKS_XPATH = "//td//div/div[text()='Site Links']";
    public static final String CREATE_BUTTON_XPATH = "//td/button[text()='Create Site Link']";
    public static final String SITE_LINK_TEXT_INPUT = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/input";
    public static final String SITE_LINK_ALERT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr/td/div";
    public static final String SITE_LINK_TEXT_EMPTY_TEXT = "Please enter Site Link Text";
    public static final String SITE_LINK_URL_EMPTY_TEXT = "Please enter Site Link URL";
    public static final String DOTE_BUTTON_XPATH = "//td/button[text()='Done']";
    public static final String SITE_LINK_URL_INPUT = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input";
    public static final String SITE_LINK_URL_VALIDATION_TEXT = "Validation Failed[ SitelinkEntity Error: 'URL [text] is improperly formatted]";
    public static final String SITE_LINK_TEXT_VALIDATION_TEXT = "Validation Failed[ SitelinkEntity Error: 'Sitelink Text cannot exceed 25 characters]";
    public static final String DESCRIPTION_1_INPUT = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/input";
    public static final String DESCRIPTION_2_INPUT = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[4]/td[2]/table/tbody/tr/td[1]/input";
    public static final String DESCRIPTION_VALIDATION_TEXT = "Validation Failed[ SitelinkEntity Error: 'Only one description provided. Must provide both or none at all]";
    public static final String DESCRIPTION_1_LENGTH_VALIDATION_TEXT = "Validation Failed[ SitelinkEntity Error: 'Description line cannot exceed 35 characters]";
    public static final String NOT_SELECTED_TEXT = "No Site Links have been selected";
    public static final String TURN_OFF = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[1]/td/table/tbody/tr/td[7]/button";
    public static final String TURN_ON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[1]/td/table/tbody/tr/td[5]/button";
    public static final String MARK_LINK = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/img";
    public static final String STATUS_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/img";
    public static final String DELETE_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/table/tbody/tr[1]/td/table/tbody/tr/td[9]/button";
}
