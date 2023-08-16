package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro parâmetro");
	int parametroUm = sc.nextInt();
	System.out.println("Digite o segundo parâmetro");
	int parametroDois = sc.nextInt();

	try {
		contar(parametroUm, parametroDois);
	} catch (ParametrosInvalidosException e) {
		
		e.printStackTrace();
	}
	}
	static void contar(int parametroUm, int parametroDois)  throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro"); 
		}
		int contagem = parametroDois - parametroUm;
		for (int x = 0; x < contagem; x++) {
			System.out.println("Imprimindo o número " + (x + 1) );
		}
		}
}