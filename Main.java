public class Main {
    public static void main(String[] args) throws Exception {
        Cliente davi = new Cliente("Davi", "7809");
        Contas contaCorrente = new ContaCorrente(davi);
        Contas contaPoupanca = new ContaPoupanca(davi);
        Cliente mae = new Cliente("Angela", "8979");
        Contas contaCorrente2 = new ContaCorrente(mae);

        contaCorrente.extrato();
        contaCorrente.depositar(400);
        contaCorrente.sacar(30);
        contaCorrente.transferir(34.99, contaPoupanca);
        contaCorrente.transferir(200.50, contaCorrente2);
        contaCorrente.extrato();
        contaCorrente2.extrato();
    }
}
