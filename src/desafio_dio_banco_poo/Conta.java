package desafio_dio_banco_poo;

//abstract para impedir que ela seja instânciada
public abstract class Conta implements IConta{
	private int agencia;
	private int numero;
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void sacar() {
		
	}
	
	public void deositar() {
		
	}
	public void transferir() {
		
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
