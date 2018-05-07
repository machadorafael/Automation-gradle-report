package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtratoPageElementMap extends BasePage {

    @FindBy(linkText = "Extrato")
    protected WebElement menuExtrato;

    @FindBy(id = "buscaQuery")
    public WebElement gestaoFinanceira;

}