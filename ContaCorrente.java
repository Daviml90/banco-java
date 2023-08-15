

public class ContaCorrente extends Contas {

public ContaCorrente (Cliente cliente) {
    this.cliente = cliente;
    this.agencia = super.agencia;
    this.numero = super.numero;
    this.saldo = 0;
}



public void extrato() {
    System.out.println("======= EXTRATO ========");
    System.out.println("(Conta Corrente)");
    System.out.println(String.format("Usuário: %s", cliente.getNome()));
    System.out.println(String.format("Agência: %d", agencia));
    System.out.println(String.format("Número: %d", numero));
        if (this.transacoes.size() > 0) {
        System.out.println("====== TRANSAÇÕES ======");
        for (String i:this.transacoes) {
            System.out.println(i);
        }
    }
    System.out.println("------------------------");
    System.out.println(String.format("Saldo: %.2f", saldo));
    
}
}
