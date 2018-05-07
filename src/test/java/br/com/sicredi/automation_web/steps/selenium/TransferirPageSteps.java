package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.TransferirPage;
import cucumber.api.java.pt.Entao;

public class TransferirPageSteps {

    @Entao("devo conseguir acessar o menu Transferir e visualizar a tela Transferir Grana")
    public void acessaMenuTransferir() {
        TransferirPage transferirPage = new TransferirPage();
        transferirPage.acessaMenuTransferir();
    }

}
