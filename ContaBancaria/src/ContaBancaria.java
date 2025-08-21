public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: R$ " + this.saldo);
    }
}
