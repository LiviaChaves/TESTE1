
public class DepositoInvalidoException extends Exception {
	private double depositoInvalido;
	
	public double getDepositoInvalido() {
		return this.depositoInvalido;
	}
	
	public DepositoInvalidoException (double valor) {
		super("Deposito do" + valor +"é invalida");
		depositoInvalido=valor;
	}

}
