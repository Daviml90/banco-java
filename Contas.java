import java.util.ArrayList;

public class Contas {
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;

    protected ArrayList<String> transacoes = new ArrayList<>();

    protected int numero = SEQUENCIAL++;
    protected double saldo;
    protected Cliente cliente;
    protected int agencia = AGENCIA_PADRAO;



    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void extrato(){

    };

    public void depositar(double valor){
        this.saldo += valor;
        transacoes.add(String.format("Depósito:(+)%.2f", valor));
    }
    
    public void sacar(double valor){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }
        else{
        this.saldo -= valor;
        transacoes.add(String.format("Saque: (-)%.2f", valor));
        }
    }

    public void transferir(double valor, Contas conta){
        this.saldo -= valor;
        conta.saldo += valor;
        transacoes.add(String.format("Transferência: (-)%.2f \npara conta(n: %s)", valor, conta.numero));
        conta.transacoes.add(String.format("Transferência: (+)%.2f \nda conta(n: %s)", valor, numero));
    }
}
