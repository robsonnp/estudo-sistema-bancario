package model.Conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal limiteCredito;

    public ContaCorrente(Long numeroConta, Integer numeroAgencia) {
        super(numeroConta, numeroAgencia);
        this.limiteCredito = BigDecimal.ZERO;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getLimiteCredito() {
        return this.limiteCredito;
    }

    public void pedirLimiteCredito() {
        this.limiteCredito = this.limiteCredito.add(BigDecimal.valueOf(100));
    }

}