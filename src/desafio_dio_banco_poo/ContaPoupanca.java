package desafio_dio_banco_poo;



public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--Extrato conta Poupança--");
		super.imprimirInfoComuns();
	}
	
	
}
