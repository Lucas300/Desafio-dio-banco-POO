package desafio_dio_banco_poo;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--Extrato conta Corrente--");
		super.imprimirInfoComuns();
	}
	
	
	
}

