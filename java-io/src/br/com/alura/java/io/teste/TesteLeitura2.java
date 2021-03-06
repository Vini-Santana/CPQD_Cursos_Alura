package br.com.alura.java.io.teste;
import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
//			String valorFormatado = String.format(/*new Locale("pt","BR"),*/"%s - %d-%d, %s: %06.2f", 
//													tipoConta, agencia, numero, titular, saldo);
//			System.out.println(valorFormatado);
			
			
//			System.out.println(String.format("%s - %d-%d, %s: %06.2f ", 
//					tipoConta, agencia, numero, titular, saldo));
			
			System.out.format("%s - %d-%d, %15s: %06.2f %n", 
					tipoConta, agencia, numero, titular, saldo);
			
			
//			String[] valores = linha.split(",");
//			System.out.println((valores[3]));
			
			linhaScanner.close();

		}
		scanner.close();
	}

}
