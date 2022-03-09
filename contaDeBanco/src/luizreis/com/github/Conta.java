package luizreis.com.github;

public class Conta {
	
	//atributos
	String tipoConta;
	String nome;
	Double saldo;
	
	//construtor
	public Conta(String tipoConta, String nome, Double saldo) {		
		this.tipoConta = tipoConta;
		this.nome = nome;
		this.saldo = saldo;
		if (this.tipoConta != "Pf" && this.tipoConta != "Pj") {
			System.out.println("Erro: Os tipos de contas aceitos são apenas Pf ou Pj");
		}
	}
	
	//método deposito
	public double Deposito(double deposito) {
		if (this.tipoConta == "Pf") {
			double porcentagem = deposito * 0.01;
			deposito = deposito - porcentagem;
		}else {
			double porcentagem = deposito * 0.02;
			deposito = deposito - porcentagem;
		}
		return this.saldo = this.saldo + deposito;
	}
	
	//método saque
		public void Saque(Double saque) {
			if (this.tipoConta == "Pf" && saque > this.saldo) {
				System.out.println("Sua conta é do tipo pessoa física, não é permitido sacar mais do que possui!");
			}else {
				this.saldo = this.saldo - saque;
			}
		}
		
		public void extrato() {
			System.out.println(this.saldo + " Saldo atual");
		}
}