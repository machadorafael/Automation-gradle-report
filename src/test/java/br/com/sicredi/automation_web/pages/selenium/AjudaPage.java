package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.AjudaPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class AjudaPage extends AjudaPageElementMap {

    public AjudaPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaAjuda() {
        waitElement(menuAjuda, 5);
        moveToElement(menuAjuda);
        menuAjuda.click();
        // logPrint("Clicou no menu 'Ajuda'");
        waitElement(acessouMenuAjuda, 5);
        logPrint("Acessou o menu 'Ajuda' corretamente");
    }

}