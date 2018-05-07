package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMap extends BasePage {

    @FindBy(id = "landingComponentLoginButton")
    protected WebElement btnLogin;

    @FindBy(id = "loginFormInputUser")
    protected WebElement user;

    @FindBy(id = "loginFormInputPassword")
    protected WebElement password;

    @FindBy(id = "loginComponentLoginEmailSenha")
    protected WebElement btnEntrar;

    @FindBy(id = "userMenu")
    protected WebElement userLogado;

    @FindBy(className = "show-error-component")
    protected WebElement dadosIncorretos;

    @FindBy(className = "logout")
    protected WebElement sair;

    @FindBy(linkText = "Esqueci minha senha")
    protected WebElement esqueciMinhaSenha;

    @FindBy(id = "loginComponentLoginEmailSenha")
    protected WebElement enviarRecuperacaoDeSenha;

    @FindBy(xpath = "//*[@class=\"alert alert-info text-center ng-star-inserted\"]")
    protected WebElement infoRecuperacaoDeSenha;

    @FindBy(linkText = "Saldo")
    protected WebElement menuSaldo;

    @FindBy(className = "py-3")
    protected WebElement visualizaSaldo;

    @FindBy(className = "username")
    protected WebElement menuPerfil;

    @FindBy(linkText = "Meus dados")
    protected WebElement acessaMenuMeusDados;

    @FindBy(id = "emailInfo")
    protected WebElement menuMeusDados;

    @FindBy(partialLinkText = "Notificações")
    protected WebElement acessaMenuNotificacoes;

    @FindBy(className = "notification-title")
    protected WebElement acessouMenuNotificacoes;

    @FindBy(className = "back-button")
    protected WebElement btnVoltar;

    @FindBy(className = "close-profile")
    protected WebElement btnX;

    @FindBy(className = "ubots-minimize-icon")
    protected WebElement btnMinimizarChat;

    @FindBy(className = "logo")
    protected WebElement logoWoop;

}