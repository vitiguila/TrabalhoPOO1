
public class Controle {

	public static void main(String[] args) {
		System.out.println(Semaforo.MostraCor());
		
		int acc = 10;
		while(acc > 0) {
			Semaforo.MudaProximaCor();
			System.out.println(Semaforo.MostraCor());
			acc --;
		}
		
		Semaforo.MudaCorFixa(1);
		System.out.println(Semaforo.MostraCor());
	}

}
