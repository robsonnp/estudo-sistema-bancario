package model.Conta;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Long numeroConta, Integer numeroAgencia){
        super(numeroConta, numeroAgencia);
    }
    public void renderJuros(BigDecimal taxa){
//        super.getSaldo().add(BigDecimal.valueOf(taxa));
        BigDecimal saldo = super.getSaldo().multiply(taxa);
        super.deposita(saldo.subtract(getSaldo()));

    }

}