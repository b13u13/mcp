package autotest.mcp.Pages;

import java.util.Random;

/**
 * Created by b13u1_000 on 1/28/2016.
 */
public class ConstantsAdgroupPage {


    public static final String SAVE_BUTTON_ON_ADGROUP_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";
    public static final String SAVE_BUTTON_ON_ADGROUP_XPATH_2 = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";
    public static final String CANCEL_BUTTON_ADGROUP = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[2]/button";
    public static final String ADGROUP_ALERT_TEXT = "Please select a URL.";
    public static final String ADGROUP_URL_SELECT_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[5]/td[2]/select";
    public static final String ADGROUP_NAME_FIELD_XPATH = "/html/body/div[1]/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input";
    public static final String ADGROUP_NAME_FIELD_XPATH_2 = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input";
    public static final String ADGROUP_CTN_FIELD_XPATH = "/html/body/div[1]/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/input";
    public static final String ADGROUP_BID_FIELD_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/input";
    public static final String ADRGOUP_BID_MIN_TEXT_XPARH = "//td/div[text()='Cannot set bid to 0.00 - Smaller than minimum value of 0.01']";
    public static final String ADGROUP_BID_MIN_TEXT = "Smaller than minimum value of 0.01";
    public static final String ADGROUP_BID_MAX_TEXT_XPATH = "//td/div[text()='Cannot set bid to 500.00 - Larger than maximum value of 100']";
    public static final String ADGROUP_BID_MAX_TEXT = "Larger than maximum value of 100";
    public static final String ADGROUP_CONTENT_BID_FIELD_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input";
    public static final String ADGROUP_CONTENT_BID_MIN_TEXT_XPATH = "//td/div[text()='Cannot set Content Bid to 0.00 - Smaller than minimum value of 0.01']";
    public static final String ADGROUP_CONTENT_BID_MIN_TEXT = "Smaller than minimum value of 0.01";
    public static final String ADGROUP_CONTENT_BID_MAX_TEXT_XPATH = "//td/div[text()='Cannot set Content Bid to 10000.00 - Larger than maximum value of 100']";
    public static final String ADGROUP_CONTENT_BID_MAX_TEXT = "Larger than maximum value of 100";
    public static final String ADGROUP_MOBILE_BID_FIELD_XPATH = "/html/body/div[1]/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input";
    public static final String ADGROUP_MOBILE_BID_REQIRED_TEXT_XPATH = "//td/div[text()='Cannot set Mobile Bid to null - Required attribute not set']";
    public static final String ADGROUP_MOBILE_BID_REQIRED_TEXT = "Required attribute not set";
    public static final String ADGROUP_FILTER_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[5]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[8]/button";

    public static final String ADGROUP_XPATH = "//td//div/div[text()='Adgroups']";
    public static final String ADGROUP_NAME = "Test adgroup" +(new Random().nextInt(100000));
    public static final String NEW_ADGROUP_NAME = "Garage Doors Installation";
    //Site Links
    public static final String SITE_LINKS_XPARH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/div";
    public static final String CREATE_SITE_LINK_XPATH = "//td/button[text()='Create Site Link']";
    //Details tab
    public static final String DETAILS_XPARH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[4]/div/div";

}
