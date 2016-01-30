package autotest.mcp.Pages;

import java.util.Random;

/**
 * Created by OOVSIYCHUK on 1/29/2016.
 */
public class ConstantsCreativePage {

    public static final String VIEW_CREATIVES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[6]/div/a";
    public static final String CREATE_CREATIVES_BUTTON = "//td/button[text()='Create Creative']";
    public static final String CREATIVE_NAME_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input";
    public static final String CREATIVE_TITLE_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input";
    public static final String CREATIVE_DESCRIPTION_1_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input";
    public static final String CREATIVE_DESCRIPTION_2_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input";
    public static final String CREATIVE_DISPLAY_URL_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/input";
    public static final String CREATIVE_EXEMPTION_REQUEST_FIELD = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/textarea";
    public static final String CREATIVE_SAVE_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";
    public static final String LONGER_EXEMPTION_REQUeST_XPATH = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td/div";
    public static final String LONGER_EXEMPTION_REQUEST_TEXT = "Longer than maximum length of 300 characters";
    public static final String CORRECT_NAME = "Test creative " +(new Random().nextInt(100000));
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
    public static final String MARK_CREATIVES_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/img";
    public static final String UNSELECTED_CREATIVES_ALERT = "No Creatives have been selected";
    public static final String CREATIVE_STATUS = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[3]/img";
    public static final String TURN_OFF_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/button";
    public static final String TURN_ON_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/button";
    public static final String COPY_EXISTING_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[7]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/button";
    public static final String CREATIVE_FOR_COPY = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]/img";
    public static final String COPY_BUTTON_XPATH = "//td/button[text()='Copy']";
    public static final String CANSEL_BUTTON_XPATH = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[6]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/button";
    public static final String SAVE_CREATIVES_BUTTON_2 = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[7]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button";
    public static final String NEW_CREATIVE = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[4]/div/a";
    public static final String TURNED_OFF_ONE_CREATIVES = "This is the only creative for this adgroup.  If you turn it off, you will need to create a new creative in order for this adgroup to be live.  Are you sure you want to continue?";
    public static final String CANSEL_BUTTON_XPATH_2 = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[7]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/button";
    public static final String DELETE_CREATIVES_BUTTON = "/html/body/div/table[2]/tbody/tr/td[2]/div/div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/button";



}
