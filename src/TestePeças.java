import java.util.Scanner;

public class TestePe�as {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int cd1, n1, cd2, n2;
		double vu1, vu2, pag1, pag2, total;
		System.out.println("Qual o c�digo da pe�a1? ");
		cd1 = sc.nextInt();
		System.out.println("Quantas pe�as1 voc� ir� comprar? ");
		n1 = sc.nextInt();
		System.out.println("Qual o valor unit�rio das pe�as1? ");
		vu1 = sc.nextDouble();

		System.out.println("Qual o c�digo da pe�a2? ");
		cd2 = sc.nextInt();
		System.out.println("Quantas pe�as2 voc� ir� comprar? ");
		n2 = sc.nextInt();
		System.out.println("Qual o valor unit�rio das pe�as2? ");
		vu2 = sc.nextDouble();

		pag1 = n1 * vu1;
		pag2 = n2 * vu2;
		total = pag1 + pag2;

		System.out.println("O valor total a ser cobrado pelas pe�as �: " + total);

		sc.close();
	}

}
