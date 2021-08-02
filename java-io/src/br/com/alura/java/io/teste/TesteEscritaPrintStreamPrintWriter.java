package br.com.alura.java.io.teste;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		// Fluxi de Entrada com um arquivo

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);

		//FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8"); 
		
		ps.println("sdsdsd9sd9çç");
		ps.println();
		ps.println("rtrtrtrtrt");

		ps .close();
	}

}
