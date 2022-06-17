import model.Conta.Conta;
import model.Conta.ContaCorrente;
import model.Conta.ContaPoupanca;
import model.Conta.TipoConta;
import model.Pessoas.Cliente;
import model.Pessoas.Estagiario;
import model.Pessoas.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Login em conta de Clientes\n");
        Cliente novocliente = new Cliente("Arnaldo", LocalDate.of(1993, 11, 01),
                2142368544L, 21235424521L, "Masculino");
        ContaCorrente conta1 = new ContaCorrente(0001L, 1);
        ContaCorrente conta2 = new ContaCorrente(0002L, 1);
        novocliente.setUsuario("Arn12");
        novocliente.setSenha("55555");
        novocliente.Logar("Arn12", "55555");
        conta1.deposita(BigDecimal.valueOf(10));
        conta1.transferencia(BigDecimal.valueOf(5), conta2);
        conta1.saque(BigDecimal.valueOf(2));
        conta1.pedirLimiteCredito();
        conta1.pedirLimiteCredito();
        System.out.println("Seu limite de credito é: R$" + conta1.getLimiteCredito());
        System.out.println("Saldo da primeira conta: R$" + conta1.getSaldo());
        System.out.println("Saldo da segunda conta: R$" + conta2.getSaldo());
        novocliente.Deslogar();

        Cliente novocliente1 = new Cliente("Arlinda", LocalDate.of(1992, 10, 11),
                41228544L, 56335424521L, "Feminino");
        ContaPoupanca conta3 = new ContaPoupanca(0003L, 1);
        ContaPoupanca conta4 = new ContaPoupanca(0004L, 1);
        novocliente1.setUsuario("Arl22");
        novocliente1.setSenha("755845");
        novocliente1.Logar("Arl22", "755845");
        conta3.deposita(BigDecimal.valueOf(200));
        conta3.renderJuros(BigDecimal.valueOf(1.02));
        System.out.println("Saldo da primeira conta: R$" + conta3.getSaldo());
        System.out.println("Saldo da segunda conta: R$" + conta4.getSaldo());
        novocliente1.Deslogar();


        System.out.println("Login em conta de Funcionarios\n");
        Funcionario novofuncionario = new Funcionario("Aline", 526478594L, 12563654854L,
                1000001L, 123456L, LocalDate.of(1990, 11, 01),
                "Caixa", BigDecimal.valueOf(5000.00));
        novofuncionario.setUsuario("Aline01");
        novofuncionario.setSenha("987654");
        novofuncionario.Logar("Aline01", "987654");
        System.out.println(novofuncionario.getNome() + ", \nO seu salário é R$ " + novofuncionario.getSalario());
        System.out.println("O valor da sua PLR é R$ " + novofuncionario.calcularPLR());
        System.out.println("O valor das suas férias é R$ " + novofuncionario.calcularFerias());
        novofuncionario.Deslogar();

        Estagiario novoestagiario1 = new Estagiario("Bruno", 526452694L, 23568654854L,
                1000002L, 123442L, LocalDate.of(1991, 10, 20),
                "Caixa", BigDecimal.valueOf(1000.00));
        novoestagiario1.setUsuario("Bruno02");
        novoestagiario1.setSenha("326532");
        novoestagiario1.Logar("Bruno02", "326532");
        System.out.println(novoestagiario1.getNome() + ", \nO seu salário é R$ " + novoestagiario1.getSalario());
        System.out.println("O valor da sua PLR é R$ " + novoestagiario1.calcularPLR());
        System.out.println("O valor das suas férias é R$ " + novoestagiario1.calcularFerias());
        novoestagiario1.Deslogar();


    }
}

