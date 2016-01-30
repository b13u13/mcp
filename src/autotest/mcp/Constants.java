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



}