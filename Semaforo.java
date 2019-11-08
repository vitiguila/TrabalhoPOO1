
public class Semaforo {
	static int cor = 2;
	
	static void MudaProximaCor() {
		if (cor == 2) {
			cor = 0;
		}
		else {
			cor += 1;
		}
	}
	static void MudaCorFixa(int corAtual) {
		cor = corAtual;
	}
	static String MostraCor () {
		String corSinal = "";
		switch (cor) {
		case 0:
			corSinal = "Verde";
			break;
		case 1:
			corSinal = "Amarelo";
			break;
		case 2:
			corSinal = "Vermelho";
			break;
		}
		return "O sinal esta " + corSinal;
	}
}
