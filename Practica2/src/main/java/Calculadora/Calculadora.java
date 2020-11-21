package Calculadora;

import java.util.Scanner;

public abstract class Calculadora {
	private double num1, num2;
	Scanner leer = new Scanner(System.in);

	public Calculadora() {
		System.out.println("Clase Calculadora \n");
	}

	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double Suma(double n1, double n2) {
		return n1 + n2;
	}

	public double Resta(double n1, double n2) {
		return n1 - n2;
	}

	public double Multiplicacion(double n1, double n2) {
		return n1 * n2;
	}

	public String Division(double n1, double n2) {
		if (n2 != 0) {
			return "" + n1 / n2;
		} else {
			return "ERROR, no se puede dividir entre cero!";
		}
	}

	public void Resultado() {
		int opcion = 0;
		System.out.println("Que Desea Realizar? \nDigite: \n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
		opcion = leer.nextInt();
		if (opcion == 1) {
			System.out.println("El Resultado de la Suma es: " + Suma(num1, num2));
		} else if (opcion == 2) {
			System.out.println("El Resultado de la Resta es: " + Resta(num2, num2));
		} else if (opcion == 3) {
			System.out.println("El Resultado de la Multiplicacion es: " + Multiplicacion(num2, num2));
		} else if (opcion == 4) {
			System.out.println("El Resultado de la Division es: " + Division(num1, num2));
		} else {
			System.out.println("Opcion no valida! Solo del 1 al 4");
		}
	}
	
	public abstract String Mensaje();
	
	
}
