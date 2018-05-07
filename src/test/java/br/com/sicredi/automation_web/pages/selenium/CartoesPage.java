package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.CartoesPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class CartoesPage extends CartoesPageElementMap {

    public CartoesPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuCartoes() {
        waitElement(menuCartoesBtn, 3);
        menuCartoesBtn.click();
        // logPrint("Clicou no menu 'Cartões'");
        waitElement(cartoes, 3);
        wait(1);
        logPrint("Acessou a tela 'Cartões' corretamente");
    }

}