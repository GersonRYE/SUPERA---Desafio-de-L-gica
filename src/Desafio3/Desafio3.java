package Desafio3;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int valor, qtdNumeros, cont = 0;

		System.out.println("Insira um valor: ");
		valor = scan.nextInt();

		System.out.println("Quantos números quer inserir? ");
		qtdNumeros = scan.nextInt();
		int listaNumeros[] = new int[qtdNumeros];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º elemento");
			listaNumeros[i] = scan.nextInt();
			
			while(listaNumeros[i]<=0) {
				System.out.println("Inválido! Digite valores positivos");
				System.out.println("Digite o " + (i + 1) + "º elemento");
				listaNumeros[i] = scan.nextInt();
			}
		}

		for (int i = 0; i < listaNumeros.length; i++) {
			for (int j = 0; j < listaNumeros.length; j++) {
				if (listaNumeros[j] > listaNumeros[i] ) {
					int resultadoSubtracao = (listaNumeros[j] - listaNumeros[i]);
					if (resultadoSubtracao == valor) {
						cont++;
					}
				}
			}
		}
		scan.close();

		System.out.println("Quantidade de resultados que satisfazem o critério: " + cont);

	}
}


