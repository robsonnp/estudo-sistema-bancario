package model.Pessoas;

import model.Conta.Conta;

import java.time.LocalDate;
import java.time.ZoneId;


public class Cliente extends Login {
    private String nome;
    private LocalDate dataNascimento;
    private Long rg;
    private Long cpf;
    private String sexo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getRg() {
        return this.rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Long getCpf() {
        return this.cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public Cliente(String nome, LocalDate dataNascimento, Long rg, Long cpf, String sexo){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
    }

//    public void abrirConta(Enum<model.Conta.TipoConta> razao, Long numeroConta, int numeroAgencia) {
//        model.Conta.Conta conta = new model.Conta.Conta();
//        conta.razao = razao;
//        conta.numeroConta = numeroConta;
//        conta.numeroAgencia = numeroAgencia;
//        conta.saldo = BigDecimal.ZERO;
//        this.conta = conta;
//
//    }
}
