package luizreis.com.github;

public class ContaBancariaPJ extends Conta {
	public ContaBancariaPJ(String nome, String tipoConta, Double saldo, String numConta, Integer saquesDisponiveis) {
		super(nome, tipoConta, saldo, numConta, saquesDisponiveis);
	}
	
	
	public void sacar(Double valor) {
		System.out.println("sacar dentro classe filha");
		Double taxa = 0.02;
		if (this.saquesDisponiveis >= 1) {
			this.saldo -= valor;
			--this.saquesDisponiveis;
		} else {
			Double desconto = valor * taxa;
			this.saldo -= (valor + desconto);
		}
		
	}
}