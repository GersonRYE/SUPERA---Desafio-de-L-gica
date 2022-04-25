package Desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int qtdPalavrasFrases;
		String palavraOuFrase;
		List<String> juncaoMetadesOrdenadas = new ArrayList<>();
		List<String> primeiraMetadeOrdenada = new ArrayList<>();
		List<String> segundaMetadeOrdenada = new ArrayList<>();
		List<String> armazenaPalavraOuFrase = new ArrayList<>();
		String caractereParaString, caractereParaString1;

		System.out.println("Quantas palavras/frases quer inserir?");
		qtdPalavrasFrases = scan.nextInt();

		System.out.println("A palavras/ frases deve ter no minimo 2 e máximo 100 caracteres ");
		for (int i = 0; i < qtdPalavrasFrases; i++) {
			System.out.println("Digite a " + (i + 1) + "º palavra:");
			palavraOuFrase = scan2.nextLine();

			while (palavraOuFrase.length() < 2) {
				System.out.println("Invalido");
				System.out.println("Digite a " + (i + 1) + "º palavra:");
				palavraOuFrase = scan2.nextLine();
			}
			for (int cont = palavraOuFrase.length() / 2; cont > 0; cont--) {
				char caractere = palavraOuFrase.charAt(cont - 1);
				caractereParaString = String.valueOf(caractere);
				primeiraMetadeOrdenada.add(caractereParaString);
			}
			for (int cont = palavraOuFrase.length() - 1; cont > 1; cont--) {
				if (cont + 1 != palavraOuFrase.length() / 2) {
					char caractere = palavraOuFrase.charAt(cont);
					caractereParaString1 = String.valueOf(caractere);
					segundaMetadeOrdenada.add(caractereParaString1);
				} else {
					cont = 1;
				}
			}
			juncaoMetadesOrdenadas.addAll(primeiraMetadeOrdenada);
			juncaoMetadesOrdenadas.addAll(segundaMetadeOrdenada);
			StringBuilder convertendoEmUmaString = new StringBuilder();
			for (String m : juncaoMetadesOrdenadas) {
				convertendoEmUmaString.append(m);
			}
			armazenaPalavraOuFrase.add(convertendoEmUmaString.toString());
			primeiraMetadeOrdenada.clear();
			segundaMetadeOrdenada.clear();
			juncaoMetadesOrdenadas.clear();
		}

		System.out.println();
		System.out.println("Lista de palavras ordenadas: ");
		for (String mostrarPalavrasArmazenadas : armazenaPalavraOuFrase) {
			System.out.println(mostrarPalavrasArmazenadas);
		}
		scan.close();
		scan2.close();
	}
}
