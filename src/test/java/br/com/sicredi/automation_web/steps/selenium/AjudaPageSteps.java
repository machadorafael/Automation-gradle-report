package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.AjudaPage;
import cucumber.api.java.pt.Entao;

public class AjudaPageSteps {

    @Entao("devo conseguir acessar o menu Ajuda")
    public void acessaMenuAjuda() {
        AjudaPage ajudaPage = new AjudaPage();
        ajudaPage.acessaAjuda();
    }

}
