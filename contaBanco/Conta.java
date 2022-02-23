package luizreis.com.github.banco;

public class Conta {
	
	//atributos
	String tipoConta;
	String nome;
	Double saldo;
	Double saque;
	Double deposito;
	
	//construtor
	public Conta(String tipoConta, String nome, Double saldo) {		
		this.tipoConta = tipoConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//método saque
	public void Saque(Double saldo, Double saque) {
		if (this.tipoConta == "Pf") {
			saldo = saldo * 0.01;
		}else {
			saldo = saldo * 0.02;
		}
	}
	
	
}
