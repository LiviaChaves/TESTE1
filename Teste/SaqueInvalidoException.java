
public class SaqueInvalidoException extends Exception {
	private double saqueInvalido;
	
	public double getSaqueInvalidoException() {
		return this.saqueInvalido;
	}
	
	public SaqueInvalidoException(double valor) {
		super("O saque do valor" + valor + "é maior que o saldo da conta");
		saqueInvalido=valor;
	}

}
