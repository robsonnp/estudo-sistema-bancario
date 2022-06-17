package model.Pessoas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Login {
    protected String nome;
    protected String sexo;
    protected String estadoCivil;
    protected Long rg;
    protected Long cpf;
    protected Long codigoFuncional;
    protected Long numCarteiraTrabalho;
    protected LocalDate dataNascimento;

    protected String cargo;

    protected BigDecimal salario;

    public Funcionario(String nome, Long rg, Long cpf, Long codigoFuncional, Long numCarteiraTrabalho,
                       LocalDate dataNascimento, String cargo, BigDecimal salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.codigoFuncional = codigoFuncional;
        this.numCarteiraTrabalho = numCarteiraTrabalho;
        this.dataNascimento = dataNascimento;
        this.cargo=cargo;
        this.salario=salario;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Long getRg() {
        return this.rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(Long codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Long getNumCarteiraTrabalho() {
        return numCarteiraTrabalho;
    }

    public void setNumCarteiraTrabalho(Long numCarteiraTrabalho) {
        this.numCarteiraTrabalho = numCarteiraTrabalho;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal calcularPLR() {
        return salario.multiply(BigDecimal.valueOf(3));
    }

    public BigDecimal calcularFerias() {
        return salario.multiply(BigDecimal.valueOf(1.3));
    }
}
