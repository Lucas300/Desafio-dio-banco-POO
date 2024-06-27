package desafio_dio_banco_poo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//adicionando clientes
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		//dando nome a cada cliente
		cliente1.setNome("Lucas");
		cliente2.setNome("Marta");
		cliente3.setNome("Matheus");
		
		//criando contas para cada cliente
		Conta cc = new ContaCorrente(cliente1);		
		Conta cp = new ContaPoupanca(cliente2);
		Conta contaP = new ContaPoupanca(cliente3);
		
		// Criação da lista de contas
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);
        contas.add(contaP);
		
        //criando um banco
		Banco banco = new Banco();
        banco.setNome("Banco");
        //setando uma conta para o banco criado
        banco.setContas(contas);

        //esse metodo ira exibir o nome dos clientes daquele banco
        banco.exibirNomesDosClientes();
        
//      Cliente Lucas = new Cliente();
//		Conta contaCorr = new ContaCorrente(Lucas);
//		Lucas.setNome("Lucas");
//		cc.depositar(1000);
//		cc.sacar(200);
//		cc.imprimirExtrato();
//		
//		Conta contaPoupa = new ContaPoupanca(Lucas);
//		cp.depositar(1000);
//		cp.sacar(200);
//		cp.imprimirExtrato();
//		
//		cp.transferir(100, cc);
//		cc.imprimirExtrato();
		
	}
}
