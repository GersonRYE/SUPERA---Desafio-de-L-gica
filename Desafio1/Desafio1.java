package Desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtdNumeros, numeroParOuImpar;

		List<Integer> listaNumerosPares = new ArrayList<>();
		List<Integer> listaNumerosImpares = new ArrayList<>();
		List<Integer> juncaoListaNumerosParesCrescenteImparesDecrescente = new ArrayList<>();

		System.out.println("Quantos números quer inserir? ");
		qtdNumeros = scan.nextInt();

		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Insira o " + (i + 1) + "º numero ");
			numeroParOuImpar = scan.nextInt();

			while (numeroParOuImpar < 0) {
				System.out.println("Inválido! Apenas números positivos inteiros!");
				System.out.println("Insira o " + (i + 1) + "º número ");
				numeroParOuImpar = scan.nextInt();
			}

			if (numeroParOuImpar % 2 == 0) {
				listaNumerosPares.add(numeroParOuImpar);
				Collections.sort(listaNumerosPares);
			} else {
				listaNumerosImpares.add(numeroParOuImpar);
				Collections.sort(listaNumerosImpares, Collections.reverseOrder());
			}
		}
		scan.close();
		juncaoListaNumerosParesCrescenteImparesDecrescente.addAll(listaNumerosPares);
		juncaoListaNumerosParesCrescenteImparesDecrescente.addAll(listaNumerosImpares);
		
		System.out.println();
		System.out.println("Lista de numeros pares em ordem crescente e impares em ordem decrescente: ");
		for (int mostrarJuncaoListaParesCrescenteImparesCrescente : juncaoListaNumerosParesCrescenteImparesDecrescente) {
			System.out.println(mostrarJuncaoListaParesCrescenteImparesCrescente);
		}

	
	}

}
