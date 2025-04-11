package curso;

import java.util.Scanner;

import java.util.Locale;

public class main {

	public static void main(String[] args) {

		try {

			Locale.setDefault(Locale.US);

			Scanner sc = new Scanner(System.in);

			System.out.println("Escreva os valores do triângulo X:");

			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();

			System.out.println("Escreva os valores do triângulo Y:");

			double y1 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double y3 = sc.nextDouble();

			sc.close();

			double p1 = (x1 + x2 + x3) / 2;

			double p2 = (y1 + y2 + y3) / 2;

			double a1 = p1 * ((p1 - x1) * (p1 - x2) * (p1 - x3));

			double a1Raiz = Math.sqrt(a1);

			double a2 = p2 * ((p2 - y1) * (p2 - y2) * (p2 - y3));

			double a2Raiz = Math.sqrt(a2);

			System.out.printf("A area do triângulo X é: %.4f ", a1Raiz);

			System.out.printf("%nA area do triângulo Y é: %.4f ", a2Raiz);

			if (a1Raiz > a2Raiz) {
				System.out.printf("%nO triangulo com a maior area é o X.");
			} else {
				System.out.printf("%nO triangulo com a maior area é o Y.");
			}
		} catch (Exception e) {
			System.out.println("Escreva um número válido com ponto (exemplo: 3.00)");
		} finally {

		}

	}
}
