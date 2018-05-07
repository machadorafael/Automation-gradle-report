package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.ExtratoPage;
import cucumber.api.java.pt.Entao;

public class ExtratoPageSteps {

    @Entao("devo conseguir acessar o menu Extrato e visualizar a tela Gestao financeira")
    public void acessaMenuExtrato() {
        ExtratoPage extratoPage = new ExtratoPage();
        extratoPage.acessaMenuExtrato();
    }

}
