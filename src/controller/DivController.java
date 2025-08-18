package controller;

public class DivController {

	public DivController() {
		super();
	}
	
	public int resto(int n1, int n2) {
		//O ponto de parada funcao acontece quando o divisor se torna menor que o dividendo, impossibilitando a continuacao
		//do metodo de substracao sucessiva.
		if (n1 < n2) {
			return n1;
	    }
		//A funcao continua enquanto for possivel ir subtraindo o valor do divisor com o dividendo e mantendo tbm seu 
		//valor.
		return resto(n1 - n2, n2);
	}

}
