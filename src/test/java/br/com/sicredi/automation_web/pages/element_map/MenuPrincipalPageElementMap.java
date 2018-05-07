package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPrincipalPageElementMap extends BasePage {

    @FindBy(className = "burger")
    protected WebElement menuPrincipal;

    @FindBy(className = "close-menu")
    protected WebElement acessouMenuPrincipal;

    // Links do Menu
    @FindBy(id = "menuPagamentosBtn")
    protected WebElement menuPagamentosBtn;

    @FindBy(id = "menuExtratoBtn")
    protected WebElement menuExtratoBtn;

    @FindBy(id = "menuTransferenciaBtn")
    protected WebElement menuTransferenciaBtn;

    @FindBy(id = "menuCartoesBtn")
    protected WebElement menuCartoesBtn;

    @FindBy(id = "menuComprovantesBtn")
    protected WebElement menuComprovantesBtn;

    @FindBy(id = "menuCreditoBtn")
    protected WebElement menuCreditoBtn;

    @FindBy(id = "menuPoupancaBtn")
    protected WebElement menuPoupancaBtn;

    @FindBy(linkText = "Minha Cooperativa")
    protected WebElement menuMinhaCoopBtn;
    //

}