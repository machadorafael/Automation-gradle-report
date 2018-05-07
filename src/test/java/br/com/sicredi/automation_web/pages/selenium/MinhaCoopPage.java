package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.MinhaCoopPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class MinhaCoopPage extends MinhaCoopPageElementMap {

    public MinhaCoopPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuMinhaCoop() {
        waitElement(menuMinhaCoopBtn, 3);
        menuMinhaCoopBtn.click();
        // logPrint("Clicou no menu 'Minha Cooperativa'");
        waitElement(minhaCoop, 3);
        logPrint("Acessou a tela 'Minha Cooperativa' corretamente");
    }

}