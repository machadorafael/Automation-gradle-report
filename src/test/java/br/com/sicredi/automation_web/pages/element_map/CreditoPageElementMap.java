package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditoPageElementMap extends BasePage {

    @FindBy(id = "menuCreditoBtn")
    protected WebElement menuCreditosBtn;

    @FindBy(className = "inner-credit")
    protected WebElement credito;

}