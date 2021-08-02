
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaMarcela = new Conta();
		
		
		contaMarcela.titular = new Cliente();
		System.out.println(contaMarcela.titular);
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
	}
}
