package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {
//		ContaCorrente cc1 = new ContaCorrente(22, 22);
//
//		ContaPoupanca cc2 = new ContaPoupanca(22,22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		
//		System.out.println(igual);

		ArrayList<Conta>  lista = new ArrayList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		ContaPoupanca cc2 = new ContaPoupanca(22,22);
		lista.add(cc2);
		
		ContaPoupanca cc3 = new ContaPoupanca(22,22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe?: " + existe);
	
		for(Object conta : lista) {
		System.out.println(conta);
		}
	}
}
