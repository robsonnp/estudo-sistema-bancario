package model.Pessoas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome, Long rg, Long cpf, Long codigoFuncional, Long numCarteiraTrabalho, LocalDate dataNascimento, String cargo, BigDecimal salario) {
        super(nome, rg, cpf, codigoFuncional, numCarteiraTrabalho, dataNascimento, cargo, salario);
    }

    public BigDecimal calcularPLR() {
        return salario.multiply(BigDecimal.valueOf(4));
    }
}
