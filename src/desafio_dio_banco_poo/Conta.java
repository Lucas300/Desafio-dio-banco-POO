package desafio_dio_banco_poo;

//abstract para impedir que ela seja instânciada
public abstract class Conta implements IConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private static int AgenciaPadrao;
	
	private static int SEQUENCIAL = 0;
	
	public Conta() {
		this.agencia = Conta.AgenciaPadrao;
		this.numero= Conta.SEQUENCIAL++;
		
	}
	
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
