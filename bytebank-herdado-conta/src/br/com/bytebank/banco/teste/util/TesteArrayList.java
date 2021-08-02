package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {
	public static void main(String[] args) {
	
		List<Conta>  lista = new LinkedList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		ContaPoupanca cc2 = new ContaPoupanca(22,22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		ContaCorrente cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		ContaPoupanca cc4 = new ContaPoupanca(33,322);
		lista.add(cc4);
		
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(lista.get(i));
		}
		System.out.println("---------");
		for(Object oRef : lista) {
		System.out.println(oRef);
		}
	}
}
