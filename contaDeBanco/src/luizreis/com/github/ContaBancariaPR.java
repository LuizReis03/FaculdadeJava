package luizreis.com.github;

import luizreis.com.github.projeto.banco.interfaces.IDetalhesConta;

public class ContaBancariaPR extends Conta implements IDetalhesConta {
	public ContaBancariaPR(String nome, Double saldo, String numConta, String tipoConta, String porte) {
		super(nome, saldo, numConta, tipoConta);
	}
	
	private int qtdeSaque = 0;
	
	@Override
	public void Saque(Double saque) {
		if (this.qtdeSaque >= 3){
			double porcentagem = saque * 0.015;
			saque += porcentagem;
			super.Saque(saque);
			return;
		}
		super.Saque(saque);
		this.qtdeSaque++;
	}
	
	@Override
	public double Deposito(double deposito) {
		if(deposito <= 1000) {
			double porcentagem = deposito * 0.008;
			deposito -= porcentagem;
			return super.Deposito(deposito);
		}
		return super.Deposito(deposito);
	}
		
	@Override
	public void detalhes() {
		
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Titular " + this.getNome());
		System.out.println("Tipo " + this.getTipoConta());
		System.out.println("Saldo " + this.getSaldo());
		
	}
}