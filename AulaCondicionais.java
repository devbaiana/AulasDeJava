import java.util.Scanner;

public class AulaCondicionais {

	public static void main(String[] args) {
		System.out.println("Primeiro exercício, descubra se seu número é negativo ou nao" + "\n");
		System.out.println("Insira o número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Número negativo" + "\n"); }
			else {
				System.out.println("Número positivo" + "\n");
			}
		System.out.println("Segundo exercício, insira seu número para saber se é impar ou par" + "\n");
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("par" + "\n"); }
			else {
				System.out.println("ímpar" + "\n");
			}
		
		 System.out.println("Terceiro exercício, Insira dois números e descubra se eles sao múltiplos!" + "\n");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 if (a % b == 0 || b % a == 0) {
			 System.out.println("sao multiplos");
		 } else {
			 System.out.println("nao sao multiplos");
		 }
		sc.close();
		}
		
		}

		
	
