package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.ExtratoPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class ExtratoPage extends ExtratoPageElementMap {

    public ExtratoPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuExtrato() {
        waitElement(menuExtrato, 3);
        menuExtrato.click();
        // logPrint("Clicou no menu 'Extrato'");
        waitElement(gestaoFinanceira, 3);
        logPrint("Acessou a tela 'Gestão financeira' corretamente");
    }

}