
public class Conta {
	private double saldo;
	private int agencia, numero;
	Cliente titular;
	
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
		
		public double getSaldo() {
			return this.saldo;
		}
		
}
