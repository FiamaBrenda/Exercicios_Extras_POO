/**
.Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo desconto.  Faça um programa que possa entrar com o nome de um produto e seu valor unitário e calcular e exibir um novo valor com um desconto de 9%.
**/
import java.util.Scanner;
public class Descontos {
	public static void main(String[] args) {
		Float valorDesc,
			  valorUnit;
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do produto sem espaços: ");
		nome = entrada.nextLine();
		System.out.println("Digite o valor unitário do produto: ");
		valorUnit = entrada.nextFloat();
		
		valorDesc = valorUnit - valorUnit * (float) 0.09;
		System.out.println("O produto: " + nome + " detinha o valor de: " + valorUnit   + " sem desconto, com desconto o valor é de: " + valorDesc); 
entrada.close();
	}
}
