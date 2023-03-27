
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		{
			System.out.println("primeiro exercício" + "\n");
			System.out.printf("Olá! Adicione aqui a largura do seu terreno: ");
			Scanner sc = new Scanner(System.in);
			int largura = sc.nextInt();
			System.out.printf("Agora adicione o comprimento do seu terreno: ");
			int comprimento = sc.nextInt();
			System.out.printf("Agora adcione o valor por metro quadrado: ");
			int metroQuadrado = sc.nextInt();
			
			int area = largura * comprimento;
			int preco = area * metroQuadrado;
			
			System.out.println("Sua área é igual a: " + area);
			System.out.println("O preço é: " + preco + "\n");
//			
//			sc.close();
//			--------------------------------------------------------------------
			
			//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa
			
			System.out.println("próximo exercício" + "\n");
			System.out.println("Insira um número: ");
			int num1 = sc.nextInt();
			System.out.println("Insira outro número: ");
			int num2 = sc.nextInt();
			
			int soma = num1 + num2;
			System.out.println("Soma = " + soma + "\n");
//			
//			sc.close();
//			---------------------------------------------------------------------

//			Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
//			diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
			
			System.out.println("próximo exercício" + "\n");
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();

			int equacao = A * B - C * D;
			System.out.println("Diferenca: " + equacao);
			
			sc.close();

		}

	}

}
