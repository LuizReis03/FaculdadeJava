package luizreis.com.github;

public class Aplicativo {

	public static void main(String[] args) {
		//cria novas contas
		Conta contaLuiz = new Conta("Pf", "Luiz Henrique", 0.0);
		Conta contaEmp = new Conta("Pj", "Bosch", 0.0);
		
		//aplica os m�todos de dep�sito
		contaLuiz.Deposito(36500.00);
		contaEmp.Deposito(36500.00);
		
		//aplica os m�todos de saque
		contaLuiz.Saque(40200.00);
		contaEmp.Saque(40200.00);


	}

}