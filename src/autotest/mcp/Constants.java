package autotest.mcp;

public class Constants {
    //Test groups
    public static final String FUNCTIONAL_GROUP = "ui_functional";
    public static final String ACCEPTANCE_GROUP = "ui_acceptance";
    public static final String SMOKE_GROUP = "ui_smoke";

    //Login by Avenger UI
    public static final String LOGINPAGE_URL = Utils.baseURL;
    public static final String LOGIN_USERNAME_ID = "username";
    public static final String LOGIN_PASSWORD_ID = "password";
    public static final String LOGIN_BUTTON_ID = "submit";
    public static final String SIGNOUT_LINK_TEXT = "Sign Out";

    //System
    public static final String INVALIDBROWSERSTRING_ERROR_MESSAGE = " is not a valid browser string";

    //Timeout for WebDriverWait
    public static final int WAIT_TIMEOUT = 20;
    public static final int WAIT_TIMEOUT_SHORT = 2;
    public static final int WAIT_TIMEOUT_LONG = 70;


    //Avenger Account Search page
    public static final String MARCHEX_CID_ID = "cid";
    public static final String MARCHEX_AID_ID = "aid";
    public static final String ACCOUNT_SEARCH_BUTTON_ID = "account-search-button";
    public static final String SEARCH_ACCOUNT_NAME = "Door Man of Sierra Nevada Inc.";

    //Avenger Edit account page
    public static final String EDITORIAL_TAB_ID = "editorial-tab-link";
    public static final String GOOGLE_ADWORDS_EDIT_ID = "google";

    //MCP Google AdWords
    public static final String GOOGLE_CLASS_NAME = "pcp-partner";
    public static final String GOOGLE_TEXT = "Google - AdWords";
    //Campaign page
    public static final String CAMPAIGN_SELECT_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/select";
    public static String[] GOOGLE_CAMPIAGNS = new String[]{
            "National",
            "Geo-targeted",
            "Business Name"
    };


    public static final String TURN_ON_BUTTON_XPATH = "//td/button[text()='Turn on']";
    public static final String TURN_OFF_BUTTON_XPATH = "//td/button[text()='Turn off']";
    public static final String DELETE_BUTTON_XPATH = "//td/button[text()='Delete']";
    public static final String REPUSH_BUTTON_XPATH = "//td/button[text()='Repush']";
    public static final String FILTER_BUTTON_XPATH = "//td/button[text()='Filter']";





    public static final String ACTIVE_STATUS = "check.gif";
    public static final String INACTIVE_STATUS = "cross.gif";
    public static final String TYPE_XPATH = "/html/body/div[1]/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div";








    //Creatives
    public static final String VIEW_CREATIVES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[6]/div/a";
    public static final String CREATE_CREATIVES_BUTTON = "//td/button[text()='Create Creative']";
    public static final String CREATIVE_NAME_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input";
    public static final String CREATIVE_TITLE_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input";
    public static final String CREATIVE_DESCRIPTION_1_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input";
    public static final String CREATIVE_DESCRIPTION_2_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input";
    public static final String CREATIVE_DISPLAY_URL_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/input";
    public static final String CREATIVE_EXEMPTION_REQUEST_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/textarea";
    public static final String CREATIVE_SAVE_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";

    public static final String CORRECT_NAME = "Test creatives";
    public static final String CORRECT_TITLE = "Test Title";
    public static final String CORRECT_DESCRIPTION_1 = "Test Description 1 test description";
    public static final String CORRECT_DESCRIPTION_2 = "Test Description 2";
    public static final String TITLE_EMTY_TEXT_XPAT = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String EMPTY_DESCRITPION_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td";
    public static final String EMTY_URL_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String VALID_URL_TEXT = "http://www.TheDoorManReno.com";
    public static final String LONGER_NAME = "Test creativesTest creativesTest creativesTest creatives";
    public static final String LONGER_NAME_ALERT_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String LONGER_TITLE_ALERT_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String LONGER_TITLE_TEXT = "Longer than maximum length of 25 characters";
    public static final String LONGER_DESCRIPTION_ALERT_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String LONGER_DESCRIPTION_TEXT = "Longer than maximum length of 35 characters";
    public static final String LONGER_URL_ALERT_TEXT_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div";
    public static final String TEST_CREATIVE_XPATH = "//*[@id=\"gwt-uid-127\"]";
    public static final String MARK_DELETE_CREATIVES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/img";
    public static final String UNSELECTED_CREATIVES_ALERT = "No Creatives have been selected";
    public static final String SELECT_CREATIVES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/img";
    public static final String CREATIVE_STATUS = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[3]/img";
    public static final String TURN_OFF_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/button";
    public static final String TURN_ON_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/button";
    public static final String CREATIVES_DETAILS = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/div";
    public static final String COPY_EXISTING_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[7]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/button";
    public static final String CREATIVE_FOR_COPY = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]/img";
    public static final String COPY_BUTTON_XPATH = "//td/button[text()='Copy']";

    public static final String SAVE_CREATIVES_BUTTON_2 = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[7]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";
    public static final String NEW_CREATIVE = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[4]/div/a";
    public static final String TURNED_OFF_ONE_CREATIVES = "This is the only creative for this adgroup.  If you turn it off, you will need to create a new creative in order for this adgroup to be live.  Are you sure you want to continue?";


    public static final String DELETE_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/button";



    public static final String ADGROUP_DETAILS_TAB = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[4]/div/div";

}