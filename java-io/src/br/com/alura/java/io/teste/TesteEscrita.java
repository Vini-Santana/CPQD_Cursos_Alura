package br.com.alura.java.io.teste;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxi de Entrada com um arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);

		bw.write("sdsdsd9sd9sjd9j");
		bw.newLine();
		bw.newLine();
		bw.write("efefefef");
		
	
		bw.close();
	}

}
