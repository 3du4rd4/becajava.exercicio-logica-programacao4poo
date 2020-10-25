package logipro4;

import java.util.Scanner;

public class ExercicioPoo4 {

	private double delta;
	private double resultadoX1;
	private double resultadoX2;
	
	private double a;
	private double b;
	private double c;
	
	public Scanner num = new Scanner(System.in);

	
	public double getA() {
		return a;
		
	}
	public void setA(double a) {
		this.a = a;	
	}
	
	public double getB() {
		return b;
		
	}
	public void setB(double b) {
		this.b = b;	
	}
	public double getC() {
		return c;
		
	}
	public void setC(double c) {
		this.c = c;	
	}
	

	public void Valores() {

		System.out.print("Insira o valor de a: ");
		a = num.nextDouble();

		System.out.print("Insira o valor de b: ");
		b = num.nextDouble();

		System.out.print("Insira o valor de c: ");
		c = num.nextDouble();

		delta = delta = Math.pow(b, 2) - (4 * (a * c));
		
		System.out.println("Valor Delta " + delta);

		if (delta < 0) {
		System.out.println("Numeros negativos não possuem raiz quadrada!");
		}

		else {
		
		double resultadoX1;
		resultadoX1 = (-b + Math.sqrt(delta)) / (2 * a);
		

		double resultadoX2;
		resultadoX2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Valor de x1 = " + resultadoX1 +", "+ "valor x2 "+ resultadoX2);
		}

	}

}
