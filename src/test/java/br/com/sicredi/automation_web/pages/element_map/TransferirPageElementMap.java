package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferirPageElementMap extends BasePage {

    @FindBy(linkText = "Transferir")
    protected WebElement menuTransferir;

    @FindBy(id = "autocompleteInput")
    public WebElement transferirGrana;

}