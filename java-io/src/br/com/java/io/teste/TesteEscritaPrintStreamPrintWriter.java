package br.com.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("jre_java.txt");
		ps.println("Java Runtime Environment");
		ps.println();
		ps.println("Java Runtime Environment significa Ambiente de "
				+ "\nTempo de Execu��o Java, e � utilizado para executar "
				+ "\nas aplica��es da plataforma Java. � composto por "
				+ "\nbibliotecas e pela M�quina virtual Java");
		
		ps.close();
	}
}
