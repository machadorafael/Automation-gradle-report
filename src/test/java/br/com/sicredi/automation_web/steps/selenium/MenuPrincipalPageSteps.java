package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.MenuPrincipalPage;
import cucumber.api.java.pt.Entao;

public class MenuPrincipalPageSteps {

    @Entao("devo conseguir acessar o Menu Principal")
    public void acessaMenuPrincipal() {
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuPrincipal();
    }

    @Entao("devo conseguir acessar o Menu Pagamentos")
    public void acessaMenuPagamentos() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuPagamentos();
    }

    @Entao("devo conseguir acessar o Menu Saldo e Extrato")
    public void acessaMenuExtrato() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuExtrato();
    }

    @Entao("devo conseguir acessar o Menu Transferencia")
    public void acessaMenuTransferencia() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuTransferencia();
    }

    @Entao("devo conseguir acessar o Menu Cartoes")
    public void acessaMenuCartoes() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuCartoes();
    }

    @Entao("devo conseguir acessar o Menu Comprovantes")
    public void acessaMenuComprovantes() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuComprovantes();
    }

    @Entao("devo conseguir acessar o Menu Credito")
    public void acessaMenuCredito() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuCredito();
    }

    @Entao("devo conseguir acessar o Menu Poupanca")
    public void acessaMenuPoupanca() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuPoupanca();
    }

    @Entao("devo conseguir acessar o Menu Minha Cooperativa")
    public void acessaMenuMinhaCoop() {
        acessaMenuPrincipal();
        MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();
        menuPrincipalPage.acessaMenuMinhaCoop();
    }

}
