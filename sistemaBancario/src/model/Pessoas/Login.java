package model.Pessoas;

import model.Conta.Conta;

import java.time.LocalDate;

public class Login {
    protected String usuario;
    protected String senha;


    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void Logar(String login, String senha) {
        if (getUsuario() == login && getSenha() == senha) {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Algo deu errado. Verifique seu login e senha");
        }
    }

    public void Deslogar(){
        System.out.println("Você saiu da conta\n");
    }
}
