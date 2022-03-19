package luizreis.com.github;

public class ContaBancariaPJ extends Conta {
	public ContaBancariaPJ(String nome, Double saldo, String numConta, String tipoConta) {
		super(nome, saldo, numConta, tipoConta);
	}
	
	@Override
	public void Saque(Double saque) {
		double porcentagem = saque * 0.02;
		saque += porcentagem;
		super.Saque(saque);
	}
	
	@Override
	public double Deposito(double deposito) {
		double porcentagem = deposito * 0.02;
		deposito -= porcentagem;
		return super.Deposito(deposito);
	}
	
} 