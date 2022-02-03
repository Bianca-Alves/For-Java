public class ForPrimos {

	public static void main(String[] args) {
		int numPrimo = 0;

		for (int cp = 1; cp <= 200; cp++) {
			if (cp % 1 == 0 || cp % cp == 0) {
				numPrimo = cp;
				System.out.println(numPrimo);
				numPrimo = 0; // Reseta o valor da variável
			} else {
				continue;
			}
		}
	}
}