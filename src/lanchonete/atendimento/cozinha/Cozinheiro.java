package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL NO BALCAO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	public void prepararLache() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	public void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLache();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGRIDIENTES");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO A VITAMINA NO LIQUIDIFICADOR");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
	}
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngridientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
	
