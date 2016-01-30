package autotest.mcp;

import nu.xom.*;
import org.apache.bcel.classfile.Constant;
import org.apache.xpath.operations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IExecutionListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;



import javax.annotation.Nullable;
import java.io.*;
import java.lang.String;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Parameters({"browser", "url", "reportdir", "attemptNumber", "product", "group", "servername"})
public class Utils extends TestListenerAdapter implements IExecutionListener {
    public static WebDriver drv = null;
    public static boolean isChrome = false;
    public static boolean isFirefox = false;
    public static boolean isIE = false;
    public static String baseURL = null;
    public static String reportDir = null;
    public static WebDriverWait wait = null;
    public static WebDriverWait wait_short = null;
    public static WebDriverWait wait_long = null;

    public static String login = null;
    public static String pass = null;
    private static String attemptNumber;
    public static String product;
    private static File reportFile;
    private static Element reportRoot = null;
    private static Document reportDoc;
    static Random randomGenerator = new Random();
    static int randomInt=randomGenerator.nextInt(9) +1;



    @Override
    public void onExecutionStart() {



  String browser = System.getProperty("browser");
Utils.baseURL = System.getProperty("url");
Utils.reportDir = System.getProperty("reportdir");
this.attemptNumber = System.getProperty("attemptNumber");
Utils.product = System.getProperty("product");
String group = System.getProperty("group");
/*
        String browser="cr";
        Utils.baseURL="https://llui1.qa2.marchex.com:8384/avenger";
        Utils.reportDir="reports/ui.acceptance.cr/run1";
        this.attemptNumber="1";
        Utils.product="ui";
        String group="acceptance";
*/
                        try {
                            reportFile = new File(reportDir + "/../report.htm");
                            //reportFile = new File(reportDir + "/../../../etc/report.htm");
                            if (!reportFile.exists()) {
                                throw new IOException("Blank 'report.htm' file was not found");
                            } else {
                                reportDoc = (new Builder()).build(reportFile);
                                reportRoot = reportDoc.getRootElement();
                            }

                        } catch (IOException e) {
                            System.out.println("Failed to read report files:" + System.getProperty("line.separator"));
                            e.printStackTrace();
                        } catch (ValidityException e) {
                            System.out.println("Failed to parse report files:" + System.getProperty("line.separator"));
                            e.printStackTrace();
                        } catch (ParsingException e) {
                            System.out.println("Failed to parse report files:" + System.getProperty("line.separator"));
                            e.printStackTrace();
                        }

                        if (browser == null || Utils.baseURL == null)
                            fail("Failed to initialize, 'browser' or 'url' are null");

                        if (browser.equals("firefox") || browser.equals("ff")) {
                            drv = new FirefoxDriver();
                            isFirefox = true;
                            browser = "Mozilla Firefox";
                            drv.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

                        } else if (browser.equals("iexplore") || browser.equals("iexploreproxy") || browser.equals("ie")) {
                            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                            caps.setCapability("platform", "Windows 2012");
                            caps.setCapability("version", "10");
                            drv = new InternetExplorerDriver(caps);
                            isIE = true;
                            browser = "Internet Explorer";


                        } else if (browser.equals("chrome") || browser.equals("cr")) {
                            ChromeOptions options = new ChromeOptions();
                            options.addArguments("--start-maximized");

                            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                            capabilities.setCapability("nativeEvents", false);

                            drv = new ChromeDriver(capabilities);
                            isChrome = true;
                            browser = "Google Chrome";
                        } else
                            Utils.fail(browser + Constants.INVALIDBROWSERSTRING_ERROR_MESSAGE + ": " + browser);

                        if (attemptNumber.equals("1")) {
                            ((Element) reportRoot.query("//servername").get(0)).appendChild(new Text(System.getProperty("servername") + " (" + Utils.baseURL + ")"));
                            ((Element) reportRoot.query("//browser").get(0)).appendChild(new Text(browser));
                            ((Element) reportRoot.query("//group").get(0)).appendChild(new Text(group));
                        }

                        ((Element) reportRoot.query("//run" + attemptNumber + "//start").get(0)).appendChild(new Text(Calendar.getInstance().getTime().toString()));
                        ((Element) reportRoot.query("//run" + attemptNumber + "//div").get(0)).addAttribute(new Attribute("style", ""));

                        writeReport();

                        if (!isChrome) maximizeWindow();
                        drv.get(Utils.baseURL);

                        resetAdminCredentials();

                        wait = new WebDriverWait(drv, Constants.WAIT_TIMEOUT);
                        wait_short = new WebDriverWait(drv, Constants.WAIT_TIMEOUT_SHORT);
                        wait_long = new WebDriverWait(drv, Constants.WAIT_TIMEOUT_LONG);
                    }

                    @Override
                    public void onExecutionFinish() {
                        ((Element) reportRoot.query("//run" + attemptNumber + "//finish").get(0)).appendChild(new Text(Calendar.getInstance().getTime().toString()));
                        writeReport();

                        drv.quit();
                    }

                    @Override
                    public void onTestFailure(ITestResult result) {
                        if (result.getThrowable() instanceof SkipException) {
                            result.setStatus(ITestResult.SUCCESS);
                            writeTestResultToReport(result);
                            super.onTestSuccess(result);
                        } else {
                            writeTestResultToReport(result);
                            super.onTestFailure(result);
                        }
                    }

                    @Override
                    public void onTestSkipped(ITestResult result) {
                        writeTestResultToReport(result);
                        super.onTestSkipped(result);
                    }

                    @Override
                    public void onTestSuccess(ITestResult result) {
                        writeTestResultToReport(result);
                        super.onTestSuccess(result);
                    }

                    @Override
                    public void onConfigurationFailure(ITestResult result) {
                        writeTestResultToReport(result);
                        super.onConfigurationFailure(result);
                    }

                    @Override
                    public void onConfigurationSkip(ITestResult result) {
                        writeTestResultToReport(result);
                        super.onConfigurationSkip(result);
                    }


                    public static void resetAdminCredentials() {
                        login = "Dev_Super";
                        pass = "Password23";
                        //login = System.getProperty("login.admin_username");
                        //pass = System.getProperty("login.admin_password");
                    }



                    public static enum _Condition {
                        less,
                        notGreater,
                        equals,
                        notLess,
                        greater
                    }


                    public static void maximizeWindow() {
                        drv.manage().window().setPosition(new Point(0, 0));
                        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
                        drv.manage().window().setSize(dim);
                    }

                    public static WebDriver getDriver() {
                        return drv;
                    }



                    public static void setDriver(WebDriver driver) {
                        drv = driver;
                        wait = new WebDriverWait(drv, Constants.WAIT_TIMEOUT);
                        wait_short = new WebDriverWait(drv, Constants.WAIT_TIMEOUT_SHORT);
                        wait_long = new WebDriverWait(drv, Constants.WAIT_TIMEOUT_LONG);
                    }

                    public static void failIfChrome() throws SkipException {
                        if (isChrome)
                            skip();
                    }

                    public static void waitForAsyncScript() {
                        try {
                            (new WebDriverWait(drv, Constants.WAIT_TIMEOUT_LONG, 50)).until(new ExpectedCondition<Boolean>() {
                                @Override
                                public Boolean apply(@Nullable WebDriver webDriver) {
                                    return (Boolean) ((JavascriptExecutor) drv).executeScript("return jQuery.active==0;");
                                }
                            });
                        } catch (WebDriverException e) {
                            if (e instanceof TimeoutException)
                                throw new TimeoutException("Timed out async script");
                        }
                    }

                    public static void login() {
                        login(login, pass);
                    }

                    public static void login(final String login, final String pass) {
                        int attempts = 0;
                        while (attempts < 5) {
                            try {
                                wait_long.until(new ExpectedCondition<Boolean>() {
                                    @Override
                                    public Boolean apply(@Nullable WebDriver webDriver) {
                                        try {
                                            wait_short.until(ExpectedConditions.visibilityOfElementLocated(By.id(Constants.LOGIN_USERNAME_ID))).sendKeys(login);
                                            wait_short.until(ExpectedConditions.visibilityOfElementLocated(By.id(Constants.LOGIN_PASSWORD_ID))).sendKeys(pass);
                                            wait_short.until(ExpectedConditions.visibilityOfElementLocated(By.id(Constants.LOGIN_BUTTON_ID))).click();
                                            wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.SIGNOUT_LINK_TEXT)));
                                            return true;
                                        } catch (WebDriverException e) {
                                            try {
                                                wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.SIGNOUT_LINK_TEXT))).click();
                                            } catch (WebDriverException e1) {
                                                drv.navigate().to(Constants.LOGINPAGE_URL);
                                            }
                                            return false;
                                        }
                                    }
                                });
                                return;
                            } catch (TimeoutException e) {
                                System.err.println("Login attempt #" + (attempts + 1) + " failed...");
                                attempts++;
                            }
                        }
                    }

                    public static void logout() {

                        int attempts = 0;

                        while (attempts < 5) {
                            try {
                                wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.SIGNOUT_LINK_TEXT))).click();
                                wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.LOGIN_USERNAME_ID)));
                                return;
                            } catch (TimeoutException e) {
                                attempts++;
                                System.err.println("Logout attempt #" + (attempts) + " failed...");
                                try {
                                    drv.findElement(By.linkText(Constants.SIGNOUT_LINK_TEXT));
                                } catch (WebDriverException e1) {
                                    drv.navigate().to(Constants.LOGINPAGE_URL);
                                }
                                continue;
                            } catch (WebDriverException e) {
                                continue;
                            }
                        }
                        fail("Could not log out");
                    }

                    public static void assertCondition(final boolean actual, final boolean expected, String message) {
                        try {
                            Assert.assertEquals(actual, expected);
                        } catch (AssertionError e) {
                            fail(message);
                        }
                    }

                    public static void waitAndAssertCount(final String xpath, final int expected, final _Condition condition, String message) {
                        final int[] actual = {-1};
                        try {
                            wait.until(new ExpectedCondition<Boolean>() {
                                @Override
                                public Boolean apply(@Nullable WebDriver webDriver) {
                                    try {
                                        actual[0] = drv.findElements(By.xpath(xpath)).size();
                                        switch (condition) {
                                            case less:
                                                Assert.assertEquals(actual[0] < expected, true);
                                                break;
                                            case notGreater:
                                                Assert.assertEquals(actual[0] <= expected, true);
                                                break;
                                            case equals:
                                                Assert.assertEquals(actual[0] == expected, true);
                                                break;
                                            case notLess:
                                                Assert.assertEquals(actual[0] >= expected, true);
                                                break;
                                            case greater:
                                                Assert.assertEquals(actual[0] > expected, true);
                                                break;
                                        }
                                    } catch (AssertionError e) {
                                        return false;
                                    }
                                    return true;
                                }
                            });
                        } catch (TimeoutException e) {
                            fail(message + " found " + actual[0] + ", expected " + expected);
                        }
                    }

                    public static void waitUntilVisibleAndClick(final By selector) {
                        WebElement element;
                        element = wait.until(ExpectedConditions.elementToBeClickable(selector));
                        Actions builder = new Actions(drv);
                        Action clickAction = builder.click(element).build();
                        clickAction.perform();
                    }


                    public static void waitForAlert(String text) {
                        final Alert[] alert = new Alert[1];
                        wait.until(new ExpectedCondition<Boolean>() {
                            @Override
                            public Boolean apply(@Nullable WebDriver webDriver) {
                                try {
                                    alert[0] = drv.switchTo().alert();
                                } catch (NoAlertPresentException e) {
                                    return false;
                                } catch (WebDriverException e) {
                                    return false;
                                }
                                return true;
                            }
                        });

                        try {
                            Assert.assertEquals(alert[0].getText(), text);
                        } catch (AssertionError e) {
                            fail("Expected ('" + text + "') and actual ('" + alert[0].getText() + "') alert messages did not match");
                        }

                        wait.until(new ExpectedCondition<Boolean>() {
                            @Override
                            public Boolean apply(@Nullable WebDriver webDriver) {
                                try {
                                    alert[0] = drv.switchTo().alert();
                                    alert[0].accept();
                                    return false;
                                } catch (NoAlertPresentException e) {
                                    return true;
                                } catch (WebDriverException e) {
                                    return false;
                                }
                            }
                        });
                    }


                    public static void sendTextToField(By selector, String text) {
                        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));

                        int attempts = 0;

                        do {
                            element.clear();
                            element.sendKeys(text);
                            attempts++;
                        } while (attempts <= 5 && !element.getAttribute("value").equals(text));
                    }


                    private String takeScreenshot(ITestResult result) {
                        File screenshotSrc = ((TakesScreenshot) drv).getScreenshotAs(OutputType.FILE);
                        File screenshotDest = new File(reportDir + "/screenshots/" + result.getTestClass().getName() + "." + result.getName() + ".png");
                        File screenshotDir = new File(reportDir + "/screenshots");

                        if (!screenshotDir.exists()) screenshotDir.mkdirs();

                        screenshotSrc.renameTo(screenshotDest);

                        return ("run" + attemptNumber + "/screenshots/" + result.getTestClass().getName() + "." + result.getName() + ".png");
                    }


                    public static void takeSample(String name) {
                        if (drv == null || reportRoot == null || !attemptNumber.equals("1"))
                            return;

                        File screenshotSrc = ((TakesScreenshot) drv).getScreenshotAs(OutputType.FILE);
                        File screenshotDest = new File(reportDir + "/samples/" + name + ".png");
                        File screenshotDir = new File(reportDir + "/samples");

                        if (!screenshotDir.exists())
                            screenshotDir.mkdirs();

                        screenshotSrc.renameTo(screenshotDest);

                        //adding to report
                        Element entry = new Element("tr");

                        Element nameTD = new Element("td");
                        nameTD.appendChild(name);
                        entry.appendChild(nameTD);

                        Element screenshotTD = new Element("td");
                        Element screenshotLink = new Element("a");
                        screenshotLink.addAttribute(new Attribute("href", "run" + attemptNumber + "/samples/" + screenshotDest.getName()));
                        screenshotLink.addAttribute(new Attribute("target", "_blank"));
                        screenshotLink.addAttribute(new Attribute("onclick", "window.open(this.href, '_blank', 'height=' + screen.height + ',width=' + screen.width +',top=0,left=0,location=1,scrollbars=1,status=0,title=1,resizable=1,menubar=1,directories=1'); return false"));
                        screenshotLink.appendChild("view");
                        screenshotTD.appendChild(screenshotLink);
                        entry.appendChild(screenshotTD);

                        ((Element) reportRoot.query("//run" + attemptNumber + "//table[@for='samples']").get(0)).addAttribute(new Attribute("style", ""));
                        ((Element) reportRoot.query("//run" + attemptNumber + "//table[@for='samples']//tbody").get(0)).appendChild(entry);

                        writeReport();
                    }

                    private static void writeReport() {
                        FileOutputStream out = null;

                        try {
                            out = new FileOutputStream(reportFile);
                            Serializer ser = new Serializer(out);
                            ser.setIndent(4);
                            ser.write(reportDoc);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    public String writeStacktrace(ITestResult result) {
                        PrintStream printStream = null;

                        try {
                            File stacktraceFile = new File(Utils.reportDir + "/stacktraces/" + result.getTestClass().getName() + "." + result.getName() + ".txt");
                            if (!stacktraceFile.exists())
                                stacktraceFile.getParentFile().mkdirs();
                            printStream = new PrintStream(new FileOutputStream(stacktraceFile));
                        } catch (FileNotFoundException e) {
                            System.err.println("Failed to write stack trace: ");
                            e.printStackTrace();
                        }

                        result.getThrowable().printStackTrace(printStream);
                        printStream.flush();
                        printStream.close();

                        return ("run" + attemptNumber + "/stacktraces/" + result.getTestClass().getName() + "." + result.getName() + ".txt");
                    }

                    public void writeTestResultToReport(ITestResult result) {
                        Element entry = new Element("tr");

                        Element classTD = new Element("td");
                        classTD.appendChild(result.getTestClass().getName());
                        entry.appendChild(classTD);

                        Element testNameTD = new Element("td");
                        testNameTD.appendChild(result.getName());
                        entry.appendChild(testNameTD);

                        Element durationTD = new Element("td");
                        durationTD.appendChild(String.valueOf((result.getEndMillis() - result.getStartMillis()) / 1000));
                        entry.appendChild(durationTD);

                        String tableName = null;

                        switch (result.getStatus()) {
                            case ITestResult.SUCCESS:
                                if (result.getThrowable() instanceof SkipException) {
                                    tableName = "skipped";
                                    testNameTD.appendChild(" >>> WARNING: This test needs to be run manually <<<");

                                    Element stacktraceTD = new Element("td");
                                    stacktraceTD.appendChild("N/A");
                                    entry.appendChild(stacktraceTD);

                                    Element screenshotTD = new Element("td");
                                    screenshotTD.appendChild("N/A");
                                    entry.appendChild(screenshotTD);
                                } else
                                    tableName = "passed";
                                break;
                            case ITestResult.FAILURE:
                            case ITestResult.SKIP:
                                tableName = (result.getStatus() == ITestResult.FAILURE ? "failed" : "skipped");

                                Element screenshotTD = new Element("td");
                                Element screenshotLink = new Element("a");
                                screenshotLink.addAttribute(new Attribute("href", takeScreenshot(result)));
                                screenshotLink.addAttribute(new Attribute("target", "_blank"));
                                screenshotLink.addAttribute(new Attribute("onclick", "window.open(this.href, '_blank', 'height=' + screen.height/2 + ',width=' + screen.width/2 +',top=0,left=0,location=1,scrollbars=1,status=0,title=1,resizable=1,menubar=1,directories=1'); return false"));
                                screenshotLink.appendChild("view");
                                screenshotTD.appendChild(screenshotLink);
                                entry.appendChild(screenshotTD);

                                Element stacktraceTD = new Element("td");
                                entry.appendChild(stacktraceTD);
                                if (result.getThrowable() != null) {
                                    Element stacktraceLink = new Element("a");
                                    stacktraceLink.addAttribute(new Attribute("href", writeStacktrace(result)));
                                    stacktraceLink.addAttribute(new Attribute("target", "_blank"));
                                    stacktraceLink.addAttribute(new Attribute("onclick", "window.open(this.href, '_blank', 'height=' + screen.height/2 + ',width=' + screen.width/2 +',top=0,left=0,location=1,scrollbars=1,status=0,title=1,resizable=1,menubar=1,directories=1'); return false"));
                                    stacktraceLink.appendChild("view");
                                    stacktraceTD.appendChild(stacktraceLink);
                                } else {
                                    stacktraceTD.appendChild("N/A");
                                }
                                break;
                        }

                        ((Element) reportRoot.query("//run" + attemptNumber + "//table[@for='" + tableName + "']").get(0)).addAttribute(new Attribute("style", ""));
                        ((Element) reportRoot.query("//run" + attemptNumber + "//table[@for='" + tableName + "']//tbody").get(0)).appendChild(entry);

                        writeReport();
                    }



                    public static void fail(String message) {
                        throw new AssertionError(message);
                    }

                    public static void skip() throws SkipException {
                        throw new SkipException();
                    }

                    public static class SkipException extends Throwable {
                        @Override
                        public String getMessage() {
                            return "This test is not supported by this browser. Please, perform it manually";
                        }
                    }

                    public static boolean isElementPresent(By by) {
                        try {
                            drv.findElement(by);
                            return true;
                        } catch (NoSuchElementException e) {
                            return false;
                        }
                    }



                    public static void getTime() {
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                        }
                    }


                    public static void  goToMCP(){
                        sendTextToField(By.id(Constants.MARCHEX_CID_ID), "27");
                        sendTextToField(By.id(Constants.MARCHEX_AID_ID), "67092");
                        drv.findElement(By.id(Constants.ACCOUNT_SEARCH_BUTTON_ID)).submit();
                        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.SEARCH_ACCOUNT_NAME))).click();
                        wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.EDITORIAL_TAB_ID))).click();
                        wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.GOOGLE_ADWORDS_EDIT_ID))).click();
                        getTime();

                        for (String handle : drv.getWindowHandles()) {
                            drv.switchTo().window(handle);
                        }

                        if (!wait_long.until(ExpectedConditions.visibilityOfElementLocated(By.className(Constants.GOOGLE_CLASS_NAME))).getText().equals(Constants.GOOGLE_TEXT)) {
                            Utils.fail("MCP Main page is not open");
                        }

                    }




}