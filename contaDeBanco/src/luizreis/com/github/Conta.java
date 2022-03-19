package luizreis.com.github;

import luizreis.com.github.projeto.banco.interfaces.IDetalhesConta;

public class Conta implements IDetalhesConta {
	
	//ATRIBUTOS
	private String nome;
	private Double saldo;
	private String numConta;
	private String tipoConta;
	
	//GETS
	public String getNome() {
		return nome;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getNumConta() {
		return numConta;
	}

	
	//SETS
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	//CONSTRUTOR
	public Conta(String nome, Double saldo, String numConta, String tipoConta) {		
		
		this.tipoConta = tipoConta;
		this.nome = nome;
		this.saldo = saldo;
	
	}
	
	//MÉTODO DEPOSITO
	public double Deposito(double deposito) {
		return this.saldo = this.saldo + deposito;
	}
	
	//METÓDO SAQUE
		public void Saque(Double saque) {
			this.saldo = this.saldo - saque;
	}
		
	//MÉTODO DA INTERFACE - DETALHES 
	@Override
	public void detalhes() {

		System.out.println("Conta " + this.getNumConta());
		System.out.println("Titular " + this.getNome());
		System.out.println("Tipo " + this.getTipoConta());
		System.out.println("Saldo " + this.getSaldo());
		
	}
		
}