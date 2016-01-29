package autotest.mcp.Pages;

import java.util.Random;

/**
 * Created by OOVSIYCHUK on 1/29/2016.
 */
public class ConstantsKeywordPage {

    public static final String KEYWORDS = "test keyword " +(new Random().nextInt(100000));
    public static final String TUTN_OFF_KEYWORDS_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/button";
    public static final String TURN_ON_KEYWORDS_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/button";
    public static final String NOT_SELECTED_KEYWORDS_ALERT_TEST = "No Keywords have been selected";
    public static final String KEYWORDS_STATUS = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[3]/img";
    public static final String KEYWORDS_TAB_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[6]/div/a";
    public static final String CREATE_KEYWORDS_BUTTON_XPATH = "//td/button[text()='Create keywords']";
    public static final String CREATE_NEGATIVE_KEYWORDS_BUTTON_XPATH = "//td/button[text()='Create negative keywords']";
    public static final String KEYWORDS_FIELD_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/div/textarea";
    public static final String CREATE_KEYWORDS_NEXT_XPATH = "//td/button[text()='Next']";
    public static final String CREATE_KEYWORDS_NEXT_XPATH_2 = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/button";
    public static final String CREATE_KEYWORDS_SAVE_BUTTON = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/div[3]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/button";
    public static final String MARK_KEYWORDS = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/img";
    public static final String DELETE_KEYWORDS_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/button";
    public static final String DELETE_KEYWORDS_ALERT_TEXT = "Warning! Deleting this entity will permanently remove it and all its children from the system.  Are you sure you wish to proceed?";
    public static final String KEYWORDS_VALIDATE_TEXT = ", ! @ % ^ * () = {} ; ~ ` <> ? \\ |";
    public static final String KEYWORDS_VALIDATE_ALERT_TEXT = "Unable to save: Invalid symbols."+"\n"+"Next symbols can't be used in Google Keywords: " + KEYWORDS_VALIDATE_TEXT + " ";
    public static final String KEYWORDS_BID_FIELD_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/div/input";
    public static final String KEYWORDS_BID_FIELD_ALERT_TEXT = "Unable to save: Unable to parse money value from \"text\"";
    public static final String CREATE_KEYWORDS_EDIT_XPATH = "//td/button[text()='Edit']";

}
