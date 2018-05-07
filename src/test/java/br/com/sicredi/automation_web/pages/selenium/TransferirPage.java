package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.TransferirPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class TransferirPage extends TransferirPageElementMap {

    public TransferirPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuTransferir() {
        waitElement(menuTransferir, 3);
        menuTransferir.click();
        // logPrint("Clicou no menu 'Transferir'");
        waitElement(transferirGrana, 3);
        logPrint("Acessou a tela 'Transferir Grana' corretamente");
    }

}