package autotest.mcp;

import org.testng.TestNG;

public class Starter {
    public static void main(String[] args) {
        try {
            TestNG testng = new TestNG();
            testng.setVerbose(5);
            testng.setPreserveOrder(true);
            testng.setRandomizeSuites(false);
            testng.setOutputDirectory("reports");
            testng.setTestClasses(new Class[]{

                    GoogleCampaignTestCases.class,





            });
            testng.run();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } catch (AssertionError e) {
            System.err.println(e.getMessage());
        }
    }
}
