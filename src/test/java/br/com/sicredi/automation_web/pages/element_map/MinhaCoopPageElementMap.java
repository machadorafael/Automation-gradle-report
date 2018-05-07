package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MinhaCoopPageElementMap extends BasePage {

    @FindBy(linkText = "Minha Cooperativa")
    protected WebElement menuMinhaCoopBtn;

    @FindBy(className = "coop-name")
    protected WebElement minhaCoop;

}