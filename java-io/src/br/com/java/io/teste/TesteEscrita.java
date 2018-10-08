package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		OutputStream fas = new FileOutputStream("arquivoTeste.txt");
		Writer isr = new OutputStreamWriter(fas);
		BufferedWriter bw = new BufferedWriter(isr);
		bw.write("Java é uma linguagem de programação orientada a objetos "
				+ "\nque começou a ser criada em 1991, na Sun Microsystems");
		bw.newLine();
		bw.write("Teve inicio com o Green Project, no qual os mentores "
				+ "\nforam Patrick Naughton, Mike Sheridan, e James Gosling.");

		bw.close();
	}
}

