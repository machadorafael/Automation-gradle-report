package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComprovantesPageElementMap extends BasePage {

    @FindBy(id = "menuComprovantesBtn")
    protected WebElement menuComprovantesBtn;

    @FindBy(className = "description")
    protected WebElement comprovantes;

}