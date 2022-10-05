
public class Calculadora {
	
	static double resultado; 
	
	public static String calculadoraMultiplicar(double x, double y) {
		
		resultado = (x * y);
		
		return "O resultado de " + x + " multiplicado com " + y + " é " + resultado;
	}
	
	public static String calculadoraDividir(double x, double y) {
		
		resultado = (x / y);
		
		return "O resultado de " + x + " dividido com " + y + " é " + resultado;
	}
	
	public static String calculadoraSomar(double x, double y) {
		
		resultado = (x + y);
		
		return "O resultado de " + x + " somado com " + y + " é " + resultado;
	}
	
	public static String calculadoraSubtrair(double x, double y) {
		
		resultado = (x - y);
		
		return "O resultado de " + x + " subtraido com " + y + " é " + resultado;
	}	
	
	
}
