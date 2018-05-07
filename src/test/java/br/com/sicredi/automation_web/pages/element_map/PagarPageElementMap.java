package br.com.sicredi.automation_web.pages.element_map;

import br.com.sicredi.automation_web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagarPageElementMap extends BasePage {

    @FindBy(linkText = "Pagar")
    protected WebElement menuPagar;

    @FindBy(id = "paymentDetailBillNumber")
    public WebElement pagamentos;

    @FindBy(id = "paymentDetailButton")
    public WebElement btnContinuar;

    @FindBy(id = "paymentDetailContinuarButton")
    public WebElement paymentDetailContinuarButton;

    @FindBy(id = "qrCodeNumber")
    public WebElement qrCodeNumber;

    @FindBy(id = "callbackButtonLabel")
    public WebElement btnNovoPagamento;

}