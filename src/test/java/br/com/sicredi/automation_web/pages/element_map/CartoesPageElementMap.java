package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartoesPageElementMap extends BasePage {

    @FindBy(id = "menuCartoesBtn")
    protected WebElement menuCartoesBtn;

    @FindBy(className = "container-fluid")
    protected WebElement cartoes;

}