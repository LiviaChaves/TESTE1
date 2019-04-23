
public class ContaBancaria {
   private double saldo;
   
   public void setContaBancaria(double saldo) {
	   this.saldo=saldo;
   }
   public double getContaBancaria() {
	   return this.saldo;
   }
   
   ContaBancaria(double saldo){
	   this.saldo=saldo;
   }
   
   public void depositar(double valor) {
	   try {
	   if( valor > 0) {
	   saldo= saldo + valor;
	   }else {
		  throw new DepositoInvalidoException(valor);
	   }
	  }
	   catch(DepositoInvalidoException di) {
		   System.out.println(di.getMessage());
		   
	   }
   }
   
   public void sacar(double valor) {
	   try {
	   if(valor < saldo) {
	   saldo= saldo - valor;
	   }else {
		   throw new SaqueInvalidoException(valor);
	     }
	   }
	   catch (SaqueInvalidoException si) {
		   System.out.println(si);
	   }
   }
}
