package br.com.sicredi.automation_web.util;

import br.com.sicredi.automation_web.pages.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.App;
import org.sikuli.script.Screen;

import java.io.File;
import java.util.HashMap;

public class TestRule extends TestWatcher {

    private static WebDriver webDriver;
    private static Screen sikuli;
    private static App sikuliApp;
    private static EvidenceReport evidenceReport;
    private static ExtentReports extentReport;
    private static Scenario scenario;
    private static ExtentTest extentTest;
    private static Logger logger = Logger.getLogger(TestRule.class);
    private static String activeAutomation;

    public TestRule() {
        super();
    }

    @Override
    protected void starting(Description description) {
        super.starting(description);

        // EXTENTREPORT
        new File("target/relatorios").mkdir();
        new File("target/relatorios/img").mkdir();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
                "target/relatorios/" + description.getDisplayName().replace("tests.", "") + ".html");
        extentReport = new ExtentReports();
        extentReport.attachReporter(htmlReporter);
        extentReport.setSystemInfo("test.base_url", Utils.getTestProperty("test.base_url"));
        extentReport.setSystemInfo("test.application", Utils.getTestProperty("test.application"));
        extentReport.setSystemInfo("os.name", System.getProperty("os.name"));
    }

    @Before
    public void beforeCenario(Scenario scenario) {
        this.scenario = scenario;

        // INICIA EVIDENCIAS
        evidenceReport = new EvidenceReport();

        // INICIA EXTENTTEST
        extentTest = extentReport.createTest("Cenario: " + scenario.getName(), scenario.getName());
    }

    @After
    public void afterCenario() {
        if (scenario.isFailed()) {
            if (webDriver != null) {
                BasePage basePage = new BasePage();
                basePage.logPrintFail("Status: O Teste Falhou");
            }
        }
        // else {
        // BasePage basePage = new BasePage();
        // basePage.logPrint("Status: O Teste Passou");
        // }

        // FINALIZA EVIDENCIAS
        // evidenceReport.generateEvidenceReport(evidenceReport.getEvidenceReport(),
        // scenario.getName(),
        // scenario.getName(), scenario.getName());

        // FINALIZA EXTENT REPORT
        extentReport.flush();

        // FINALIZA DRIVER

        WebDriver driver = TestRule.getDriver();

        if (driver != null) {
            driver.close();
            driver.quit();
        }

    }

    @Override
    protected void finished(Description description) {
        super.finished(description);
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static ExtentTest getExtentTest() {
        return extentTest;
    }

    public static Scenario getScenario() {
        return scenario;
    }

    public static EvidenceReport getEvidenceReport() {
        return evidenceReport;
    }

    public static Screen getSikuli() {
        return sikuli;
    }

    public static ExtentReports getExtentReports() {
        return extentReport;
    }

    public static String getActiveAutomation() {
        return activeAutomation;
    }

    public static void openApplication(String application, String url) {
        switch (application) {
            case "chrome":
                openApplicationChrome(url);
                break;
            case "responsivo":
                openApplicationChromeMobile(url);
                break;
            default:
                System.err.print(
                        "Property test.application: " + Utils.getTestProperty("test.application") + " nao encontrada.");
                break;
        }
    }

    public static void openApplicationChrome(String url) {
        WebDriverManager.chromedriver().setup();
        activeAutomation = "chrome";
        String downloadFilepath = System.getProperty("user.dir") + "/target/temp";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefs.put("credentials_enable_service", false);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("disable-infobars");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

        options.merge(capabilities);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        TestRule.webDriver = driver;
    }

    public static void openApplicationChromeMobile(String url) {
        WebDriverManager.chromedriver().setup();
        activeAutomation = "responsivo";
        String downloadFilepath = System.getProperty("user.dir") + "/target/temp";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefs.put("credentials_enable_service", false);
        ChromeOptions options = new ChromeOptions();
        // options.setExperimentalOption("prefs", chromePrefs);

        options.addArguments("headless");
        options.addArguments("window-size=1024x768");

        options.addArguments("disable-infobars");
        options.addArguments("--disable-print-preview");

        // Map<String, String> mobileEmulation = new HashMap<String, String>();
        // mobileEmulation.put("deviceName", "Nexus 5");
        // DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        // options.setExperimentalOption("mobileEmulation", mobileEmulation);
        //
        // capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(options);
        // driver.manage().window().maximize();
        driver.navigate().to(url);
        TestRule.webDriver = driver;
    }

}