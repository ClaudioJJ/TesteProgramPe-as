import java.util.Scanner;

public class TestePeças {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int cd1, n1, cd2, n2;
		double vu1, vu2, pag1, pag2, total;
		System.out.println("Qual o código da peça1? ");
		cd1 = sc.nextInt();
		System.out.println("Quantas peças1 você irá comprar? ");
		n1 = sc.nextInt();
		System.out.println("Qual o valor unitário das peças1? ");
		vu1 = sc.nextDouble();

		System.out.println("Qual o código da peça2? ");
		cd2 = sc.nextInt();
		System.out.println("Quantas peças2 você irá comprar? ");
		n2 = sc.nextInt();
		System.out.println("Qual o valor unitário das peças2? ");
		vu2 = sc.nextDouble();

		pag1 = n1 * vu1;
		pag2 = n2 * vu2;
		total = pag1 + pag2;

		System.out.println("O valor total a ser cobrado pelas peças é: " + total);

		sc.close();
	}

}
