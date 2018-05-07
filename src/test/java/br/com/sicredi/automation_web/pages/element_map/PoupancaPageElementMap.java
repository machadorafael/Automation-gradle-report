package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoupancaPageElementMap extends BasePage {

    @FindBy(id = "menuPoupancaBtn")
    protected WebElement menuPoupancaBtn;

    @FindBy(className = "accountInfo")
    protected WebElement poupanca;

}