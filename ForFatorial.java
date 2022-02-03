import java.util.Scanner;

public class ForFatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = 1;
		int num = 1;
		int numero;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		for (num = 1; num <= numero; num++) {

			fat *= num;

			System.out.println("!" + num + " = " + fat);
			sc.close();
		}
	}
}