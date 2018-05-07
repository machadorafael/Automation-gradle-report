package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.PagarPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class PagarPageSteps {

    @E("acesso o menu Pagamentos")
    @Entao("devo conseguir acessar o menu Pagar e visualizar a tela Pagamentos")
    public void acessaMenuPagar() {
        PagarPage pagarPage = new PagarPage();
        pagarPage.acessaMenuPagar();
    }

    @Entao("devo conseguir efetuar pagamentos")
    public void efetuarPagamentos() {
        PagarPage pagarPage = new PagarPage();
        pagarPage.efetuarPagamentos();
    }

}
