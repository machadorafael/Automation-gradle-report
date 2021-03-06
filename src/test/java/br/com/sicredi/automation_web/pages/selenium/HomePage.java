package br.com.sicredi.automation_web.pages.selenium;

import br.com.sicredi.automation_web.pages.element_map.HomePageElementMap;
import br.com.sicredi.automation_web.util.TestRule;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends HomePageElementMap {

    public HomePage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessarLogin() {
        btnLogin.click();
        logPrint("Acessou a tela de Login");
    }

    public void efetuaLoginComDadosValidos() {
        user.sendKeys("himeneutst1@mailinator.com");
        password.sendKeys("Minhasenha123");
        logPrint("E-mail e Senha preenchidos com dados válidos");
        btnEntrar.click();
    }

    public void efetuaLoginComDadosInvalidos() {
        user.sendKeys("abcde@email.com");
        password.sendKeys("Minhasenha123");
        logPrint("E-mail e Senha preenchidos com dados inválidos");
        btnEntrar.click();
    }

    public void validaLoginComDadosValidos() {
        waitElement(userLogado, 5);
        userLogado.isDisplayed();
        logPrint("Login efetuado corretamente");
    }

    public void validaLoginComDadosInvalidos() {
        waitElement(dadosIncorretos, 5);
        dadosIncorretos.isDisplayed();
        logPrint("Login não efetuado. Dados Incorretos");

    }

    public void realizaLogout() {
        waitElement(userLogado, 5);
        userLogado.click();
        logPrint("Clicou no Menu do Usuário");
        sair.click();
        logPrint("Clicou no botão 'Sair'. Logout efetuado corretamente");
    }

    public void esqueciMinhaSenha() {
        esqueciMinhaSenha.click();
        logPrint("Clicou no link 'Esqueci minha senha'");
    }

    public void preencherEmailDeRecuperacao() {
        user.sendKeys("ohpaiii@mailinator.com");
        logPrint("E-mail preenchido corretamente");
    }

    public void enviarRecuperacaoDeSenha() {
        enviarRecuperacaoDeSenha.click();
        logPrint("Clicou em 'Enviar'");
    }

    public void infoRecuperacaoDeSenha() {
        waitElement(infoRecuperacaoDeSenha, 3);
        logPrint("Email de recuperação de senha enviado com sucesso");
    }

    public void posicionaMouseSobreMenuSaldo() {
        waitElement(menuSaldo, 5);
        moveToElement(menuSaldo);
        logPrint("Posicionou o mouse sobre o menu 'Saldo'");
    }

    public void visualizarSaldo() {
        waitElement(visualizaSaldo, 10);
        logPrint("Visualizo meu saldo de Conta Corrente e Poupança corretamente");
    }

    public void visualizarMenuPerfil() {
        waitElement(userLogado, 5);
        userLogado.click();
        // logPrint("Clicou no Menu 'Perfil'");
        waitElement(menuPerfil, 3);
        moveToElement(menuPerfil);
        logPrint("Acessou o menu 'Perfil'");
    }

    public void acessaMenuMeusDados() {
        waitElement(acessaMenuMeusDados, 3);
        acessaMenuMeusDados.click();
        // logPrint("Clicou no menu 'Meus dados'");
        waitElement(menuMeusDados, 3);
        logPrint("Acessou o menu 'Meus dados'");
    }

    public void acessaMenuNotificacoes() {
        waitElement(acessaMenuNotificacoes, 10);
        acessaMenuNotificacoes.click();
        // logPrint("Clicou no menu 'Notificações'");
        waitElement(acessouMenuNotificacoes, 3);
        logPrint("Acessou o menu 'Notificações'");
    }

    public void clicarEmVoltar() {
        waitElement(btnVoltar, 3);
        btnVoltar.click();
        logPrint("Clicou em 'Voltar <-'");
    }

    public void clicarNoX() {
        waitElement(btnX, 3);
        btnX.click();
        logPrint("Clicou no 'X'");
    }

    public void minimizarChat() {
        waitElement(btnMinimizarChat, 3);
        btnMinimizarChat.click();
        logPrint("Minimizou o Chat");
    }

    public void voltarParaHome() {
        logoWoop.click();
        logPrint("Voltou para a Home");
    }

}