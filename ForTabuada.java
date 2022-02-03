public class ForTabuada {

	public static void main(String[] args) {
		int num = 1;
		int resultado;

		for (int ct = 1; ct <= 10; ct++) {
			System.out.println("===== Tabuada do " + ct + " =====");
			while (num <= 10) {
				resultado = ct * num;
				System.out.println(ct + " x " + num + " = " + resultado);
				num++;
			}
			num = 1; // Reseta o valor do contador
		}
		System.out.println("===== Fim do programa =====");
	}
}