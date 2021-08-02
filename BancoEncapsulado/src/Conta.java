
public class Conta {
	private double saldo;
	private int agencia, numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Esotu criando uma conta");
		
	}
	
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
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			 if(agencia <= 0 ) {
				 System.out.println("O numero precisa ser positivo");
			 }
			this.agencia = agencia;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return total;
		}
}
