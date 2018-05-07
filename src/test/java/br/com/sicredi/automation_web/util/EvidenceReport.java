package br.com.sicredi.automation_web.util;

import com.googlecode.seleniumjavaevidence.selenium.SeleniumEvidence;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EvidenceReport {

    private List<SeleniumEvidence> evidence = null;
    private String testError = null;

    public EvidenceReport() {
        this.evidence = new ArrayList<SeleniumEvidence>();
    }

    public void setError(String errorMessage) {
        this.testError = errorMessage;
    }

    public List<SeleniumEvidence> getEvidenceReport() {
        return this.evidence;
    }

    public void addEvidence(String log, WebDriver driver) {
        try {
            evidence.add(new SeleniumEvidence(log, ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64)));
        } catch (WebDriverException e) {
            this.setError(e.toString());
            e.printStackTrace();
        } catch (Exception e) {
            this.setError(e.toString());
            e.printStackTrace();
        }
    }

    public void addEvidence(String log, String image) {
        try {
            String base24StringFromImage = Base64.encodeBase64String(FileUtils.readFileToByteArray(new File(image)));
            evidence.add(new SeleniumEvidence(log, base24StringFromImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void generateEvidenceReport(List<SeleniumEvidence> evidences, String
    // testName, String authorName,
    // String reportTitle) {
    // try {
    // GenerateEvidenceReport.generatePDFEvidence(evidences, testName, authorName,
    // reportTitle, this.testError);
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

}
