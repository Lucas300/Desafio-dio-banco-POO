package desafio_dio_banco_poo;

public class Main {
	public static void main(String[] args) {
		Cliente Lucas = new Cliente();
		Conta cc = new ContaCorrente(Lucas);
		Lucas.setNome("Lucas");
		cc.depositar(1000);
		cc.sacar(200);
		cc.imprimirExtrato();
		
		Conta cp = new ContaPoupanca(Lucas);
		cp.depositar(1000);
		cp.sacar(200);
		cp.imprimirExtrato();
		
		cp.transferir(100, cc);
		cc.imprimirExtrato();
	}
}
