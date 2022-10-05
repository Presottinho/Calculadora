import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nrOperacao;
		double x, y;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual operação você deseja escolher? 1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir.");
		nrOperacao = sc.nextInt();
		
		System.out.println("Qual o primeiro número da conta? ");
		x = sc.nextDouble();
		
		System.out.println("Qual o segundo número da conta? ");
		y = sc.nextDouble();
		
		if(nrOperacao == 1) {
			System.out.println(Calculadora.calculadoraSomar(x, y)); 
		}else if(nrOperacao == 2) {
			System.out.println(Calculadora.calculadoraSubtrair(x, y)); 
		}else if(nrOperacao == 3) {
			System.out.println(Calculadora.calculadoraMultiplicar(x, y)); 
		}else {
			System.out.println(Calculadora.calculadoraDividir(x, y));
		}		
		
		sc.close();
		
	}

}
