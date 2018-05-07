package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.HomePage;
import br.com.sicredi.automation_web.util.TestRule;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomePageSteps {

    @Dado("que estou na HomePage do Woop")
    public void acessarWoopHomePage() {
        TestRule.openApplicationChrome("https://www.tst.woopsicredi.com/");
    }

    @Quando("clico no botao Login")
    public void acessaLogin() {
        HomePage homePage = new HomePage();
        homePage.acessarLogin();
    }

    @Quando("estou logado")
    public void realizaLogin() {
        HomePage homePage = new HomePage();
        homePage.acessarLogin();
        homePage.efetuaLoginComDadosValidos();
    }

    @E("preencho os campos E-mail e Senha com dados validos")
    public void efetuaLoginComDadosValidos() {
        HomePage homePage = new HomePage();
        homePage.efetuaLoginComDadosValidos();
    }

    @E("preencho os campos E-mail e Senha com dados invalidos")
    public void efetuaLoginComDadosInvalidos() {
        HomePage homePage = new HomePage();
        homePage.efetuaLoginComDadosInvalidos();
    }

    @E("clico em Esqueci minha senha")
    public void esqueciMinhaSenha() {
        HomePage homePage = new HomePage();
        homePage.esqueciMinhaSenha();
    }

    @E("preencho o campo E-mail")
    public void preencherCampoEmail() {
        HomePage homePage = new HomePage();
        homePage.preencherEmailDeRecuperacao();
    }

    @E("clico no botao Enviar")
    public void clicarEmEnviar() {
        HomePage homePage = new HomePage();
        homePage.enviarRecuperacaoDeSenha();
    }

    @E("posiciono o mouse sobre o menu Saldo")
    public void mouseOverSaldo() {
        HomePage homePage = new HomePage();
        homePage.posicionaMouseSobreMenuSaldo();
    }

    @Entao("devo conseguir efetuar login corretamente")
    public void validaLoginComDadosValidos() {
        HomePage homePage = new HomePage();
        homePage.validaLoginComDadosValidos();
    }

    @Entao("nao devo conseguir efetuar login")
    public void validaLoginComDadosInvalidos() {
        HomePage homePage = new HomePage();
        homePage.validaLoginComDadosInvalidos();
    }

    @Entao("devo conseguir efetuar logout")
    public void realizaLogout() {
        HomePage homePage = new HomePage();
        homePage.realizaLogout();
    }

    @Entao("devo ser informado de que recebi um e-mail de recuperacao de senha")
    public void infoRecuperacaoDeSenha() {
        HomePage homePage = new HomePage();
        homePage.infoRecuperacaoDeSenha();
    }

    @Entao("devo conseguir visualizar meu saldo")
    public void visualizarSaldo() {
        HomePage homePage = new HomePage();
        homePage.visualizarSaldo();
    }

    @E("clico no botao Voltar")
    public void clicarEmVoltar() {
        HomePage homePage = new HomePage();
        homePage.clicarEmVoltar();
    }

    @E("clico no X")
    public void clicarNoX() {
        HomePage homePage = new HomePage();
        homePage.clicarNoX();
    }

    @E("clico em Minimizar chat")
    public void minimizarChat() {
        HomePage homePage = new HomePage();
        homePage.minimizarChat();
    }

    @E("volto para a Home")
    public void voltarParaHome() {
        HomePage homePage = new HomePage();
        homePage.voltarParaHome();
    }

    @E("acesso o Menu Perfil")
    @Entao("devo conseguir acessar o Menu Perfil")
    public void acessarMenuPerfil() {
        HomePage homePage = new HomePage();
        homePage.visualizarMenuPerfil();
    }

    @Entao("devo conseguir acessar o menu Meus dados")
    public void acessaMenuMeusDados() {
        HomePage homePage = new HomePage();
        homePage.acessaMenuMeusDados();
    }

    @Entao("devo conseguir acessar o Menu Notificacoes")
    public void acessaMenuNotificacoes() {
        HomePage homePage = new HomePage();
        homePage.acessaMenuNotificacoes();
    }

}
