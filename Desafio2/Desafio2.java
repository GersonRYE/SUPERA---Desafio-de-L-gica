package Desafio2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double valor, valor0, valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10, valor11;
		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota05 = 0, nota02 = 0, moeda01 = 0, moeda050 = 0,
				moeda025 = 0, moeda010 = 0, moeda005 = 0, moeda001 = 0;

		System.out.println("Entre com um valor R$:");
		valor = scan.nextDouble();
		BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
		valor0 = bd.doubleValue();

		while (valor0 >= 100) {
			valor0 -= 100;
			nota100++;
		}

		valor1 = valor0;
		while (valor1 >= 50.00 && valor1 < 100.00) {
			valor1 -= 50.00;
			nota50++;
		}

		valor2 = valor1;
		while (valor2 >= 20.00 && valor2 < 50.00) {
			valor2 -= 20.00;
			nota20++;
		}

		valor3 = valor2;
		while (valor3 >= 10.00 && valor3 < 20.00) {
			valor3 -= 10.00;
			nota10++;
		}

		valor4 = valor3;
		while (valor4 >= 5.00 && valor4 < 10.00) {
			valor4 -= 5.00;
			nota05++;
		}

		valor5 = valor4;
		while (valor5 >= 2.00 && valor5 < 5.00) {
			valor5 -= 2.00;
			nota02++;
		}

		valor6 = valor5;
		while (valor6 >= 1.00 && valor6 < 2.00) {
			valor6 -= 1.00;
			moeda01++;
		}

		valor7 = valor6;
		while (valor7 >= 0.50 && valor7 < 1) {
			valor7 -= 0.50;
			moeda050++;
		}

		valor8 = valor7;
		while (valor8 >= 0.25 && valor8 < 0.50) {
			valor8 -= 0.25;
			moeda025++;
		}

		valor9 = valor8 + 0.001;
		while (valor9 >= 0.10 && valor9 < 0.25) {
			valor9 -= 0.10;
			moeda010++;
		}

		valor10 = valor9 + 0.001;
		while (valor10 >= 0.05 && valor10 < 0.10) {
			valor10 -= 0.05;
			moeda005++;
		}

		valor11 = valor10;
		while (valor11 >= 0.01 && valor11 < 0.05) {
			valor11 -= 0.01;
			moeda001++;
		}

		scan.close();
		System.out.println("Notas e moedas referente ao valor inserido:");
		System.out.println("Notas:");
		System.out.println(nota100 + " Nota(s) de R$ 100,00");
		System.out.println(nota50 + " Nota(s) de R$ 50,00");
		System.out.println(nota20 + " Nota(s) de R$ 20,00");
		System.out.println(nota10 + " Nota(s) de R$ 10,00");
		System.out.println(nota05 + " Nota(s) de R$ 5,00");
		System.out.println(nota02 + " Nota(s) de R$ 2,00");
		System.out.println("Moedas:");
		System.out.println(moeda01 + " Moeda(s) de R$ 1,00");
		System.out.println(moeda050 + " Moeda(s) de R$ 0,50");
		System.out.println(moeda025 + " Moeda(s) de R$ 0,25");
		System.out.println(moeda010 + " Moeda(s) de R$ 0,10");
		System.out.println(moeda005 + " Moeda(s) de R$ 0,05");
		System.out.println(moeda001 + " Moeda(s) de R$ 0,01");
	}
}
