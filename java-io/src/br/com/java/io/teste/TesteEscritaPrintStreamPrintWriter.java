package br.com.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("jre_java.txt");
		ps.println("Java Runtime Environment");
		ps.println();
		ps.println("Java Runtime Environment significa Ambiente de "
				+ "\nTempo de Execução Java, e é utilizado para executar "
				+ "\nas aplicações da plataforma Java. É composto por "
				+ "\nbibliotecas e pela Máquina virtual Java");
		
		ps.close();
	}
}
