
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 36453);
		conta.setNumero(1337);
		Conta cont2a = new Conta(1337, 36453);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo //È privado
		paulo.setNome("Paulo Silveria");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
	}
}
