
public class TesteContaBancaria {

	public static void main (String[]args) {
		ContaBancaria cb = new ContaBancaria(5259);
		
		cb.depositar(233);
		cb.sacar(200);
		cb.sacar(6000);
	}
}
