package br.com.srbarriga.web.funcionalidades.users.utils;

public enum UserCredentials implements Credentials {

    USUARIO_TESTE("teste"){
        @Override
        public String user() {
            return "marcelo.ribelato@yaman.com.br";
        }

        @Override
        public String password() {
            return "15975321";
        }

        @Override
        public String nome() {
            return "MARCELO RIBELATO";
        }
    }
    ;

    UserCredentials(String value) {
    }
}
