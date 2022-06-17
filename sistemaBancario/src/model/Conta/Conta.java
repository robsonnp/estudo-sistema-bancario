package model.Conta;

import java.math.BigDecimal;

public class Conta {
    private Integer numeroAgencia;
    private Long numeroConta;
    private BigDecimal saldo;

    //Se não consigo setar tenho que criar um construtor
    public Conta(Long numeroConta, Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = BigDecimal.ZERO;
    }


    public Long getNumeroConta() {
        return this.numeroConta;
    }

    public Integer getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public BigDecimal deposita(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    public BigDecimal saque(BigDecimal valor) {
        if (valor.compareTo(getSaldo()) <= 0) {
            this.saldo = this.saldo.subtract(valor);
            return this.saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return valor;
    }

    public BigDecimal transferencia(BigDecimal valor, Conta destino) {

        if (valor.compareTo(getSaldo()) <= 0) {
            saque(valor);
            destino.deposita(valor);
            return this.saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return valor;
    }

    public BigDecimal verSaldo() {
        System.out.println(getSaldo());
        return getSaldo();
    }


}
