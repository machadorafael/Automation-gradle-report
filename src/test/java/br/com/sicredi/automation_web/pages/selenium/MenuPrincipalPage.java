package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.MenuPrincipalPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class MenuPrincipalPage extends MenuPrincipalPageElementMap {

    PagarPage menuPagamentos = new PagarPage();
    ExtratoPage menuExtrato = new ExtratoPage();
    TransferirPage menuTransferencia = new TransferirPage();
    CartoesPage menuCartoes = new CartoesPage();
    ComprovantesPage menuComprovantes = new ComprovantesPage();
    CreditoPage menuCredito = new CreditoPage();
    PoupancaPage menuPoupanca = new PoupancaPage();
    MinhaCoopPage menuMinhaCoop = new MinhaCoopPage();

    public MenuPrincipalPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuPrincipal() {
        waitElement(menuPrincipal, 5);
        menuPrincipal.click();
        // logPrint("Clicou no 'Menu'");
        waitElement(acessouMenuPrincipal, 3);
        logPrint("Acessou o 'Menu Principal' corretamente");
    }

    public void acessaMenuPagamentos() {
        waitElement(menuPagamentosBtn, 3);
        menuPagamentosBtn.click();
        // logPrint("Clicou no menu 'Pagamentos'");
        waitElement(menuPagamentos.pagamentos, 3);
        logPrint("Acessou o menu 'Pagamentos' corretamente");
    }

    public void acessaMenuExtrato() {
        waitElement(menuExtratoBtn, 3);
        menuExtratoBtn.click();
        // logPrint("Clicou no menu 'Saldo e Extrato'");
        waitElement(menuExtrato.gestaoFinanceira, 3);
        logPrint("Acessou o menu 'Saldo e Extrato' corretamente");
    }

    public void acessaMenuTransferencia() {
        waitElement(menuTransferenciaBtn, 3);
        menuTransferenciaBtn.click();
        // logPrint("Clicou no menu 'Transferência'");
        waitElement(menuTransferencia.transferirGrana, 3);
        logPrint("Acessou o menu 'Transferência' corretamente");
    }

    public void acessaMenuCartoes() {
        menuCartoes.acessaMenuCartoes();
    }

    public void acessaMenuComprovantes() {
        menuComprovantes.acessaMenuComprovantes();
    }

    public void acessaMenuCredito() {
        menuCredito.acessaMenuCredito();
    }

    public void acessaMenuPoupanca() {
        menuPoupanca.acessaMenuPoupanca();
    }

    public void acessaMenuMinhaCoop() {
        menuMinhaCoop.acessaMenuMinhaCoop();
    }

}