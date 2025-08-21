public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("92310293", "Testando da Silva", 5000.0);
        ContaBancaria conta2 = new ContaBancaria("23102934", "Testando da Costa", 3940.0);

        conta1.depositar(2000);
        conta1.sacar(500);
        conta1.consultarSaldo();

        conta2.depositar(1000);
        if(!conta2.sacar(5000)) {
            System.out.println("Saldo insuficiente. Transação cancelada");
        }
        conta2.consultarSaldo();

    }
}
