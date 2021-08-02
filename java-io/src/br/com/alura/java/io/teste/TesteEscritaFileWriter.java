package br.com.alura.java.io.teste;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// Fluxi de Entrada com um arquivo

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);

		//FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("sdsdsd9sd9sjd9j");
		bw.write(System.lineSeparator());
		bw.write("efefefef");

//		fw.close();
	}

}
