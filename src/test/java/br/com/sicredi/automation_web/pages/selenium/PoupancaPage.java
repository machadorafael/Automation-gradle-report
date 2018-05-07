package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.PoupancaPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class PoupancaPage extends PoupancaPageElementMap {

    public PoupancaPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuPoupanca() {
        waitElement(menuPoupancaBtn, 3);
        wait(1);
        menuPoupancaBtn.click();
        // logPrint("Clicou no menu 'Poupança'");
        waitElement(poupanca, 3);
        logPrint("Acessou a tela 'Poupança' corretamente");
    }

}