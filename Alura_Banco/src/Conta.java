
public class Conta {
	double saldo;
	int agencia, numero;
	String titular;
	
	public void deposita(double valor)  {
		this.saldo = this.saldo + valor; 
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			 this.saldo -= valor;
			 return true;
		}
		return false;
		
	}
		 
		public void transfere(double valor, Conta destino) {
			if(valor <= this.saldo) {
				this.saldo -= valor;
				destino.saldo += valor;
				System.out.println("Novo saldo: " + destino.saldo);
			}else {
				System.out.println("Saldo insuficiente");
			}
	}
}
