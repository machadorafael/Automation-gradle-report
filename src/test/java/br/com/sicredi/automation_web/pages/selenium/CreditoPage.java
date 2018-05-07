package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.CreditoPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class CreditoPage extends CreditoPageElementMap {

    public CreditoPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuCredito() {
        waitElement(menuCreditosBtn, 3);
        menuCreditosBtn.click();
        // logPrint("Clicou no menu 'Crédito'");
        waitElement(credito, 3);
        wait(2);
        logPrint("Acessou a tela 'Crédito' corretamente");
    }

}