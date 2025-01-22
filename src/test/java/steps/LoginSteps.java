package steps;

import br.com.srbarriga.utils.commons.BaseTest;
import br.com.srbarriga.web.funcionalidades.LoginFuncionalidade;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class LoginSteps extends BaseTest {

    LoginFuncionalidade loginFuncionalidade;

    public LoginSteps(){
        this.loginFuncionalidade = new LoginFuncionalidade();
    }


    @Dado("^que realizo login com o usuario \"([^\"]*)\"$")
    public void queRealizoLoginComUsuario(String usuario) throws Throwable {
        this.loginFuncionalidade.loginAplicacao(usuario);

    }

    @Entao("^visualizo a mensagem de login com sucesso$")
    public void visualizoAMensagemDeLoginComSucesso() {
        Assert.assertTrue(this.loginFuncionalidade.retornaMensagemDeSucesso());
    }
}
