package luizreis.com.github;

public class Aplicativo {

	public static void main(String[] args) {
		
		Conta contaEmp = new ContaBancariaPJ("Bosch", 0.0, "175156", "Pj");
		Conta contaPessoal = new ContaBancariaPF("Luiz", 100.0, "175656", "Pf");
		Conta contaRural = new ContaBancariaPR("Rural", 100.0, "168656", "Pr", "Pequeno Porte");
		
		contaRural.Saque(30.0);
		contaRural.detalhes();
		

	}

}