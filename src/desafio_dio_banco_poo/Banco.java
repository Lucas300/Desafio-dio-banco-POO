package desafio_dio_banco_poo;

import java.util.List;

public class Banco {
	private String nome;

	List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	//metodo para exibir o nome dos clientes daquele banco especifico
	public void exibirNomesDosClientes() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Ainda não existem Clientes!");
        } else {
            for (Conta ct : contas) {
                Cliente cliente = ct.getCliente();
                if (cliente != null) {
                    System.out.println(cliente.getNome());
                } else {
                    System.out.println("Conta sem cliente associado: " + ct.getNumero());
                }
            }
        }
    }

	
	
}
