package desafio_dio_banco_poo;

//abstract para impedir que ela seja instânciada
public abstract class Conta implements IConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	private static int AgenciaPadrao;
	
	private static int SEQUENCIAL = 0;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AgenciaPadrao;
		this.numero= Conta.SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo<=valor) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo = saldo - valor;
			System.out.println("Saque realizado!");
		}			
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		sacar(valor);
		//depositando em outra conta
		contaDestino.depositar(valor);
		
		
	}
	protected void imprimirInfoComuns() {		
		System.out.println(String.format("Titula	r: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d  ", this.agencia));
		System.out.println(String.format("Conta:%d ", this.numero));
		System.out.println(String.format("Saldo:%.2f ", this.saldo));
		System.out.println();
	}
}
