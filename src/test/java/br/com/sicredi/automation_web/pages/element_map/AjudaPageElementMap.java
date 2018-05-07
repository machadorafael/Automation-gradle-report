package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AjudaPageElementMap extends BasePage {

    @FindBy(id = "ubots-webchat-icon")
    protected WebElement menuAjuda;

    @FindBy(className = "format-markdown")
    protected WebElement acessouMenuAjuda;

}