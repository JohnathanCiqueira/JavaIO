package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEsritaFileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("java.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Java é uma linguagem de programação orientada"
				+ "\n a objetos desenvolvida na década de 90 ");
		bw.write(System.lineSeparator());//pula linha
		bw.newLine();//pula linha
		bw.write("por uma equipe de programadores chefiada por "
				+ "\nJames Gosling, na empresa Sun Microsystems");
		
		bw.close();
	}
}
