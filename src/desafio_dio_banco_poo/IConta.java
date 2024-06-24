package desafio_dio_banco_poo;

public interface IConta {
	public void sacar(double valor);
	public void deositar(double valor);
	public void transferir(double valor, IConta contaDestino);
}
