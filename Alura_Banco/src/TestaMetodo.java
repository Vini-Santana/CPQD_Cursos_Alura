
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		boolean conseguiuRetirar = contaPaulo.saca(40);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		if(contaPaulo.saca(40)) {
			System.out.println("Trasnferencia com sucesso");
		}else{System.out.println("Faltou dinheiro");}
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaPaulo);
		
		contaPaulo.titular = "";
	}

}
