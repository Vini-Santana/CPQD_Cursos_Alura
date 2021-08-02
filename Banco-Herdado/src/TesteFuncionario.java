
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("222.222.222-22");
		nico.setSalario(1000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
