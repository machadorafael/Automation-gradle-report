package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.PagarPageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class PagarPage extends PagarPageElementMap {

    public PagarPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessaMenuPagar() {
        waitElement(menuPagar, 3);
        menuPagar.click();
        // logPrint("Clicou no menu 'Pagar'");
        waitElement(pagamentos, 3);
        logPrint("Acessou a tela 'Pagamentos' corretamente");
    }

    public void efetuarPagamentos() {
        pagamentos.sendKeys("836300000004000100672021006232710217003077910176");
        logPrint("Preencheu o código do boleto");
        btnContinuar.click();
        logPrint("Clicou em 'Continuar'");
        paymentDetailContinuarButton.click();
        waitElement(qrCodeNumber, 3);
        qrCodeNumber.sendKeys("000000");
        logPrint("Informou QR Code corretamente");
        waitElement(btnNovoPagamento, 5);
        logPrint("Pagamento concluído corretamente");
    }

}