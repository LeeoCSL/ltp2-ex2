package ex2;

import java.util.Scanner;

public class ex2 {
	static int soma = 0;
	static int media;
	static int numeros[] = new int[20];
	static Scanner sc = new Scanner(System.in);
	static String recomecar = "";
	static String novamente = "";
	public static void main(String args[]) {
		
		digitarNumeros();
		
	}
	
	public static void digitarNumeros() {
		for(int i = 0; i<20; i++) {
			int indice = i+1;
			System.out.println("Digite o "+ indice+"º número");
			try{
				numeros[i] = sc.nextInt();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				digitouErrado();
			}
		}
		calculaMedia();
	}

public static void digitouErrado() {
	System.out.println("Voce digitou algo invalido, deseja recomeçar?(S/N)");
	recomecar = sc.next();
	if(recomecar.equalsIgnoreCase("s")) {
		digitarNumeros();
	}else if(recomecar.equalsIgnoreCase("n")) {
		
	}else {
		digitouErrado();
	}
}
	public static void calculaMedia() {
		for(int j = 0; j <20; j++) {
			soma = soma + numeros[j];
		}
		media = soma/20;
		System.out.println("A média é: "+ media + ".");
		System.out.println("Deseja tentar novamente? (S/N)");
		novamente = sc.next();
		if(novamente.equalsIgnoreCase("s")) {
			digitarNumeros();
		}else if(novamente.equalsIgnoreCase("n")) {
			
		}else {
			digitouErrado();
		}
	}
}
