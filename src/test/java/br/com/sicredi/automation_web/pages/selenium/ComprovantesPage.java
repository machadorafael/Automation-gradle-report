package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.ComprovantesPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class ComprovantesPage extends ComprovantesPageElementMap {

    public ComprovantesPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuComprovantes() {
        waitElement(menuComprovantesBtn, 3);
        menuComprovantesBtn.click();
        // logPrint("Clicou no menu 'Comprovantes'");
        waitElement(comprovantes, 3);
        wait(1);
        logPrint("Acessou a tela 'Comprovantes' corretamente");
    }

}